package com.example.sipdemo.data.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.sipdemo.data.db.enums.Direction

/**
 * @Author: Wajid.Ali
 * @Date: 8/25/2021
 */
@Entity
data class Calls(
    @PrimaryKey(autoGenerate = true) val callId : Long,
    val userId : Long,
    val callDirection : Direction,
    val timeStamp : Long
)
