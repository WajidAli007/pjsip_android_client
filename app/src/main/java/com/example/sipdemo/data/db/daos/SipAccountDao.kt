package com.example.sipdemo.data.db.daos

import androidx.room.*
import com.example.sipdemo.data.db.entities.SipAccount

/**
 * @Author: Wajid.Ali
 * @Date: 8/16/2021
 */
@Dao interface SipAccountDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertSipAccount(account : SipAccount)

    @Query("SELECT * FROM sipaccount")
    fun getSipAccounts() : List<SipAccount>

    @Query("SELECT * FROM sipaccount WHERE userName = :userName")
    fun getSipAccountByUsername(userName : String) : SipAccount?

    @Delete
    fun deleteAccount(account: SipAccount)
}