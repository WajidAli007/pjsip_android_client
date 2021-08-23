package com.example.sipdemo.sip;

import java.lang.System;

/**
 * @Author: Wajid.Ali
 * @Date: 8/16/2021
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00ea\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\u000e\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u0013\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\fH\u0016J\b\u0010\u0016\u001a\u00020\fH\u0016J\b\u0010\u0017\u001a\u00020\fH\u0016J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\fH\u0016J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0019H\u0016J\u0012\u0010 \u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020$H\u0016J\u0012\u0010%\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\'\u001a\u00020\fH\u0016J\b\u0010(\u001a\u00020\fH\u0016J\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\u0019H\u0016J\u0012\u0010,\u001a\u00020\f2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u000200H\u0016J\u0012\u00101\u001a\u00020$2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u00102\u001a\u00020\u0019H\u0016J\u0012\u00103\u001a\u00020\f2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0012\u00104\u001a\u00020\f2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u001a\u00104\u001a\u00020\f2\b\u00105\u001a\u0004\u0018\u0001062\u0006\u00107\u001a\u00020$H\u0016J$\u00108\u001a\u00020\f2\b\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u00020$2\b\u0010<\u001a\u0004\u0018\u000106H\u0016J\b\u0010=\u001a\u00020\fH\u0016J\b\u0010>\u001a\u00020?H\u0016J\u001a\u0010@\u001a\u00020\f2\b\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u00020$H\u0016J\u0012\u0010A\u001a\u00020\f2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\u0012\u0010D\u001a\u00020\f2\b\u0010B\u001a\u0004\u0018\u00010EH\u0016J\u0012\u0010F\u001a\u00020\f2\b\u0010B\u001a\u0004\u0018\u00010GH\u0016J\u0012\u0010H\u001a\u00020\f2\b\u0010B\u001a\u0004\u0018\u00010IH\u0016J\u0012\u0010J\u001a\u00020\f2\b\u0010B\u001a\u0004\u0018\u00010KH\u0016J\u0012\u0010L\u001a\u00020\f2\b\u0010B\u001a\u0004\u0018\u00010MH\u0016J\u0012\u0010N\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010O\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010P\u001a\u00020:H\u0016J\b\u0010Q\u001a\u00020\fH\u0014J\b\u0010R\u001a\u00020\fH\u0016J\b\u0010S\u001a\u00020\fH\u0016J\u0010\u0010T\u001a\u00020\f2\u0006\u0010U\u001a\u00020\u001eH\u0016J\u001c\u0010V\u001a\u00020\u001e2\b\u0010W\u001a\u0004\u0018\u00010X2\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0016J\b\u0010[\u001a\u00020\\H\u0016J\u0010\u0010]\u001a\u00020^2\u0006\u0010U\u001a\u00020\u001eH\u0016J\u0018\u0010_\u001a\u00020\f2\u0006\u0010U\u001a\u00020\u001e2\u0006\u0010`\u001a\u00020$H\u0016J\u0012\u0010a\u001a\u00020\f2\b\u0010b\u001a\u0004\u0018\u000106H\u0016J\u0012\u0010c\u001a\u00020\f2\b\u0010d\u001a\u0004\u0018\u00010eH\u0016J$\u0010f\u001a\u00020\f2\u0006\u0010g\u001a\u00020\u001e2\b\u0010h\u001a\u0004\u0018\u00010\n2\b\u0010i\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010f\u001a\u00020\f2\b\u0010j\u001a\u0004\u0018\u00010kH\u0016J\b\u0010l\u001a\u00020\\H\u0016J\u0010\u0010m\u001a\u00020\n2\u0006\u0010n\u001a\u00020\u001eH\u0016J\u0012\u0010o\u001a\u00020\f2\b\u0010p\u001a\u0004\u0018\u000106H\u0016J\u001a\u0010q\u001a\u0002062\u0006\u0010r\u001a\u00020\u00192\b\u0010<\u001a\u0004\u0018\u000106H\u0016J\u0012\u0010s\u001a\u00020\u001e2\b\u0010t\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010u\u001a\u00020\u001e2\b\u0010t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010v\u001a\u00020wH\u0016J\b\u0010x\u001a\u00020\u0006H\u0016J\u001a\u0010y\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016\u00a8\u0006z"}, d2 = {"Lcom/example/sipdemo/sip/LocalEndPoint;", "Lorg/pjsip/pjsua2/Endpoint;", "()V", "audDevManager", "Lorg/pjsip/pjsua2/AudDevManager;", "codecEnum", "Lorg/pjsip/pjsua2/CodecInfoVector;", "codecGetParam", "Lorg/pjsip/pjsua2/CodecParam;", "codec_id", "", "codecSetParam", "", "param", "codecSetPriority", "priority", "", "getVideoCodecParam", "Lorg/pjsip/pjsua2/VidCodecParam;", "handleIpChange", "Lorg/pjsip/pjsua2/IpChangeParam;", "hangupAllCalls", "libCreate", "libDestroy", "prmFlags", "", "libDestroy_", "libGetState", "Lorg/pjsip/pjsua2/pjsua_state;", "libHandleEvents", "", "msec_timeout", "libInit", "prmEpConfig", "Lorg/pjsip/pjsua2/EpConfig;", "libIsThreadRegistered", "", "libRegisterThread", "name", "libStart", "libStopWorkerThreads", "libVersion", "Lorg/pjsip/pjsua2/Version;", "mediaActivePorts", "mediaAdd", "media", "Lorg/pjsip/pjsua2/AudioMedia;", "mediaEnumPorts", "Lorg/pjsip/pjsua2/AudioMediaVector;", "mediaExists", "mediaMaxPorts", "mediaRemove", "natCancelCheckStunServers", "token", "Lorg/pjsip/pjsua2/SWIGTYPE_p_void;", "notify_cb", "natCheckStunServers", "prmServers", "Lorg/pjsip/pjsua2/StringVector;", "prmWait", "prmUserData", "natDetectType", "natGetType", "Lorg/pjsip/pjsua2/pj_stun_nat_type;", "natUpdateStunServers", "onIpChangeProgress", "prm", "Lorg/pjsip/pjsua2/OnIpChangeProgressParam;", "onNatCheckStunServersComplete", "Lorg/pjsip/pjsua2/OnNatCheckStunServersCompleteParam;", "onNatDetectionComplete", "Lorg/pjsip/pjsua2/OnNatDetectionCompleteParam;", "onSelectAccount", "Lorg/pjsip/pjsua2/OnSelectAccountParam;", "onTimer", "Lorg/pjsip/pjsua2/OnTimerParam;", "onTransportState", "Lorg/pjsip/pjsua2/OnTransportStateParam;", "resetVideoCodecParam", "setVideoCodecParam", "srtpCryptoEnum", "swigDirectorDisconnect", "swigReleaseOwnership", "swigTakeOwnership", "transportClose", "id", "transportCreate", "type", "Lorg/pjsip/pjsua2/pjsip_transport_type_e;", "cfg", "Lorg/pjsip/pjsua2/TransportConfig;", "transportEnum", "Lorg/pjsip/pjsua2/IntVector;", "transportGetInfo", "Lorg/pjsip/pjsua2/TransportInfo;", "transportSetEnable", "enabled", "transportShutdown", "tp", "utilAddPendingJob", "job", "Lorg/pjsip/pjsua2/PendingJob;", "utilLogWrite", "prmLevel", "prmSender", "prmMsg", "e", "Lorg/pjsip/pjsua2/LogEntry;", "utilSslGetAvailableCiphers", "utilStrError", "prmErr", "utilTimerCancel", "prmToken", "utilTimerSchedule", "prmMsecDelay", "utilVerifySipUri", "prmUri", "utilVerifyUri", "vidDevManager", "Lorg/pjsip/pjsua2/VidDevManager;", "videoCodecEnum", "videoCodecSetPriority", "app_debug"})
public final class LocalEndPoint extends org.pjsip.pjsua2.Endpoint {
    
    public LocalEndPoint() {
        super(0L, false);
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
    
    @java.lang.Override()
    public void libDestroy(long prmFlags) {
    }
    
    @java.lang.Override()
    public void libDestroy() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.pjsip.pjsua2.Version libVersion() {
        return null;
    }
    
    @java.lang.Override()
    public void libCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.pjsip.pjsua2.pjsua_state libGetState() {
        return null;
    }
    
    @java.lang.Override()
    public void libInit(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.EpConfig prmEpConfig) {
    }
    
    @java.lang.Override()
    public void libStart() {
    }
    
    @java.lang.Override()
    public void libRegisterThread(@org.jetbrains.annotations.Nullable()
    java.lang.String name) {
    }
    
    @java.lang.Override()
    public boolean libIsThreadRegistered() {
        return false;
    }
    
    @java.lang.Override()
    public void libStopWorkerThreads() {
    }
    
    @java.lang.Override()
    public int libHandleEvents(long msec_timeout) {
        return 0;
    }
    
    @java.lang.Override()
    public void libDestroy_(long prmFlags) {
    }
    
    @java.lang.Override()
    public void libDestroy_() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String utilStrError(int prmErr) {
        return null;
    }
    
    @java.lang.Override()
    public void utilLogWrite(int prmLevel, @org.jetbrains.annotations.Nullable()
    java.lang.String prmSender, @org.jetbrains.annotations.Nullable()
    java.lang.String prmMsg) {
    }
    
    @java.lang.Override()
    public void utilLogWrite(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.LogEntry e) {
    }
    
    @java.lang.Override()
    public int utilVerifySipUri(@org.jetbrains.annotations.Nullable()
    java.lang.String prmUri) {
        return 0;
    }
    
    @java.lang.Override()
    public int utilVerifyUri(@org.jetbrains.annotations.Nullable()
    java.lang.String prmUri) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.pjsip.pjsua2.SWIGTYPE_p_void utilTimerSchedule(long prmMsecDelay, @org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.SWIGTYPE_p_void prmUserData) {
        return null;
    }
    
    @java.lang.Override()
    public void utilTimerCancel(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.SWIGTYPE_p_void prmToken) {
    }
    
    @java.lang.Override()
    public void utilAddPendingJob(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.PendingJob job) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.pjsip.pjsua2.IntVector utilSslGetAvailableCiphers() {
        return null;
    }
    
    @java.lang.Override()
    public void natDetectType() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.pjsip.pjsua2.pj_stun_nat_type natGetType() {
        return null;
    }
    
    @java.lang.Override()
    public void natUpdateStunServers(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.StringVector prmServers, boolean prmWait) {
    }
    
    @java.lang.Override()
    public void natCheckStunServers(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.StringVector prmServers, boolean prmWait, @org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.SWIGTYPE_p_void prmUserData) {
    }
    
    @java.lang.Override()
    public void natCancelCheckStunServers(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.SWIGTYPE_p_void token, boolean notify_cb) {
    }
    
    @java.lang.Override()
    public void natCancelCheckStunServers(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.SWIGTYPE_p_void token) {
    }
    
    @java.lang.Override()
    public int transportCreate(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.pjsip_transport_type_e type, @org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.TransportConfig cfg) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.pjsip.pjsua2.IntVector transportEnum() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.pjsip.pjsua2.TransportInfo transportGetInfo(int id) {
        return null;
    }
    
    @java.lang.Override()
    public void transportSetEnable(int id, boolean enabled) {
    }
    
    @java.lang.Override()
    public void transportClose(int id) {
    }
    
    @java.lang.Override()
    public void transportShutdown(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.SWIGTYPE_p_void tp) {
    }
    
    @java.lang.Override()
    public void hangupAllCalls() {
    }
    
    @java.lang.Override()
    public void mediaAdd(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.AudioMedia media) {
    }
    
    @java.lang.Override()
    public void mediaRemove(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.AudioMedia media) {
    }
    
    @java.lang.Override()
    public boolean mediaExists(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.AudioMedia media) {
        return false;
    }
    
    @java.lang.Override()
    public long mediaMaxPorts() {
        return 0L;
    }
    
    @java.lang.Override()
    public long mediaActivePorts() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.pjsip.pjsua2.AudioMediaVector mediaEnumPorts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.pjsip.pjsua2.AudDevManager audDevManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.pjsip.pjsua2.VidDevManager vidDevManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.pjsip.pjsua2.CodecInfoVector codecEnum() {
        return null;
    }
    
    @java.lang.Override()
    public void codecSetPriority(@org.jetbrains.annotations.Nullable()
    java.lang.String codec_id, short priority) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.pjsip.pjsua2.CodecParam codecGetParam(@org.jetbrains.annotations.Nullable()
    java.lang.String codec_id) {
        return null;
    }
    
    @java.lang.Override()
    public void codecSetParam(@org.jetbrains.annotations.Nullable()
    java.lang.String codec_id, @org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.CodecParam param) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.pjsip.pjsua2.CodecInfoVector videoCodecEnum() {
        return null;
    }
    
    @java.lang.Override()
    public void videoCodecSetPriority(@org.jetbrains.annotations.Nullable()
    java.lang.String codec_id, short priority) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.pjsip.pjsua2.VidCodecParam getVideoCodecParam(@org.jetbrains.annotations.Nullable()
    java.lang.String codec_id) {
        return null;
    }
    
    @java.lang.Override()
    public void setVideoCodecParam(@org.jetbrains.annotations.Nullable()
    java.lang.String codec_id, @org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.VidCodecParam param) {
    }
    
    @java.lang.Override()
    public void resetVideoCodecParam(@org.jetbrains.annotations.Nullable()
    java.lang.String codec_id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.pjsip.pjsua2.StringVector srtpCryptoEnum() {
        return null;
    }
    
    @java.lang.Override()
    public void handleIpChange(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.IpChangeParam param) {
    }
    
    @java.lang.Override()
    public void onNatDetectionComplete(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnNatDetectionCompleteParam prm) {
    }
    
    @java.lang.Override()
    public void onNatCheckStunServersComplete(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnNatCheckStunServersCompleteParam prm) {
    }
    
    @java.lang.Override()
    public void onTransportState(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnTransportStateParam prm) {
    }
    
    @java.lang.Override()
    public void onTimer(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnTimerParam prm) {
    }
    
    @java.lang.Override()
    public void onSelectAccount(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnSelectAccountParam prm) {
    }
    
    @java.lang.Override()
    public void onIpChangeProgress(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnIpChangeProgressParam prm) {
    }
}