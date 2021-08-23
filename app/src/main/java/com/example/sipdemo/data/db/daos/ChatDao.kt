package com.example.sipdemo.data.db.daos

import androidx.room.*
import com.example.sipdemo.data.db.entities.Chat
import com.example.sipdemo.data.db.entities.SipAccount

/**
 * @Author: Wajid.Ali
 * @Date: 8/23/2021
 */

@Dao
interface ChatDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertChat(chat : Chat)

    @Query("SELECT * FROM chat")
    fun getAllChats() : List<Chat>

    @Delete
    fun deleteChat(chat: Chat)

    @Query("SELECT DISTINCT userId from chat")
    fun getChatUniqueUsers() : List<Long>

    @Query("SELECT * FROM chat WHERE userId = :userId ORDER BY timeStamp")
    fun getUserChatHistory(userId : Long) : List<Chat>

}