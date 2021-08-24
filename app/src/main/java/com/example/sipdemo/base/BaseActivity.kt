package com.example.sipdemo.base

import androidx.appcompat.app.AppCompatActivity
import com.example.sipdemo.sip.events.CallState
import com.example.sipdemo.sip.events.CallStateEnum
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

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
        if(callState.callStateEnum == CallStateEnum.NEW_INCOMING_CALL){
            newCall()
        }
    }

    abstract fun newCall()
}