package com.example.sipdemo.sip

import android.content.Context
import android.net.ConnectivityManager
import com.example.sipdemo.App
import com.example.sipdemo.sip.events.CallState
import com.google.gson.Gson
import org.greenrobot.eventbus.EventBus
import org.pjsip.pjsua2.*
import timber.log.Timber

/**
 * @Author: Wajid.Ali
 * @Date: 8/23/2021
 */
class CallExt : Call {

    constructor(account : SipAccountExt, isOutgoing : Boolean) : super(account){
        this.callId = callId
        this.isOutgoing = isOutgoing
    }

    constructor(account : SipAccountExt, callId: Int, isOutgoing : Boolean) : super(account,callId){
        this.callId = callId
        this.isOutgoing = isOutgoing
    }

    private lateinit var mCallInfo: CallInfo
    var callId : Int = -1

    var streamInfo : StreamInfo? = null
    var streamStat : StreamStat? = null
    var isOutgoing : Boolean = false

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
            callOpParam.statusCode = pjsip_status_code.PJSIP_SC_GONE
            hangup(callOpParam)
        }catch (ex : Exception){
            Timber.e(ex)
        }
    }

    override fun swigDirectorDisconnect() {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.swigDirectorDisconnect()
    }

    override fun swigReleaseOwnership() {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.swigReleaseOwnership()
    }

    override fun swigTakeOwnership() {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.swigTakeOwnership()
    }

    override fun getInfo(): CallInfo? {
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        val info = super.getInfo()
        Timber.e("CallExt: info: ${info.remoteUri}")
        Timber.e("CallExt: info: ${Gson().toJson(info)}, isNull: ${info == null}")
        return info
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

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.setUserData(user_data)
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
        setMediaParams(prm!!)
        prm.opt?.flag = pjsua_call_flag.PJSUA_CALL_INCLUDE_DISABLED_MEDIA.swigValue().toLong()
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.makeCall(dst_uri, prm)
    }

    override fun answer(prm: CallOpParam?) {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.answer(prm)
    }

    override fun hangup(prm: CallOpParam?) {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.hangup(prm)
    }

    override fun setHold(prm: CallOpParam?) {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.setHold(prm)
    }

    override fun reinvite(prm: CallOpParam?) {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.reinvite(prm)
    }

    override fun update(prm: CallOpParam?) {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.update(prm)
    }

    override fun xfer(dest: String?, prm: CallOpParam?) {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.xfer(dest, prm)
    }

    override fun xferReplaces(dest_call: Call?, prm: CallOpParam?) {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.xferReplaces(dest_call, prm)
    }

    override fun processRedirect(cmd: pjsip_redirect_op?) {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.processRedirect(cmd)
    }

    override fun dialDtmf(digits: String?) {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.dialDtmf(digits)
    }

    override fun sendDtmf(param: CallSendDtmfParam?) {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.sendDtmf(param)
    }

    override fun sendInstantMessage(prm: SendInstantMessageParam?) {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.sendInstantMessage(prm)
    }

    override fun sendTypingIndication(prm: SendTypingIndicationParam?) {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.sendTypingIndication(prm)
    }

    override fun sendRequest(prm: CallSendRequestParam?) {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.sendRequest(prm)
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

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.vidSetStream(op, param)
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

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.processMediaUpdate(prm)
    }

    override fun processStateChange(prm: OnCallStateParam?) {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.processStateChange(prm)
    }

    override fun onCallState(prm: OnCallStateParam?) {
//        super.onCallState(prm)
        Timber.e("Printing call state")
        val state = info?.state
        when(state){
            pjsip_inv_state.PJSIP_INV_STATE_NULL -> Timber.e("Pjsip call state  is null")
            pjsip_inv_state.PJSIP_INV_STATE_CALLING -> Timber.e("Pjsip call state  is calling")
            pjsip_inv_state.PJSIP_INV_STATE_CONFIRMED -> Timber.e("Pjsip call state  is confirmed")
            pjsip_inv_state.PJSIP_INV_STATE_CONNECTING -> Timber.e("Pjsip call state  is connecting")
            pjsip_inv_state.PJSIP_INV_STATE_DISCONNECTED -> Timber.e("Pjsip call state  is disconnected")
            pjsip_inv_state.PJSIP_INV_STATE_EARLY -> Timber.e("Pjsip call state  is early")
            pjsip_inv_state.PJSIP_INV_STATE_INCOMING -> Timber.e("Pjsip call state  is incoming")
            else -> {
                Timber.e("else state in call state printing")
            }
        }
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        if(state != null && state != pjsip_inv_state.PJSIP_INV_STATE_INCOMING && state != pjsip_inv_state.PJSIP_INV_STATE_EARLY){
            EventBus.getDefault().post(CallState(state))
        }
    }

    override fun onCallTsxState(prm: OnCallTsxStateParam?) {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.onCallTsxState(prm)
    }


    private fun updateCallInfo(): Boolean {
        return try {
            info?.let {
                mCallInfo =it
            }
            true
        } catch (e: java.lang.Exception) {
            false
        }
    }

    override fun onCallMediaState(prm: OnCallMediaStateParam?) {
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name} before info")
        if (!updateCallInfo()) {
            return
        }

        val mediaInfoVector: CallMediaInfoVector = mCallInfo.media
        for (i in 0 until mediaInfoVector.size()) {
            val mediaInfo = mediaInfoVector[i.toInt()]
            if (mediaInfo.type == pjmedia_type.PJMEDIA_TYPE_AUDIO && mediaInfo.status == pjsua_call_media_status.PJSUA_CALL_MEDIA_ACTIVE) {
                val mAudioMedia = AudioMedia.typecastFromMedia(getMedia(i))
                if (mAudioMedia != null) {
                    try {
                       SipService.getInstance().endPoint.audDevManager().captureDevMedia.startTransmit(mAudioMedia)
                        mAudioMedia.startTransmit(SipService.getInstance().endPoint.audDevManager().playbackDevMedia)
                        mAudioMedia.adjustRxLevel(1.5f)
                        mAudioMedia.adjustTxLevel(1.5f)
                    } catch (e: Exception) {
                        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name} Exception")
                    }
                }
            }
        }
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
    }

    override fun onCallSdpCreated(prm: OnCallSdpCreatedParam?) {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.onCallSdpCreated(prm)
    }

    override fun onStreamCreated(prm: OnStreamCreatedParam?) {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.onStreamCreated(prm)
    }

    override fun onStreamDestroyed(prm: OnStreamDestroyedParam?) {
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        try{
            streamInfo = getStreamInfo(0)
            streamStat = getStreamStat(0)
        }catch (ex : Exception){
            Timber.e(ex)
        }
        super.onStreamDestroyed(prm)
    }

    override fun onDtmfDigit(prm: OnDtmfDigitParam?) {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.onDtmfDigit(prm)
    }

    override fun onCallTransferRequest(prm: OnCallTransferRequestParam?) {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.onCallTransferRequest(prm)
    }

    override fun onCallTransferStatus(prm: OnCallTransferStatusParam?) {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.onCallTransferStatus(prm)
    }

    override fun onCallReplaceRequest(prm: OnCallReplaceRequestParam?) {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.onCallReplaceRequest(prm)
    }

    override fun onCallReplaced(prm: OnCallReplacedParam?) {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.onCallReplaced(prm)
    }

    override fun onCallRxOffer(prm: OnCallRxOfferParam?) {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.onCallRxOffer(prm)
    }

    override fun onCallRxReinvite(prm: OnCallRxReinviteParam?) {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.onCallRxReinvite(prm)
    }

    override fun onCallTxOffer(prm: OnCallTxOfferParam?) {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.onCallTxOffer(prm)
    }

    override fun onInstantMessage(prm: OnInstantMessageParam?) {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.onInstantMessage(prm)
    }

    override fun onInstantMessageStatus(prm: OnInstantMessageStatusParam?) {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.onInstantMessageStatus(prm)
    }

    override fun onTypingIndication(prm: OnTypingIndicationParam?) {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.onTypingIndication(prm)
    }

    override fun onCallRedirected(prm: OnCallRedirectedParam?): pjsip_redirect_op {
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.onCallRedirected(prm)
    }

    override fun onCallMediaTransportState(prm: OnCallMediaTransportStateParam?) {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.onCallMediaTransportState(prm)
        if (prm?.state == pjsua_med_tp_st.PJSUA_MED_TP_CREATING) {
            configureCodecs()
        }
    }

    override fun onCallMediaEvent(prm: OnCallMediaEventParam?) {
        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")

        if(prm?.ev?.type == pjmedia_event_type.PJMEDIA_EVENT_FMT_CHANGED){
            //TODO: do code here for video frame sizing
        }

        super.onCallMediaEvent(prm)
    }

    override fun onCreateMediaTransport(prm: OnCreateMediaTransportParam?) {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.onCreateMediaTransport(prm)
    }

    override fun onCreateMediaTransportSrtp(prm: OnCreateMediaTransportSrtpParam?) {

        Timber.e("CallExt: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.onCreateMediaTransportSrtp(prm)
    }

    fun configureCodecs() {
        codecSetPriority("*", 0) // disables all codecs
        var priority = 255
            codecSetPriority("opus/48000/2", priority--)
            codecSetPriority("iLBC/8000/1", priority--)
        codecSetPriority("G711u/8000/1", priority--)
        codecSetPriority("G729/8000/1", priority--)
        codecSetPriority("PCMU/8000/1", priority--)
        codecSetPriority("PCMA/8000/1", priority--)
        if (isConnectedToWifi()) {
            codecSetPriority("PCMU/8000/1", priority--)
            codecSetPriority("PCMA/8000/1", priority--)
        }
    }

    private fun codecSetPriority(codec: String, priority: Int): Boolean {
        return try {
            SipService.getInstance().endPoint.codecSetPriority(codec, priority.toShort())
            true
        } catch (e: java.lang.Exception) {
            Timber.e(
                "codecSetPriority failed for codec: $codec"
            )
            false
        }
    }

    private fun isConnectedToWifi(): Boolean {
        val activeNetworkInfo =
            (App.getInstance().getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager).activeNetworkInfo
        return activeNetworkInfo != null && activeNetworkInfo.type == ConnectivityManager.TYPE_WIFI
    }

    private fun setMediaParams(param: CallOpParam) {
        param.opt.audioCount = 1
        param.opt.videoCount = 0.toLong()
    }
}