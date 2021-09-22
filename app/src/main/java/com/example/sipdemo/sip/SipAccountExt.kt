package com.example.sipdemo.sip

import com.example.sipdemo.sip.events.CallState
import com.example.sipdemo.sip.events.ConnectionState
import com.google.gson.Gson
import org.greenrobot.eventbus.EventBus
import org.pjsip.pjsua2.*
import timber.log.Timber

/**
 * @Author: Wajid.Ali
 * @Date: 8/16/2021
 */
class SipAccountExt : Account() {

    companion object {
        var inProgressCall: CallExt? = null
    }

    override fun onIncomingCall(prm: OnIncomingCallParam?) {
        super.onIncomingCall(prm)
        Timber.e("SIPAccountExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        Timber.e("newIncomingCall: From:${prm?.callId}")
        Timber.e("newIncomingCall: rData.info:${prm?.rdata?.info}")
        Timber.e("newIncomingCall: rData.srcAddress:${prm?.rdata?.srcAddress}")
        Timber.e("newIncomingCall: rData.wholeMsg:${prm?.rdata?.wholeMsg}")
        Timber.e("newIncomingCall: rData.pjRxData:${prm?.rdata?.pjRxData}")

        inProgressCall = CallExt(this, prm?.callId!!, false)
        val callOpParam = CallOpParam()
        callOpParam.statusCode = pjsip_status_code.PJSIP_SC_RINGING
        inProgressCall?.answer(callOpParam)

        EventBus.getDefault().post(CallState(pjsip_inv_state.PJSIP_INV_STATE_INCOMING))

    }

    override fun onInstantMessage(prm: OnInstantMessageParam?) {
        super.onInstantMessage(prm)
        Timber.e("SIPAccountExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        Timber.e("onInstantMessage: From:${prm?.fromUri}")
        Timber.e("onInstantMessage: MsgBody:${prm?.msgBody}")
        Timber.e("onInstantMessage: contactUri:${prm?.contactUri}")
        Timber.e("onInstantMessage: contentType:${prm?.contentType}")
        Timber.e("onInstantMessage: rdata:${prm?.rdata}")
        Timber.e("onInstantMessage: toUri:${prm?.toUri}")
    }

    override fun onIncomingSubscribe(prm: OnIncomingSubscribeParam?) {
        super.onIncomingSubscribe(prm)
        Timber.e("SIPAccountExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        Timber.e("onIncomingSubscriber: ${Gson().toJson(prm)}")
    }

    override fun onInstantMessageStatus(prm: OnInstantMessageStatusParam?) {
        super.onInstantMessageStatus(prm)
        Timber.e("SIPAccountExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        Timber.e("onInstantMessageStatus: ${Gson().toJson(prm)}")
    }

    override fun onMwiInfo(prm: OnMwiInfoParam?) {
        super.onMwiInfo(prm)
        Timber.e("SIPAccountExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        Timber.e("onMwiInfo: ${Gson().toJson(prm)}")
    }

    override fun onRegStarted(prm: OnRegStartedParam?) {
        super.onRegStarted(prm)
        Timber.e("SIPAccountExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        Timber.e("onRegStarted: ${Gson().toJson(prm)}")
    }

    override fun onRegState(prm: OnRegStateParam?) {
        super.onRegState(prm)
        Timber.e("SIPAccountExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        Timber.e("SIPAccountExt code: ${prm?.code?.toString()}")
        Timber.e("SIPAccountExt reason: ${prm?.reason}")
        Timber.e("SIPAccountExt status: ${prm?.status}")
        Timber.e("SIPAccountExt rdata info: ${prm?.rdata?.info}")
        Timber.e("SIPAccountExt rdata srcAddress: ${prm?.rdata?.srcAddress}")
        Timber.e("SIPAccountExt rdata wholeMessage: ${prm?.rdata?.wholeMsg}")
        val code = prm?.code
        if(code != null){
            EventBus.getDefault().post(ConnectionState(code))
        }
    }

    override fun onTypingIndication(prm: OnTypingIndicationParam?) {
        super.onTypingIndication(prm)
        Timber.e("SIPAccountExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        Timber.e("onTypingIndication: ${Gson().toJson(prm)}")
    }

    override fun setOnlineStatus(pres_st: PresenceStatus?) {
        super.setOnlineStatus(pres_st)
        Timber.e("SIPAccountExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        Timber.e("PresenceStatus: ${Gson().toJson(pres_st)}")
    }

    override fun setRegistration(renew: Boolean) {
        super.setRegistration(renew)
        Timber.e("setRegistration: ${Gson().toJson(renew)}")
        Timber.e("SIPAccountExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun swigDirectorDisconnect() {
        Timber.e("SIPAccountExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.swigDirectorDisconnect()
    }

    override fun swigReleaseOwnership() {
        Timber.e("SIPAccountExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.swigReleaseOwnership()
    }

    override fun swigTakeOwnership() {
        Timber.e("SIPAccountExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.swigTakeOwnership()
    }

    override fun create(cfg: AccountConfig?, make_default: Boolean) {
        Timber.e("SIPAccountExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.create(cfg, make_default)
    }

    override fun create(cfg: AccountConfig?) {
        Timber.e("SIPAccountExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.create(cfg)
    }

    override fun shutdown() {
        Timber.e("SIPAccountExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.shutdown()
    }

    override fun modify(cfg: AccountConfig?) {
        Timber.e("SIPAccountExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.modify(cfg)
    }

    override fun isValid(): Boolean {
        Timber.e("SIPAccountExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.isValid()
    }

    override fun setDefault() {
        Timber.e("SIPAccountExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.setDefault()
    }

    override fun isDefault(): Boolean {
        Timber.e("SIPAccountExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.isDefault()
    }

    override fun getId(): Int {
        Timber.e("SIPAccountExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.getId()
    }

    override fun getInfo(): AccountInfo {
        Timber.e("SIPAccountExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.getInfo()
    }

    override fun setTransport(tp_id: Int) {
        Timber.e("SIPAccountExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.setTransport(tp_id)
    }

    override fun presNotify(prm: PresNotifyParam?) {
        Timber.e("SIPAccountExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.presNotify(prm)
    }

    override fun enumBuddies(): BuddyVector {
        Timber.e("SIPAccountExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.enumBuddies()
    }

    override fun findBuddy(uri: String?, buddy_match: FindBuddyMatch?): Buddy {
        Timber.e("SIPAccountExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.findBuddy(uri, buddy_match)
    }

    override fun findBuddy(uri: String?): Buddy {
        Timber.e("SIPAccountExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.findBuddy(uri)
    }
}