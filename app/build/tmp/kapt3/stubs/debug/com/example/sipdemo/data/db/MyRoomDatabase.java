package com.example.sipdemo.data.db;

import java.lang.System;

/**
 * @Author: Wajid.Ali
 * @Date: 8/16/2021
 */
@androidx.room.Database(version = 2, entities = {com.example.sipdemo.data.db.entities.SipAccount.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/sipdemo/data/db/MyRoomDatabase;", "Landroidx/room/RoomDatabase;", "()V", "sipAccountDao", "Lcom/example/sipdemo/data/db/daos/SipAccountDao;", "Companion", "app_debug"})
public abstract class MyRoomDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.sipdemo.data.db.MyRoomDatabase.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy db$delegate = null;
    private static final androidx.room.migration.Migration MIGRATION_1_2 = null;
    
    public MyRoomDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.sipdemo.data.db.daos.SipAccountDao sipAccountDao();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/example/sipdemo/data/db/MyRoomDatabase$Companion;", "", "()V", "MIGRATION_1_2", "Landroidx/room/migration/Migration;", "db", "Lcom/example/sipdemo/data/db/MyRoomDatabase;", "getDb", "()Lcom/example/sipdemo/data/db/MyRoomDatabase;", "db$delegate", "Lkotlin/Lazy;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.sipdemo.data.db.MyRoomDatabase getDb() {
            return null;
        }
    }
}