package com.example.sipdemo.ui

import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.sipdemo.R
import com.example.sipdemo.data.db.MyRoomDatabase
import com.example.sipdemo.databinding.ActivityMainBinding
import com.example.sipdemo.sip.LocalEndPoint
import com.example.sipdemo.sip.SipAccountExt
import com.google.android.material.bottomnavigation.BottomNavigationView
import org.pjsip.pjsua2.*
import timber.log.Timber


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        initSip()
    }

    override fun onDestroy() {
        super.onDestroy()
        disposeSip()
    }

    lateinit var endPoint: LocalEndPoint
    lateinit var epConfig: EpConfig
    lateinit var transportConfig: TransportConfig
    lateinit var accountConfig: AccountConfig
    lateinit var acc: SipAccountExt

    private fun initSip() {
        //lets load pjsip

        Handler().postDelayed({
            val sipAccount = MyRoomDatabase.db.sipAccountDao().getSipAccounts()[0]
            val userAgent = String.format(
                "SIP Client/%s (%s %s; Android %s)",
                1.1,
                Build.MANUFACTURER,
                Build.MODEL,
                Build.VERSION.RELEASE
            )

            endPoint = LocalEndPoint()
            endPoint.libCreate()

            val epConfig = EpConfig()
            epConfig.logConfig.consoleLevel = Log.VERBOSE.toLong()


            val writer = LogWriter()

            epConfig.logConfig.decor = 0
            epConfig.logConfig.msgLogging = 1
            epConfig.logConfig.level = 5
            epConfig.logConfig.consoleLevel = 5
            epConfig.logConfig.writer = writer

//            epConfig.logConfig.level = Log.VERBOSE.toLong()
//            epConfig.
            endPoint.libInit(epConfig)

            transportConfig = TransportConfig()
            transportConfig.port = sipAccount.port.toLongOrNull() ?: 5061
            val transportType: pjsip_transport_type_e = sipAccount.getTransportTypeInPJSipTerms()
            transportConfig.tlsConfig.verifyServer = false
            endPoint.transportCreate(transportType, transportConfig)
            endPoint.libStart()

            val accountConfig = AccountConfig()
            accountConfig.idUri =
                "sip:${sipAccount.userName}@${sipAccount.domain}"//example --> "sip:test@pjsip.org"
            accountConfig.regConfig.registrarUri =
                "sip:${sipAccount.domain}"//example --> "sip:sip:pjsip.org"
//            val cred = accountConfig.sipConfig.authCreds
            accountConfig.sipConfig.authCreds.clear()
            accountConfig.sipConfig.authCreds.add(
                AuthCredInfo(
                    "digest",
                    "*",
                    sipAccount.userName,
                    0,
                    sipAccount.password
                )
            )
            accountConfig.sipConfig.proxies?.add("sip:" + sipAccount.domain + ";hide;transport=tls")
//            accountConfig.sipConfig.authCreds.add(cred)
            accountConfig.regConfig.registerOnAdd = true

            acc = SipAccountExt()
            acc.create(accountConfig, true)
            acc.mainActivity = this
        }, 3000)

    }

    private fun disposeSip() {
        Timber.e("Disposing sip")
        acc.mainActivity = null
        acc.delete()
        endPoint.libDestroy()
        endPoint.delete()
    }


    private class LogWriter : org.pjsip.pjsua2.LogWriter() {
        override fun write(entry: LogEntry?) {
            val message = entry?.msg
            Log.v("pjsip", message ?: "empty log message from sip")
        }
    }


}