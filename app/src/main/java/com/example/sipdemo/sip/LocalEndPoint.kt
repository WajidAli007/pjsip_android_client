package com.example.sipdemo.sip

import org.pjsip.pjsua2.*
import timber.log.Timber

/**
 * @Author: Wajid.Ali
 * @Date: 8/16/2021
 */
class LocalEndPoint : Endpoint() {

    override fun swigDirectorDisconnect() {

        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.swigDirectorDisconnect()
    }

    override fun swigReleaseOwnership() {

        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.swigReleaseOwnership()
    }

    override fun swigTakeOwnership() {

        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.swigTakeOwnership()
    }

    override fun libDestroy(prmFlags: Long) {

        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.libDestroy(prmFlags)
    }

    override fun libDestroy() {

        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.libDestroy()
    }

    override fun libVersion(): Version {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.libVersion()
    }

    override fun libCreate() {

        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.libCreate()
    }

    override fun libGetState(): pjsua_state {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.libGetState()
    }

    override fun libInit(prmEpConfig: EpConfig?) {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.libInit(prmEpConfig)
    }

    override fun libStart() {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.libStart()
    }

    override fun libRegisterThread(name: String?) {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.libRegisterThread(name)
    }

    override fun libIsThreadRegistered(): Boolean {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.libIsThreadRegistered()
    }

    override fun libStopWorkerThreads() {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.libStopWorkerThreads()
    }

    override fun libHandleEvents(msec_timeout: Long): Int {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.libHandleEvents(msec_timeout)
    }

    override fun libDestroy_(prmFlags: Long) {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.libDestroy_(prmFlags)
    }

    override fun libDestroy_() {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.libDestroy_()
    }

    override fun utilStrError(prmErr: Int): String {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.utilStrError(prmErr)
    }

    override fun utilLogWrite(prmLevel: Int, prmSender: String?, prmMsg: String?) {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.utilLogWrite(prmLevel, prmSender, prmMsg)
    }

    override fun utilLogWrite(e: LogEntry?) {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.utilLogWrite(e)
    }

    override fun utilVerifySipUri(prmUri: String?): Int {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.utilVerifySipUri(prmUri)
    }

    override fun utilVerifyUri(prmUri: String?): Int {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.utilVerifyUri(prmUri)
    }

    override fun utilTimerSchedule(
        prmMsecDelay: Long,
        prmUserData: SWIGTYPE_p_void?
    ): SWIGTYPE_p_void {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.utilTimerSchedule(prmMsecDelay, prmUserData)
    }

    override fun utilTimerCancel(prmToken: SWIGTYPE_p_void?) {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.utilTimerCancel(prmToken)
    }

    override fun utilAddPendingJob(job: PendingJob?) {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.utilAddPendingJob(job)
    }

    override fun utilSslGetAvailableCiphers(): IntVector {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.utilSslGetAvailableCiphers()
    }

    override fun natDetectType() {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.natDetectType()
    }

    override fun natGetType(): pj_stun_nat_type {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.natGetType()
    }

    override fun natUpdateStunServers(prmServers: StringVector?, prmWait: Boolean) {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.natUpdateStunServers(prmServers, prmWait)
    }

    override fun natCheckStunServers(
        prmServers: StringVector?,
        prmWait: Boolean,
        prmUserData: SWIGTYPE_p_void?
    ) {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.natCheckStunServers(prmServers, prmWait, prmUserData)
    }

    override fun natCancelCheckStunServers(token: SWIGTYPE_p_void?, notify_cb: Boolean) {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.natCancelCheckStunServers(token, notify_cb)
    }

    override fun natCancelCheckStunServers(token: SWIGTYPE_p_void?) {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.natCancelCheckStunServers(token)
    }

    override fun transportCreate(
        type: pjsip_transport_type_e?,
        cfg: TransportConfig?
    ): Int {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.transportCreate(type, cfg)
    }

    override fun transportEnum(): IntVector {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.transportEnum()
    }

    override fun transportGetInfo(id: Int): TransportInfo {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.transportGetInfo(id)
    }

    override fun transportSetEnable(id: Int, enabled: Boolean) {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.transportSetEnable(id, enabled)
    }

    override fun transportClose(id: Int) {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.transportClose(id)
    }

    override fun transportShutdown(tp: SWIGTYPE_p_void?) {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.transportShutdown(tp)
    }

    override fun hangupAllCalls() {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.hangupAllCalls()
    }

    override fun mediaAdd(media: AudioMedia?) {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.mediaAdd(media)
    }

    override fun mediaRemove(media: AudioMedia?) {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.mediaRemove(media)
    }

    override fun mediaExists(media: AudioMedia?): Boolean {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.mediaExists(media)
    }

    override fun mediaMaxPorts(): Long {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.mediaMaxPorts()
    }

    override fun mediaActivePorts(): Long {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.mediaActivePorts()
    }

    override fun mediaEnumPorts(): AudioMediaVector {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.mediaEnumPorts()
    }

    override fun audDevManager(): AudDevManager {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.audDevManager()
    }

    override fun vidDevManager(): VidDevManager {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.vidDevManager()
    }

    override fun codecEnum(): CodecInfoVector {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.codecEnum()
    }

    override fun codecSetPriority(codec_id: String?, priority: Short) {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.codecSetPriority(codec_id, priority)
    }

    override fun codecGetParam(codec_id: String?): CodecParam {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.codecGetParam(codec_id)
    }

    override fun codecSetParam(codec_id: String?, param: CodecParam?) {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.codecSetParam(codec_id, param)
    }

    override fun videoCodecEnum(): CodecInfoVector {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.videoCodecEnum()
    }

    override fun videoCodecSetPriority(codec_id: String?, priority: Short) {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.videoCodecSetPriority(codec_id, priority)
    }

    override fun getVideoCodecParam(codec_id: String?): VidCodecParam {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.getVideoCodecParam(codec_id)
    }

    override fun setVideoCodecParam(codec_id: String?, param: VidCodecParam?) {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.setVideoCodecParam(codec_id, param)
    }

    override fun resetVideoCodecParam(codec_id: String?) {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.resetVideoCodecParam(codec_id)
    }

    override fun srtpCryptoEnum(): StringVector {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        return super.srtpCryptoEnum()
    }

    override fun handleIpChange(param: IpChangeParam?) {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.handleIpChange(param)
    }

    override fun onNatDetectionComplete(prm: OnNatDetectionCompleteParam?) {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.onNatDetectionComplete(prm)
    }

    override fun onNatCheckStunServersComplete(prm: OnNatCheckStunServersCompleteParam?) {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.onNatCheckStunServersComplete(prm)
    }

    override fun onTransportState(prm: OnTransportStateParam?) {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.onTransportState(prm)
    }

    override fun onTimer(prm: OnTimerParam?) {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.onTimer(prm)
    }

    override fun onSelectAccount(prm: OnSelectAccountParam?) {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.onSelectAccount(prm)
    }

    override fun onIpChangeProgress(prm: OnIpChangeProgressParam?) {
        Timber.e("LocalEndPoint: ${object : Any() {}.javaClass.enclosingMethod.name}")
        super.onIpChangeProgress(prm)
    }
}