package com.example.sipdemo.base

import androidx.appcompat.app.AppCompatActivity
import com.example.sipdemo.sip.events.CallState
import com.example.sipdemo.sip.events.ConnectionState
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import org.pjsip.pjsua2.pjsip_inv_state
import org.pjsip.pjsua2.pjsip_status_code

/**
 * @Author: Wajid.Ali
 * @Date: 8/24/2021
 */
abstract class BaseActivity : AppCompatActivity(){

    override fun onStart() {
        super.onStart()
        if(!EventBus.getDefault().isRegistered(this))
            EventBus.getDefault().register(this)
    }

    override fun onStop() {
        super.onStop()
        if(EventBus.getDefault().isRegistered(this))
            EventBus.getDefault().unregister(this)
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onCallState(callState : CallState){
        when(callState.callStateEnum){
            pjsip_inv_state.PJSIP_INV_STATE_INCOMING -> newCall()
            pjsip_inv_state.PJSIP_INV_STATE_EARLY -> newCall()
            pjsip_inv_state.PJSIP_INV_STATE_DISCONNECTED -> callDisconnected()
            pjsip_inv_state.PJSIP_INV_STATE_CONNECTING -> connecting()
            pjsip_inv_state.PJSIP_INV_STATE_CONFIRMED -> callStateConfirmed()
            pjsip_inv_state.PJSIP_INV_STATE_NULL -> {}
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onConnectionState(connectionState : ConnectionState){
        when(connectionState.status){
            pjsip_status_code.PJSIP_SC_OK -> {
                connectionEstablished()
            }
        }
    }

    //connection events
    open fun connectionEstablished() {}

    //call events
    open fun newCall(){}
    open fun callDisconnected(){}
    open fun connecting() {}
    open fun callStateConfirmed() {}
}