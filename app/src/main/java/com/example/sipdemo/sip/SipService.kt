package com.example.sipdemo.sip

import android.app.Service
import android.content.Intent
import android.os.Build
import android.os.Handler
import android.os.IBinder
import android.util.Log
import com.example.sipdemo.data.db.MyRoomDatabase
import com.example.sipdemo.ui.MainActivity
import org.pjsip.pjsua2.*
import timber.log.Timber

/**
 * @Author: Wajid.Ali
 * @Date: 8/24/2021
 */
class SipService : Service() {

    companion object{
        private var instance : SipService? = null
        fun getInstance() : SipService{
            return instance!!
        }
    }

    lateinit var epConfig: EpConfig
    lateinit var transportConfig: TransportConfig
    lateinit var accountConfig: AccountConfig
    lateinit var acc: SipAccountExt
    lateinit var endPoint: LocalEndPoint

    override fun onBind(intent: Intent?): IBinder? {
      return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return START_STICKY
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        initSip()
    }

    override fun onDestroy() {
        disposeSip()
        instance = null
        super.onDestroy()
    }

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

            endPoint.libInit(epConfig)

            transportConfig = TransportConfig()
            transportConfig.port = sipAccount.port.toLongOrNull() ?: 5061
            val transportType: pjsip_transport_type_e = sipAccount.getTransportTypeInPJSipTerms()
            transportConfig.tlsConfig.verifyServer = false
            endPoint.transportCreate(transportType, transportConfig)
            endPoint.libStart()
            endPoint.codecSetPriority("*",0)
            endPoint.codecSetPriority("PCMA/8000/1",255)
            endPoint.codecSetPriority("PCMU/8000/1",255)

            val accountConfig = AccountConfig()
            accountConfig.idUri =
                "sip:${sipAccount.userName}@${sipAccount.domain}"//example --> "sip:test@pjsip.org"
            accountConfig.regConfig.registrarUri =
                "sip:${sipAccount.domain}"//example --> "sip:sip:pjsip.org"
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
            accountConfig.regConfig.registerOnAdd = true

            acc = SipAccountExt()
            acc.create(accountConfig, true)
        }, 3000)

    }

    private fun disposeSip() {
        Timber.e("Disposing sip")
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