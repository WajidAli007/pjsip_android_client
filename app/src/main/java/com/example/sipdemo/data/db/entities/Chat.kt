package com.example.sipdemo.data.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.sipdemo.data.db.enums.Direction

/**
 * @Author: Wajid.Ali
 * @Date: 8/23/2021
 */

@Entity
data class Chat(
    @PrimaryKey(autoGenerate = true) val chatMessageId : Long,
    val userId : Long,
    val chatDirection : Direction,
    val chatText : String,
    val timeStamp : Long
)