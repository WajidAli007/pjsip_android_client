package com.example.sipdemo.ui

import android.content.Intent
import android.graphics.Color
import android.graphics.ColorFilter
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
import com.example.sipdemo.base.BaseActivity
import com.example.sipdemo.data.db.MyRoomDatabase
import com.example.sipdemo.databinding.ActivityMainBinding
import com.example.sipdemo.sip.LocalEndPoint
import com.example.sipdemo.sip.SipAccountExt
import com.example.sipdemo.sip.SipService
import com.example.sipdemo.ui.call.CallActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import org.pjsip.pjsua2.*
import timber.log.Timber


class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)

        navView.setupWithNavController(navController)

        startService(Intent(this, SipService::class.java))
    }


    override fun newCall() {
        startActivity(Intent(this, CallActivity::class.java))
    }

    override fun connectionEstablished() {
        binding.tvStatus.text = "Connected"
        binding.ivConnectivity.setColorFilter(Color.GREEN)
    }

}