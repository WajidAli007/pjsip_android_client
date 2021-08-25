package com.example.sipdemo.ui.call

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sipdemo.R
import com.example.sipdemo.base.BaseActivity
import com.example.sipdemo.databinding.ActivityCallBinding
import com.example.sipdemo.sip.SipAccountExt

class CallActivity : BaseActivity() {

    val binding : ActivityCallBinding by lazy{
        ActivityCallBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        if(SipAccountExt.inProgressCall == null){
            finish()
            return
        }

        val remoteUris = SipAccountExt.inProgressCall?.info?.remoteUri?.split(" ")
        binding.tvNameOfCaller.text = remoteUris?.get(0)?.removeSurrounding("\"") ?: "User Name"
        binding.tvSipAddress.text = remoteUris?.get(1)?.removePrefix("<")?.removeSuffix(">") ?: "User Sip Address"

        binding.btnAcceptCall.setOnClickListener {
            SipAccountExt.inProgressCall?.acceptCall()
        }

        binding.btnRejectCall.setOnClickListener {
            SipAccountExt.inProgressCall?.rejectCall()
        }

    }

    override fun callDisconnected() {
        SipAccountExt.inProgressCall = null
        finish()
    }

    override fun callStateConfirmed() {

    }

    override fun connecting() {

    }
}