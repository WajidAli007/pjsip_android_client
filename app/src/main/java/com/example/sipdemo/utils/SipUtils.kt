package com.example.sipdemo.utils

/**
 * @Author: Wajid.Ali
 * @Date: 9/20/2021
 */
object SipUtils {

    fun isValidSipAddress(sipAddress : String) : Boolean{
        return sipAddress.contains('@')
    }

    fun getUserNameFromSipUri(sipAddressArg: String) : String{
        val sipAddress = sipAddressArg.replace("<", "").replace(">", "")
        return if(sipAddress.isNotEmpty()){
            val removedStartingDelimiter =
            if(sipAddress.contains(":")){
                sipAddress.split(":").lastOrNull() ?: sipAddress
            }else{
                sipAddress
            }
            if(removedStartingDelimiter.contains("@")){
                removedStartingDelimiter.split("@").firstOrNull() ?: removedStartingDelimiter
            }else removedStartingDelimiter
        }else ""
    }

    fun getDomainFromSipAddress(sipAddressArg: String) : String{
        val sipAddress = sipAddressArg.replace("<", "").replace(">", "")
        return if(sipAddress.isNotEmpty()){
            val removedStartingDelimiter =
                if(sipAddress.contains(":")){
                    sipAddress.split(":").lastOrNull() ?: sipAddress
                }else{
                    sipAddress
                }
            if(removedStartingDelimiter.contains("@")){
                removedStartingDelimiter.split("@").lastOrNull() ?: removedStartingDelimiter
            }else removedStartingDelimiter
        }else ""
    }

}