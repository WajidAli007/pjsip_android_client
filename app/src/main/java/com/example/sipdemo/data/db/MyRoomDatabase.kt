package com.example.sipdemo.data.db

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.sipdemo.App
import com.example.sipdemo.data.db.daos.SipAccountDao
import com.example.sipdemo.data.db.entities.SipAccount

/**
 * @Author: Wajid.Ali
 * @Date: 8/16/2021
 */

@Database(version = 2, entities = [SipAccount::class])
abstract class MyRoomDatabase : RoomDatabase() {

    companion object {

        val db: MyRoomDatabase by lazy {
            val room = Room.databaseBuilder(
                App.getInstance(),
                MyRoomDatabase::class.java,
                "db_sip_exp"
            )
            room.allowMainThreadQueries()
            room.addMigrations(MIGRATION_1_2)
            room.build()
        }

        private val MIGRATION_1_2 : Migration = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("ALTER TABLE sipaccount ADD COLUMN port TEXT default '5060'")
                database.execSQL("ALTER TABLE sipaccount ADD Column transport TEXT default 'TLS'")
            }
        }
    }

    abstract fun sipAccountDao(): SipAccountDao
}