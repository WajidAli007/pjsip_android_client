package com.example.sipdemo.ui.home

import androidx.lifecycle.ViewModel
import com.example.sipdemo.utils.SipUtils
import timber.log.Timber

class HomeViewModel : ViewModel() {


    fun proceedToCall(sipAddress: String): Boolean {

        if (!SipUtils.isValidSipAddress(sipAddress)) {
            Timber.e("Sip address is invalid")
            throw IllegalStateException("Invalid SIP address")
        }


        return true
    }
}