package com.example.sipdemo.ui.dial

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sipdemo.data.db.MyRoomDatabase
import com.example.sipdemo.data.db.entities.Calls
import com.example.sipdemo.data.db.entities.SipAccount
import com.example.sipdemo.data.db.enums.Direction
import com.example.sipdemo.sip.SipService
import com.example.sipdemo.utils.SipUtils
import timber.log.Timber

class DialViewModel : ViewModel() {



    fun proceedToCall(sipAddress : String) : Boolean{

        if(!SipUtils.isValidSipAddress(sipAddress)){
            Timber.e("Sip address is invalid")
            throw IllegalStateException("Invalid SIP address")
        }


        return true
    }
}