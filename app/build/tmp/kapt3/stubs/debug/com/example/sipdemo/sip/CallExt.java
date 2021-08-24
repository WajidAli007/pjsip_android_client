package com.example.sipdemo.sip;

import java.lang.System;

/**
 * @Author: Wajid.Ali
 * @Date: 8/23/2021
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00a6\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0002J\u0006\u0010\u0013\u001a\u00020\nJ\u0012\u0010\u0014\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010%\u001a\u00020&2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\'\u001a\u00020(H\u0016J\u0012\u0010)\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010*\u001a\u00020\u000fH\u0016J\b\u0010+\u001a\u00020\u000fH\u0016J\b\u0010,\u001a\u00020\u000fH\u0002J\u001c\u0010-\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010\u00112\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010/\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u000100H\u0016J\u0012\u00101\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u000102H\u0016J\u0012\u00103\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u000104H\u0016J\u0012\u00105\u001a\u0002062\b\u0010\f\u001a\u0004\u0018\u000107H\u0016J\u0012\u00108\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u000109H\u0016J\u0012\u0010:\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010;H\u0016J\u0012\u0010<\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010=H\u0016J\u0012\u0010>\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010?H\u0016J\u0012\u0010@\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010AH\u0016J\u0012\u0010B\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010CH\u0016J\u0012\u0010D\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010EH\u0016J\u0012\u0010F\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010GH\u0016J\u0012\u0010H\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010IH\u0016J\u0012\u0010J\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010KH\u0016J\u0012\u0010L\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010MH\u0016J\u0012\u0010N\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010OH\u0016J\u0012\u0010P\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010QH\u0016J\u0012\u0010R\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010SH\u0016J\u0012\u0010T\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010UH\u0016J\u0012\u0010V\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010WH\u0016J\u0012\u0010X\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010YH\u0016J\u0012\u0010Z\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010[H\u0016J\u0012\u0010\\\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u000102H\u0016J\u0012\u0010]\u001a\u00020\n2\b\u0010^\u001a\u0004\u0018\u000106H\u0016J\u0012\u0010_\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010CH\u0016J\u0012\u0010`\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0006\u0010a\u001a\u00020\nJ$\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020\u00052\b\u0010e\u001a\u0004\u0018\u00010\u00112\b\u0010f\u001a\u0004\u0018\u00010\u0011H\u0016J\u0012\u0010g\u001a\u00020\n2\b\u0010h\u001a\u0004\u0018\u00010iH\u0016J\u0012\u0010j\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010kH\u0016J\u0012\u0010l\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010mH\u0016J\u0012\u0010n\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010oH\u0016J\u0012\u0010p\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010q\u001a\u00020\n2\b\u0010r\u001a\u0004\u0018\u00010(H\u0016J\b\u0010s\u001a\u00020\nH\u0014J\b\u0010t\u001a\u00020\nH\u0016J\b\u0010u\u001a\u00020\nH\u0016J\u0012\u0010v\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010w\u001a\u00020\u000fH\u0002J\b\u0010x\u001a\u00020\u0005H\u0016J\u001c\u0010y\u001a\u00020\n2\b\u0010z\u001a\u0004\u0018\u00010{2\b\u0010h\u001a\u0004\u0018\u00010|H\u0016J\u001a\u0010}\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00052\b\u0010~\u001a\u0004\u0018\u00010\u007fH\u0016J\u001e\u0010\u0080\u0001\u001a\u00020\n2\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00112\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001e\u0010\u0082\u0001\u001a\u00020\n2\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00012\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0084\u0001"}, d2 = {"Lcom/example/sipdemo/sip/CallExt;", "Lorg/pjsip/pjsua2/Call;", "account", "Lcom/example/sipdemo/sip/SipAccountExt;", "callId", "", "(Lcom/example/sipdemo/sip/SipAccountExt;I)V", "mCallInfo", "Lorg/pjsip/pjsua2/CallInfo;", "acceptCall", "", "answer", "prm", "Lorg/pjsip/pjsua2/CallOpParam;", "codecSetPriority", "", "codec", "", "priority", "configureCodecs", "dialDtmf", "digits", "dump", "with_media", "indent", "getId", "getInfo", "getMedTransportInfo", "Lorg/pjsip/pjsua2/MediaTransportInfo;", "med_idx", "", "getMedia", "Lorg/pjsip/pjsua2/Media;", "getRemNatType", "Lorg/pjsip/pjsua2/pj_stun_nat_type;", "getStreamInfo", "Lorg/pjsip/pjsua2/StreamInfo;", "getStreamStat", "Lorg/pjsip/pjsua2/StreamStat;", "getUserData", "Lorg/pjsip/pjsua2/SWIGTYPE_p_void;", "hangup", "hasMedia", "isActive", "isConnectedToWifi", "makeCall", "dst_uri", "onCallMediaEvent", "Lorg/pjsip/pjsua2/OnCallMediaEventParam;", "onCallMediaState", "Lorg/pjsip/pjsua2/OnCallMediaStateParam;", "onCallMediaTransportState", "Lorg/pjsip/pjsua2/OnCallMediaTransportStateParam;", "onCallRedirected", "Lorg/pjsip/pjsua2/pjsip_redirect_op;", "Lorg/pjsip/pjsua2/OnCallRedirectedParam;", "onCallReplaceRequest", "Lorg/pjsip/pjsua2/OnCallReplaceRequestParam;", "onCallReplaced", "Lorg/pjsip/pjsua2/OnCallReplacedParam;", "onCallRxOffer", "Lorg/pjsip/pjsua2/OnCallRxOfferParam;", "onCallRxReinvite", "Lorg/pjsip/pjsua2/OnCallRxReinviteParam;", "onCallSdpCreated", "Lorg/pjsip/pjsua2/OnCallSdpCreatedParam;", "onCallState", "Lorg/pjsip/pjsua2/OnCallStateParam;", "onCallTransferRequest", "Lorg/pjsip/pjsua2/OnCallTransferRequestParam;", "onCallTransferStatus", "Lorg/pjsip/pjsua2/OnCallTransferStatusParam;", "onCallTsxState", "Lorg/pjsip/pjsua2/OnCallTsxStateParam;", "onCallTxOffer", "Lorg/pjsip/pjsua2/OnCallTxOfferParam;", "onCreateMediaTransport", "Lorg/pjsip/pjsua2/OnCreateMediaTransportParam;", "onCreateMediaTransportSrtp", "Lorg/pjsip/pjsua2/OnCreateMediaTransportSrtpParam;", "onDtmfDigit", "Lorg/pjsip/pjsua2/OnDtmfDigitParam;", "onInstantMessage", "Lorg/pjsip/pjsua2/OnInstantMessageParam;", "onInstantMessageStatus", "Lorg/pjsip/pjsua2/OnInstantMessageStatusParam;", "onStreamCreated", "Lorg/pjsip/pjsua2/OnStreamCreatedParam;", "onStreamDestroyed", "Lorg/pjsip/pjsua2/OnStreamDestroyedParam;", "onTypingIndication", "Lorg/pjsip/pjsua2/OnTypingIndicationParam;", "processMediaUpdate", "processRedirect", "cmd", "processStateChange", "reinvite", "rejectCall", "remoteHasCap", "Lorg/pjsip/pjsua2/pjsip_dialog_cap_status;", "htype", "hname", "token", "sendDtmf", "param", "Lorg/pjsip/pjsua2/CallSendDtmfParam;", "sendInstantMessage", "Lorg/pjsip/pjsua2/SendInstantMessageParam;", "sendRequest", "Lorg/pjsip/pjsua2/CallSendRequestParam;", "sendTypingIndication", "Lorg/pjsip/pjsua2/SendTypingIndicationParam;", "setHold", "setUserData", "user_data", "swigDirectorDisconnect", "swigReleaseOwnership", "swigTakeOwnership", "update", "updateCallInfo", "vidGetStreamIdx", "vidSetStream", "op", "Lorg/pjsip/pjsua2/pjsua_call_vid_strm_op;", "Lorg/pjsip/pjsua2/CallVidSetStreamParam;", "vidStreamIsRunning", "dir", "Lorg/pjsip/pjsua2/pjmedia_dir;", "xfer", "dest", "xferReplaces", "dest_call", "app_debug"})
public final class CallExt extends org.pjsip.pjsua2.Call {
    private org.pjsip.pjsua2.CallInfo mCallInfo;
    
    public CallExt(@org.jetbrains.annotations.NotNull()
    com.example.sipdemo.sip.SipAccountExt account, int callId) {
        super(0L, false);
    }
    
    public final void acceptCall() {
    }
    
    public final void rejectCall() {
    }
    
    @java.lang.Override()
    protected void swigDirectorDisconnect() {
    }
    
    @java.lang.Override()
    public void swigReleaseOwnership() {
    }
    
    @java.lang.Override()
    public void swigTakeOwnership() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.pjsip.pjsua2.CallInfo getInfo() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isActive() {
        return false;
    }
    
    @java.lang.Override()
    public int getId() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean hasMedia() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.pjsip.pjsua2.Media getMedia(long med_idx) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.pjsip.pjsua2.pjsip_dialog_cap_status remoteHasCap(int htype, @org.jetbrains.annotations.Nullable()
    java.lang.String hname, @org.jetbrains.annotations.Nullable()
    java.lang.String token) {
        return null;
    }
    
    @java.lang.Override()
    public void setUserData(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.SWIGTYPE_p_void user_data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.pjsip.pjsua2.SWIGTYPE_p_void getUserData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.pjsip.pjsua2.pj_stun_nat_type getRemNatType() {
        return null;
    }
    
    @java.lang.Override()
    public void makeCall(@org.jetbrains.annotations.Nullable()
    java.lang.String dst_uri, @org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.CallOpParam prm) {
    }
    
    @java.lang.Override()
    public void answer(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.CallOpParam prm) {
    }
    
    @java.lang.Override()
    public void hangup(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.CallOpParam prm) {
    }
    
    @java.lang.Override()
    public void setHold(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.CallOpParam prm) {
    }
    
    @java.lang.Override()
    public void reinvite(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.CallOpParam prm) {
    }
    
    @java.lang.Override()
    public void update(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.CallOpParam prm) {
    }
    
    @java.lang.Override()
    public void xfer(@org.jetbrains.annotations.Nullable()
    java.lang.String dest, @org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.CallOpParam prm) {
    }
    
    @java.lang.Override()
    public void xferReplaces(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.Call dest_call, @org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.CallOpParam prm) {
    }
    
    @java.lang.Override()
    public void processRedirect(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.pjsip_redirect_op cmd) {
    }
    
    @java.lang.Override()
    public void dialDtmf(@org.jetbrains.annotations.Nullable()
    java.lang.String digits) {
    }
    
    @java.lang.Override()
    public void sendDtmf(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.CallSendDtmfParam param) {
    }
    
    @java.lang.Override()
    public void sendInstantMessage(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.SendInstantMessageParam prm) {
    }
    
    @java.lang.Override()
    public void sendTypingIndication(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.SendTypingIndicationParam prm) {
    }
    
    @java.lang.Override()
    public void sendRequest(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.CallSendRequestParam prm) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String dump(boolean with_media, @org.jetbrains.annotations.Nullable()
    java.lang.String indent) {
        return null;
    }
    
    @java.lang.Override()
    public int vidGetStreamIdx() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean vidStreamIsRunning(int med_idx, @org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.pjmedia_dir dir) {
        return false;
    }
    
    @java.lang.Override()
    public void vidSetStream(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.pjsua_call_vid_strm_op op, @org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.CallVidSetStreamParam param) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.pjsip.pjsua2.StreamInfo getStreamInfo(long med_idx) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.pjsip.pjsua2.StreamStat getStreamStat(long med_idx) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.pjsip.pjsua2.MediaTransportInfo getMedTransportInfo(long med_idx) {
        return null;
    }
    
    @java.lang.Override()
    public void processMediaUpdate(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnCallMediaStateParam prm) {
    }
    
    @java.lang.Override()
    public void processStateChange(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnCallStateParam prm) {
    }
    
    @java.lang.Override()
    public void onCallState(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnCallStateParam prm) {
    }
    
    @java.lang.Override()
    public void onCallTsxState(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnCallTsxStateParam prm) {
    }
    
    private final boolean updateCallInfo() {
        return false;
    }
    
    @java.lang.Override()
    public void onCallMediaState(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnCallMediaStateParam prm) {
    }
    
    @java.lang.Override()
    public void onCallSdpCreated(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnCallSdpCreatedParam prm) {
    }
    
    @java.lang.Override()
    public void onStreamCreated(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnStreamCreatedParam prm) {
    }
    
    @java.lang.Override()
    public void onStreamDestroyed(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnStreamDestroyedParam prm) {
    }
    
    @java.lang.Override()
    public void onDtmfDigit(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnDtmfDigitParam prm) {
    }
    
    @java.lang.Override()
    public void onCallTransferRequest(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnCallTransferRequestParam prm) {
    }
    
    @java.lang.Override()
    public void onCallTransferStatus(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnCallTransferStatusParam prm) {
    }
    
    @java.lang.Override()
    public void onCallReplaceRequest(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnCallReplaceRequestParam prm) {
    }
    
    @java.lang.Override()
    public void onCallReplaced(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnCallReplacedParam prm) {
    }
    
    @java.lang.Override()
    public void onCallRxOffer(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnCallRxOfferParam prm) {
    }
    
    @java.lang.Override()
    public void onCallRxReinvite(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnCallRxReinviteParam prm) {
    }
    
    @java.lang.Override()
    public void onCallTxOffer(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnCallTxOfferParam prm) {
    }
    
    @java.lang.Override()
    public void onInstantMessage(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnInstantMessageParam prm) {
    }
    
    @java.lang.Override()
    public void onInstantMessageStatus(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnInstantMessageStatusParam prm) {
    }
    
    @java.lang.Override()
    public void onTypingIndication(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnTypingIndicationParam prm) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.pjsip.pjsua2.pjsip_redirect_op onCallRedirected(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnCallRedirectedParam prm) {
        return null;
    }
    
    @java.lang.Override()
    public void onCallMediaTransportState(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnCallMediaTransportStateParam prm) {
    }
    
    @java.lang.Override()
    public void onCallMediaEvent(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnCallMediaEventParam prm) {
    }
    
    @java.lang.Override()
    public void onCreateMediaTransport(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnCreateMediaTransportParam prm) {
    }
    
    @java.lang.Override()
    public void onCreateMediaTransportSrtp(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnCreateMediaTransportSrtpParam prm) {
    }
    
    public final void configureCodecs() {
    }
    
    private final boolean codecSetPriority(java.lang.String codec, int priority) {
        return false;
    }
    
    private final boolean isConnectedToWifi() {
        return false;
    }
}