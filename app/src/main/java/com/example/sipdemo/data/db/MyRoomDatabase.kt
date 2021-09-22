package com.example.sipdemo.data.db

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.sipdemo.App
import com.example.sipdemo.data.db.daos.CallsDao
import com.example.sipdemo.data.db.daos.SipAccountDao
import com.example.sipdemo.data.db.entities.Calls
import com.example.sipdemo.data.db.entities.SipAccount

/**
 * @Author: Wajid.Ali
 * @Date: 8/16/2021
 */

@Database(version = 3, entities = [SipAccount::class, Calls::class])
abstract class MyRoomDatabase : RoomDatabase() {

    companion object {

        val db: MyRoomDatabase by lazy {
            val room = Room.databaseBuilder(
                App.getInstance(),
                MyRoomDatabase::class.java,
                "db_sip_exp"
            )
            room.allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()
        }
    }

    abstract fun sipAccountDao(): SipAccountDao
    abstract fun callsDao(): CallsDao
}