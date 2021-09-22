package com.example.sipdemo.ui.call

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.example.sipdemo.base.BaseActivity
import com.example.sipdemo.data.db.MyRoomDatabase
import com.example.sipdemo.data.db.entities.Calls
import com.example.sipdemo.data.db.entities.SipAccount
import com.example.sipdemo.data.db.enums.Direction
import com.example.sipdemo.databinding.ActivityCallBinding
import com.example.sipdemo.sip.SipAccountExt
import com.example.sipdemo.sip.SipService
import com.example.sipdemo.utils.SipUtils
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import timber.log.Timber

class CallActivity : BaseActivity() {

    companion object {

        private const val SIP_ADDRESS_EXTRA_KEY = "SIP_ADDRESS_EXTRA_KEY"
        private const val SIP_OUTGOING_EXTRA_KEY = "SIP_OUTGOING_EXTRA_KEY"

        fun createIntent(
            baseActivity: BaseActivity,
            sipAddress: String?,
            isOutgoing: Boolean
        ): Intent {
            val intent = Intent(baseActivity, CallActivity::class.java)
            intent.putExtra(SIP_ADDRESS_EXTRA_KEY, sipAddress)
            intent.putExtra(SIP_OUTGOING_EXTRA_KEY, isOutgoing)
            return intent
        }
    }

    private val binding: ActivityCallBinding by lazy {
        ActivityCallBinding.inflate(layoutInflater)
    }

    private val isOutgoing: Boolean by lazy {
        intent.getBooleanExtra(SIP_OUTGOING_EXTRA_KEY, false)
    }

    private val address: String by lazy {
        intent.getStringExtra(SIP_ADDRESS_EXTRA_KEY) ?: ""
    }

    private var callConfirmedTimeStamp : Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        if (isOutgoing) {
            SipService.getInstance().makeCall(address)
            binding.btnAcceptCall.visibility = View.GONE
            binding.btnRejectCall.text = "Hang Up"
            binding.tvCallStatus.visibility = View.VISIBLE
            binding.tvCallStatus.text = "Calling..."
        } else {
            binding.tvCallStatus.visibility = View.GONE
            binding.btnAcceptCall.visibility = View.VISIBLE
        }

        val remoteUris = if(isOutgoing) address else SipAccountExt.inProgressCall?.info?.remoteUri
        val sipDomain = SipUtils.getDomainFromSipAddress(remoteUris ?: "")
        val sipUsername = SipUtils.getUserNameFromSipUri(remoteUris ?: "")

            binding.tvNameOfCaller.text = SipUtils.getUserNameFromSipUri(sipUsername)
            binding.tvSipAddress.text = remoteUris?.replace("<", "")?.replace(">", "")

        binding.btnAcceptCall.setOnClickListener {
            SipAccountExt.inProgressCall?.acceptCall()
        }

        binding.btnRejectCall.setOnClickListener {
            SipAccountExt.inProgressCall?.rejectCall()
        }

        CoroutineScope(Dispatchers.IO).launch {
            if(MyRoomDatabase.db.sipAccountDao().getSipAccountByUsername(sipUsername) == null){
                val sipAccount = SipAccount(
                    0,
                    sipDomain,
                    sipUsername,
                    sipUsername,
                    "",
                    "",
                    "",
                    false
                )
                MyRoomDatabase.db.sipAccountDao().insertSipAccount(sipAccount)
            }

            val calls = Calls(
                0,
                MyRoomDatabase.db.sipAccountDao().getSipAccountByUsername(sipUsername)?.sipAccountId ?: 0,
                if(isOutgoing) Direction.DIRECTION_OUTGOING else Direction.DIRECTION_INCOMING,
                System.currentTimeMillis()
            )
            MyRoomDatabase.db.callsDao().insertCall(calls)
        }

    }

    override fun callDisconnected() {
        SipAccountExt.inProgressCall = null
        finish()
    }

    override fun callStateConfirmed() {
        binding.tvCallStatus.text = "00:00"
        binding.tvCallStatus.visibility = View.VISIBLE
        callConfirmedTimeStamp = System.currentTimeMillis()
        binding.btnAcceptCall.visibility = View.GONE
        binding.btnRejectCall.text = "Hang up"
        increaseTimer()
    }

    override fun connecting() {
        binding.tvCallStatus.text = "Connecting..."
    }

    override fun callRinging() {
        binding.tvCallStatus.text = "Ringing..."
    }

    private fun increaseTimer(){
        Handler().postDelayed({
            val difference = System.currentTimeMillis() - callConfirmedTimeStamp
            val totalSeconds = (difference/1000)
            val minutes = (totalSeconds.floorDiv(60))
            val seconds = totalSeconds%60
            binding.tvCallStatus.text = "${if (minutes < 10) "0$minutes" else minutes}:${if (seconds < 10) "0$seconds" else seconds}"
            increaseTimer()
        }, 1000)
    }
}