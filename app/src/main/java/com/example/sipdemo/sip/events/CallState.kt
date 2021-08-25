package com.example.sipdemo.sip.events

import org.pjsip.pjsua2.pjsip_inv_state
import timber.log.Timber

/**
 * @Author: Wajid.Ali
 * @Date: 8/24/2021
 */
data class CallState(
    val callStateEnum: pjsip_inv_state
){

    fun getStatusText() : String{
        return when(callStateEnum){
            pjsip_inv_state.PJSIP_INV_STATE_NULL -> "Null"
            pjsip_inv_state.PJSIP_INV_STATE_CALLING -> "Calling..."
            pjsip_inv_state.PJSIP_INV_STATE_CONFIRMED -> "Ringing..."
            pjsip_inv_state.PJSIP_INV_STATE_CONNECTING -> "Connecting..."
            pjsip_inv_state.PJSIP_INV_STATE_DISCONNECTED -> "Disconnected..."
            pjsip_inv_state.PJSIP_INV_STATE_EARLY -> "Incoming Call..."
            pjsip_inv_state.PJSIP_INV_STATE_INCOMING -> "Incoming Call..."
            else -> {
                "Null"
            }
        }
    }
}