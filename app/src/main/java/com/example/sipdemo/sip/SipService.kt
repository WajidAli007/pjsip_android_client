package com.example.sipdemo.sip

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.content.Intent
import android.os.Build
import android.os.IBinder
import android.util.Log
import androidx.core.app.NotificationCompat
import com.example.sipdemo.R
import com.example.sipdemo.data.db.MyRoomDatabase
import org.pjsip.pjsua2.*
import timber.log.Timber


/**
 * @Author: Wajid.Ali
 * @Date: 8/24/2021
 */
class SipService : Service() {

    companion object {
        private var instance: SipService? = null
        fun getInstance(): SipService {
            return instance!!
        }
    }

    lateinit var epConfig: EpConfig
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
        startForeground(10000, notification())
        initSip()
    }

    override fun onDestroy() {
        disposeSip()
        instance = null
        super.onDestroy()
    }

    private fun initSip() {
        //lets load pjsip
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
        epConfig.uaConfig.userAgent = userAgent

//        epConfig.medConfig.hasIoqueue = true
//        epConfig.medConfig.clockRate = 16000
//        epConfig.medConfig.quality = 10
//        epConfig.medConfig.ecOptions = 1
//        epConfig.medConfig.ecTailLen = 200
//        epConfig.medConfig.threadCnt = 2

//        epConfig.logConfig.consoleLevel = Log.VERBOSE.toLong()
//        epConfig.logConfig.decor = 0
//        epConfig.logConfig.msgLogging = 1
//        epConfig.logConfig.level = 5
//        epConfig.logConfig.consoleLevel = 5
//        epConfig.logConfig.writer = SipService.LogWriter()

        endPoint.libInit(epConfig)


//        ----------------------------------------------------------------------------

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
//        accountConfig.regConfig.registerOnAdd = true
//        accountConfig.mediaConfig.transportConfig.tlsConfig.method = pjsip_ssl_method.PJSIP_TLSV1_METHOD
        accountConfig.mediaConfig.transportConfig.tlsConfig.verifyClient = false
        accountConfig.mediaConfig.transportConfig.tlsConfig.verifyServer = false
        accountConfig.mediaConfig

//        ----------------------------------------------------------------------------

//        val tlsConfig = TransportConfig()
//        tlsConfig.qosType = pj_qos_type.PJ_QOS_TYPE_VOICE
//        tlsConfig.port = sipAccount.port.toLongOrNull() ?: 5061
//        tlsConfig.tlsConfig.verifyServer = false
//        tlsConfig.tlsConfig.verifyClient = false

        endPoint.transportCreate(pjsip_transport_type_e.PJSIP_TRANSPORT_TLS, accountConfig.mediaConfig.transportConfig)

        endPoint.libStart()

        endPoint.codecSetPriority("OPUS", (CodecPriority.PRIORITY_MAX - 1).toShort())
        endPoint.codecSetPriority("PCMA/8000", (CodecPriority.PRIORITY_MAX - 2).toShort())
        endPoint.codecSetPriority("PCMU/8000", (CodecPriority.PRIORITY_MAX - 3).toShort())
        endPoint.codecSetPriority("G729/8000", CodecPriority.PRIORITY_DISABLED.toShort())
        endPoint.codecSetPriority("speex/8000", CodecPriority.PRIORITY_DISABLED.toShort())
        endPoint.codecSetPriority("speex/16000", CodecPriority.PRIORITY_DISABLED.toShort())
        endPoint.codecSetPriority("speex/32000", CodecPriority.PRIORITY_DISABLED.toShort())
        endPoint.codecSetPriority("GSM/8000", CodecPriority.PRIORITY_DISABLED.toShort())
        endPoint.codecSetPriority("G722/16000", CodecPriority.PRIORITY_DISABLED.toShort())
        endPoint.codecSetPriority("G7221/16000", CodecPriority.PRIORITY_DISABLED.toShort())
        endPoint.codecSetPriority("G7221/32000", CodecPriority.PRIORITY_DISABLED.toShort())
        endPoint.codecSetPriority("ilbc/8000", CodecPriority.PRIORITY_DISABLED.toShort())



        acc = SipAccountExt()
        acc.create(accountConfig, true)

    }

    fun makeCall(sipAddress: String) {
        val call = CallExt(acc, isOutgoing = true)
        val options = CallOpParam()
        call.makeCall(sipAddress, options)
    }

    private fun disposeSip() {
        Timber.e("Disposing sip")
        acc.delete()
        endPoint.libDestroy()
        endPoint.delete()
    }

    private fun notification(): Notification {
        createChannel()
        return NotificationCompat.Builder(this, "channel_sip")
            .setSmallIcon(R.mipmap.ic_launcher_round)
            .setContentTitle("Sip Demo")
            .setContentText("Your connection to SIP server is safe")
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setCategory(NotificationCompat.CATEGORY_MESSAGE)
            .build()
    }

    private fun createChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel1 = NotificationChannel(
                "channel_sip",
                "To keep your connectivity to server alive, let this notification be shown",
                NotificationManager.IMPORTANCE_HIGH
            )

            val manager = getSystemService(NotificationManager::class.java)
            manager.createNotificationChannel(channel1)
        }
    }

    override fun onTaskRemoved(rootIntent: Intent?) {
        killService()
        super.onTaskRemoved(rootIntent)
    }

    fun killService() {
        disposeSip()
        stopSelf()
    }


    private open class LogWriter : org.pjsip.pjsua2.LogWriter() {

        override fun write(entry: LogEntry?) {
            Timber.e("PJSIP, LEVEL: ${entry?.level}, Message: ${entry?.msg}, Thread: ${entry?.threadName}")
        }
    }
}