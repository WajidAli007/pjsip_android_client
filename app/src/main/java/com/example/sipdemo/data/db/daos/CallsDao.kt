package com.example.sipdemo.data.db.daos

import androidx.room.*
import com.example.sipdemo.data.db.entities.Calls
import com.example.sipdemo.data.db.entities.Chat
import com.example.sipdemo.data.db.entities.SipAccount

/**
 * @Author: Wajid.Ali
 * @Date: 8/23/2021
 */

@Dao
interface CallsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCall(call : Calls)

    @Query("SELECT * FROM calls")
    fun getAllCalls() : List<Calls>

    @Delete
    fun deleteCall(call : Calls)

}