package com.example.sipdemo.data.db.daos;

import java.lang.System;

/**
 * @Author: Wajid.Ali
 * @Date: 8/16/2021
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\t"}, d2 = {"Lcom/example/sipdemo/data/db/daos/SipAccountDao;", "", "deleteAccount", "", "account", "Lcom/example/sipdemo/data/db/entities/SipAccount;", "getSipAccounts", "", "insertSipAccount", "app_debug"})
public abstract interface SipAccountDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertSipAccount(@org.jetbrains.annotations.NotNull()
    com.example.sipdemo.data.db.entities.SipAccount account);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM sipaccount")
    public abstract java.util.List<com.example.sipdemo.data.db.entities.SipAccount> getSipAccounts();
    
    @androidx.room.Delete()
    public abstract void deleteAccount(@org.jetbrains.annotations.NotNull()
    com.example.sipdemo.data.db.entities.SipAccount account);
}