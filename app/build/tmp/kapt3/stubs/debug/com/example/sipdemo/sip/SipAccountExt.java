package com.example.sipdemo.sip;

import java.lang.System;

/**
 * @Author: Wajid.Ali
 * @Date: 8/16/2021
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 =2\u00020\u0001:\u0001=B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001c\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0016J\b\u0010\u001c\u001a\u00020\u000eH\u0016J\u0012\u0010\u001d\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0012\u0010!\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\"H\u0016J\u0012\u0010#\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010%\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010&H\u0016J\u0012\u0010\'\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010(H\u0016J\u0012\u0010)\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010*H\u0016J\u0012\u0010+\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010,H\u0016J\u0012\u0010-\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010.H\u0016J\u0012\u0010/\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u000100H\u0016J\b\u00101\u001a\u00020\nH\u0016J\u0012\u00102\u001a\u00020\n2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u0010\u00105\u001a\u00020\n2\u0006\u00106\u001a\u00020\u000eH\u0016J\u0010\u00107\u001a\u00020\n2\u0006\u00108\u001a\u00020\u0018H\u0016J\b\u00109\u001a\u00020\nH\u0016J\b\u0010:\u001a\u00020\nH\u0014J\b\u0010;\u001a\u00020\nH\u0016J\b\u0010<\u001a\u00020\nH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006>"}, d2 = {"Lcom/example/sipdemo/sip/SipAccountExt;", "Lorg/pjsip/pjsua2/Account;", "()V", "mainActivity", "Lcom/example/sipdemo/ui/MainActivity;", "getMainActivity", "()Lcom/example/sipdemo/ui/MainActivity;", "setMainActivity", "(Lcom/example/sipdemo/ui/MainActivity;)V", "create", "", "cfg", "Lorg/pjsip/pjsua2/AccountConfig;", "make_default", "", "enumBuddies", "Lorg/pjsip/pjsua2/BuddyVector;", "findBuddy", "Lorg/pjsip/pjsua2/Buddy;", "uri", "", "buddy_match", "Lorg/pjsip/pjsua2/FindBuddyMatch;", "getId", "", "getInfo", "Lorg/pjsip/pjsua2/AccountInfo;", "isDefault", "isValid", "modify", "onIncomingCall", "prm", "Lorg/pjsip/pjsua2/OnIncomingCallParam;", "onIncomingSubscribe", "Lorg/pjsip/pjsua2/OnIncomingSubscribeParam;", "onInstantMessage", "Lorg/pjsip/pjsua2/OnInstantMessageParam;", "onInstantMessageStatus", "Lorg/pjsip/pjsua2/OnInstantMessageStatusParam;", "onMwiInfo", "Lorg/pjsip/pjsua2/OnMwiInfoParam;", "onRegStarted", "Lorg/pjsip/pjsua2/OnRegStartedParam;", "onRegState", "Lorg/pjsip/pjsua2/OnRegStateParam;", "onTypingIndication", "Lorg/pjsip/pjsua2/OnTypingIndicationParam;", "presNotify", "Lorg/pjsip/pjsua2/PresNotifyParam;", "setDefault", "setOnlineStatus", "pres_st", "Lorg/pjsip/pjsua2/PresenceStatus;", "setRegistration", "renew", "setTransport", "tp_id", "shutdown", "swigDirectorDisconnect", "swigReleaseOwnership", "swigTakeOwnership", "Companion", "app_debug"})
public final class SipAccountExt extends org.pjsip.pjsua2.Account {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.sipdemo.sip.SipAccountExt.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    private static com.example.sipdemo.sip.CallExt inProgressCall;
    @org.jetbrains.annotations.Nullable()
    private com.example.sipdemo.ui.MainActivity mainActivity;
    
    public SipAccountExt() {
        super(0L, false);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.sipdemo.ui.MainActivity getMainActivity() {
        return null;
    }
    
    public final void setMainActivity(@org.jetbrains.annotations.Nullable()
    com.example.sipdemo.ui.MainActivity p0) {
    }
    
    @java.lang.Override()
    public void onIncomingCall(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnIncomingCallParam prm) {
    }
    
    @java.lang.Override()
    public void onInstantMessage(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnInstantMessageParam prm) {
    }
    
    @java.lang.Override()
    public void onIncomingSubscribe(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnIncomingSubscribeParam prm) {
    }
    
    @java.lang.Override()
    public void onInstantMessageStatus(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnInstantMessageStatusParam prm) {
    }
    
    @java.lang.Override()
    public void onMwiInfo(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnMwiInfoParam prm) {
    }
    
    @java.lang.Override()
    public void onRegStarted(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnRegStartedParam prm) {
    }
    
    @java.lang.Override()
    public void onRegState(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnRegStateParam prm) {
    }
    
    @java.lang.Override()
    public void onTypingIndication(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.OnTypingIndicationParam prm) {
    }
    
    @java.lang.Override()
    public void setOnlineStatus(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.PresenceStatus pres_st) {
    }
    
    @java.lang.Override()
    public void setRegistration(boolean renew) {
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
    public void create(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.AccountConfig cfg, boolean make_default) {
    }
    
    @java.lang.Override()
    public void create(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.AccountConfig cfg) {
    }
    
    @java.lang.Override()
    public void shutdown() {
    }
    
    @java.lang.Override()
    public void modify(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.AccountConfig cfg) {
    }
    
    @java.lang.Override()
    public boolean isValid() {
        return false;
    }
    
    @java.lang.Override()
    public void setDefault() {
    }
    
    @java.lang.Override()
    public boolean isDefault() {
        return false;
    }
    
    @java.lang.Override()
    public int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.pjsip.pjsua2.AccountInfo getInfo() {
        return null;
    }
    
    @java.lang.Override()
    public void setTransport(int tp_id) {
    }
    
    @java.lang.Override()
    public void presNotify(@org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.PresNotifyParam prm) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.pjsip.pjsua2.BuddyVector enumBuddies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.pjsip.pjsua2.Buddy findBuddy(@org.jetbrains.annotations.Nullable()
    java.lang.String uri, @org.jetbrains.annotations.Nullable()
    org.pjsip.pjsua2.FindBuddyMatch buddy_match) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.pjsip.pjsua2.Buddy findBuddy(@org.jetbrains.annotations.Nullable()
    java.lang.String uri) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/sipdemo/sip/SipAccountExt$Companion;", "", "()V", "inProgressCall", "Lcom/example/sipdemo/sip/CallExt;", "getInProgressCall", "()Lcom/example/sipdemo/sip/CallExt;", "setInProgressCall", "(Lcom/example/sipdemo/sip/CallExt;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.sipdemo.sip.CallExt getInProgressCall() {
            return null;
        }
        
        public final void setInProgressCall(@org.jetbrains.annotations.Nullable()
        com.example.sipdemo.sip.CallExt p0) {
        }
    }
}