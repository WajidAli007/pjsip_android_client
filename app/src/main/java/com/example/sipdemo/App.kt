package com.example.sipdemo

import android.os.Build
import androidx.multidex.MultiDexApplication
import com.example.sipdemo.sip.SipService
import timber.log.Timber

/**
 * @Author: Wajid.Ali
 * @Date: 8/16/2021
 */
class App : MultiDexApplication() {

    companion object{
        private var instance : App? = null

        public fun getInstance() : App{
            return instance!!
        }
    }

    override fun onCreate() {
        super.onCreate()
        instance = this

        Timber.plant(Timber.DebugTree())

        if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.KITKAT) {
            // only for gingerbread and newer versions
            Timber.e("loaidng pjsua22 for kitkat and lower versions")
            System.loadLibrary("pjsua22")
        } else {
            Timber.e("loading pjsua for higher versions than kitkat")
            System.loadLibrary("pjsua2")
            Timber.e("Library loaded...")
        }
    }

    override fun onTerminate() {
        super.onTerminate()
        instance = null
        SipService.getInstance().killService()
    }

}