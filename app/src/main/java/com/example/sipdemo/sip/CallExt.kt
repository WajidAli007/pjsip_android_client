package com.example.sipdemo.sip

import org.pjsip.pjsua2.*
import timber.log.Timber
import java.lang.Exception

/**
 * @Author: Wajid.Ali
 * @Date: 8/23/2021
 */
class CallExt(account: SipAccountExt, callId: Int) : Call(account, callId) {

    fun acceptCall() {
        try {
            val callOpParam = CallOpParam()
            callOpParam.statusCode = pjsip_status_code.PJSIP_SC_OK

            answer(callOpParam)
        }catch (ex : Exception){
            Timber.e(ex)
        }

    }

    fun rejectCall() {
        try {
            val callOpParam = CallOpParam()
            callOpParam.statusCode = pjsip_status_code.PJSIP_SC_DECLINE
//
//            answer(callOpParam)
            hangup(callOpParam)
        }catch (ex : Exception){
            Timber.e(ex)
        }
    }

    override fun swigDirectorDisconnect() {
        super.swigDirectorDisconnect()
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun swigReleaseOwnership() {
        super.swigReleaseOwnership()
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun swigTakeOwnership() {
        super.swigTakeOwnership()
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun getInfo(): CallInfo {
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.getInfo()
    }

    override fun isActive(): Boolean {
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.isActive()
    }

    override fun getId(): Int {
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.getId()
    }

    override fun hasMedia(): Boolean {
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.hasMedia()
    }

    override fun getMedia(med_idx: Long): Media {
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.getMedia(med_idx)
    }

    override fun remoteHasCap(htype: Int, hname: String?, token: String?): pjsip_dialog_cap_status {
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.remoteHasCap(htype, hname, token)
    }

    override fun setUserData(user_data: SWIGTYPE_p_void?) {
        super.setUserData(user_data)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun getUserData(): SWIGTYPE_p_void {
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.getUserData()
    }

    override fun getRemNatType(): pj_stun_nat_type {
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.getRemNatType()
    }

    override fun makeCall(dst_uri: String?, prm: CallOpParam?) {
        super.makeCall(dst_uri, prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun answer(prm: CallOpParam?) {
        super.answer(prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun hangup(prm: CallOpParam?) {
        super.hangup(prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun setHold(prm: CallOpParam?) {
        super.setHold(prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun reinvite(prm: CallOpParam?) {
        super.reinvite(prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun update(prm: CallOpParam?) {
        super.update(prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun xfer(dest: String?, prm: CallOpParam?) {
        super.xfer(dest, prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun xferReplaces(dest_call: Call?, prm: CallOpParam?) {
        super.xferReplaces(dest_call, prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun processRedirect(cmd: pjsip_redirect_op?) {
        super.processRedirect(cmd)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun dialDtmf(digits: String?) {
        super.dialDtmf(digits)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun sendDtmf(param: CallSendDtmfParam?) {
        super.sendDtmf(param)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun sendInstantMessage(prm: SendInstantMessageParam?) {
        super.sendInstantMessage(prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun sendTypingIndication(prm: SendTypingIndicationParam?) {
        super.sendTypingIndication(prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun sendRequest(prm: CallSendRequestParam?) {
        super.sendRequest(prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun dump(with_media: Boolean, indent: String?): String {
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.dump(with_media, indent)
    }

    override fun vidGetStreamIdx(): Int {
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.vidGetStreamIdx()
    }

    override fun vidStreamIsRunning(med_idx: Int, dir: pjmedia_dir?): Boolean {
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.vidStreamIsRunning(med_idx, dir)
    }

    override fun vidSetStream(op: pjsua_call_vid_strm_op?, param: CallVidSetStreamParam?) {
        super.vidSetStream(op, param)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun getStreamInfo(med_idx: Long): StreamInfo {
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.getStreamInfo(med_idx)
    }

    override fun getStreamStat(med_idx: Long): StreamStat {
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.getStreamStat(med_idx)
    }

    override fun getMedTransportInfo(med_idx: Long): MediaTransportInfo {
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.getMedTransportInfo(med_idx)
    }

    override fun processMediaUpdate(prm: OnCallMediaStateParam?) {
        super.processMediaUpdate(prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun processStateChange(prm: OnCallStateParam?) {
        super.processStateChange(prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun onCallState(prm: OnCallStateParam?) {
        super.onCallState(prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun onCallTsxState(prm: OnCallTsxStateParam?) {
        super.onCallTsxState(prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun onCallMediaState(prm: OnCallMediaStateParam?) {
        super.onCallMediaState(prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun onCallSdpCreated(prm: OnCallSdpCreatedParam?) {
        super.onCallSdpCreated(prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun onStreamCreated(prm: OnStreamCreatedParam?) {
        super.onStreamCreated(prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun onStreamDestroyed(prm: OnStreamDestroyedParam?) {
        super.onStreamDestroyed(prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun onDtmfDigit(prm: OnDtmfDigitParam?) {
        super.onDtmfDigit(prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun onCallTransferRequest(prm: OnCallTransferRequestParam?) {
        super.onCallTransferRequest(prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun onCallTransferStatus(prm: OnCallTransferStatusParam?) {
        super.onCallTransferStatus(prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun onCallReplaceRequest(prm: OnCallReplaceRequestParam?) {
        super.onCallReplaceRequest(prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun onCallReplaced(prm: OnCallReplacedParam?) {
        super.onCallReplaced(prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun onCallRxOffer(prm: OnCallRxOfferParam?) {
        super.onCallRxOffer(prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun onCallRxReinvite(prm: OnCallRxReinviteParam?) {
        super.onCallRxReinvite(prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun onCallTxOffer(prm: OnCallTxOfferParam?) {
        super.onCallTxOffer(prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun onInstantMessage(prm: OnInstantMessageParam?) {
        super.onInstantMessage(prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun onInstantMessageStatus(prm: OnInstantMessageStatusParam?) {
        super.onInstantMessageStatus(prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun onTypingIndication(prm: OnTypingIndicationParam?) {
        super.onTypingIndication(prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun onCallRedirected(prm: OnCallRedirectedParam?): pjsip_redirect_op {
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.onCallRedirected(prm)
    }

    override fun onCallMediaTransportState(prm: OnCallMediaTransportStateParam?) {
        super.onCallMediaTransportState(prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun onCallMediaEvent(prm: OnCallMediaEventParam?) {
        super.onCallMediaEvent(prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun onCreateMediaTransport(prm: OnCreateMediaTransportParam?) {
        super.onCreateMediaTransport(prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun onCreateMediaTransportSrtp(prm: OnCreateMediaTransportSrtpParam?) {
        super.onCreateMediaTransportSrtp(prm)
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }
}