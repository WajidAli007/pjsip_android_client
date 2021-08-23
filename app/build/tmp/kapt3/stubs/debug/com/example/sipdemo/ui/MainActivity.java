package com.example.sipdemo.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001*B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0002J\u0012\u0010&\u001a\u00020$2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\b\u0010)\u001a\u00020$H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006+"}, d2 = {"Lcom/example/sipdemo/ui/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "acc", "Lcom/example/sipdemo/sip/SipAccountExt;", "getAcc", "()Lcom/example/sipdemo/sip/SipAccountExt;", "setAcc", "(Lcom/example/sipdemo/sip/SipAccountExt;)V", "accountConfig", "Lorg/pjsip/pjsua2/AccountConfig;", "getAccountConfig", "()Lorg/pjsip/pjsua2/AccountConfig;", "setAccountConfig", "(Lorg/pjsip/pjsua2/AccountConfig;)V", "binding", "Lcom/example/sipdemo/databinding/ActivityMainBinding;", "endPoint", "Lcom/example/sipdemo/sip/LocalEndPoint;", "getEndPoint", "()Lcom/example/sipdemo/sip/LocalEndPoint;", "setEndPoint", "(Lcom/example/sipdemo/sip/LocalEndPoint;)V", "epConfig", "Lorg/pjsip/pjsua2/EpConfig;", "getEpConfig", "()Lorg/pjsip/pjsua2/EpConfig;", "setEpConfig", "(Lorg/pjsip/pjsua2/EpConfig;)V", "transportConfig", "Lorg/pjsip/pjsua2/TransportConfig;", "getTransportConfig", "()Lorg/pjsip/pjsua2/TransportConfig;", "setTransportConfig", "(Lorg/pjsip/pjsua2/TransportConfig;)V", "disposeSip", "", "initSip", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "LogWriter", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.sipdemo.databinding.ActivityMainBinding binding;
    public com.example.sipdemo.sip.LocalEndPoint endPoint;
    public org.pjsip.pjsua2.EpConfig epConfig;
    public org.pjsip.pjsua2.TransportConfig transportConfig;
    public org.pjsip.pjsua2.AccountConfig accountConfig;
    public com.example.sipdemo.sip.SipAccountExt acc;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.sipdemo.sip.LocalEndPoint getEndPoint() {
        return null;
    }
    
    public final void setEndPoint(@org.jetbrains.annotations.NotNull()
    com.example.sipdemo.sip.LocalEndPoint p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.pjsip.pjsua2.EpConfig getEpConfig() {
        return null;
    }
    
    public final void setEpConfig(@org.jetbrains.annotations.NotNull()
    org.pjsip.pjsua2.EpConfig p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.pjsip.pjsua2.TransportConfig getTransportConfig() {
        return null;
    }
    
    public final void setTransportConfig(@org.jetbrains.annotations.NotNull()
    org.pjsip.pjsua2.TransportConfig p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.pjsip.pjsua2.AccountConfig getAccountConfig() {
        return null;
    }
    
    public final void setAccountConfig(@org.jetbrains.annotations.NotNull()
    org.pjsip.pjsua2.AccountConfig p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.sipdemo.sip.SipAccountExt getAcc() {
        return null;
    }
    
    public final void setAcc(@org.jetbrains.annotations.NotNull()
    com.example.sipdemo.sip.SipAccountExt p0) {
    }
    
    private final void initSip() {
    }
    
    private final void disposeSip() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/example/sipdemo/ui/MainActivity$LogWriter;", "Lorg/pjsip/pjsua2/LogWriter;", "()V", "write", "", "entry", "Lorg/pjsip/pjsua2/LogEntry;", "app_debug"})
    static final class LogWriter extends org.pjsip.pjsua2.LogWriter {
        
        public LogWriter() {
            super(0L, false);
        }
        
        @java.lang.Override()
        public void write(@org.jetbrains.annotations.Nullable()
        org.pjsip.pjsua2.LogEntry entry) {
        }
    }
}