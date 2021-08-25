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
    fun insertChat(call : Calls)

    @Query("SELECT * FROM calls")
    fun getAllChats() : List<Calls>

    @Delete
    fun deleteChat(call : Calls)

    @Query("SELECT DISTINCT userId from chat")
    fun getChatUniqueUsers() : List<Long>

    @Query("SELECT * FROM chat WHERE userId = :userId ORDER BY timeStamp")
    fun getUserChatHistory(userId : Long) : List<Chat>

}