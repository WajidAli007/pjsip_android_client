package com.example.sipdemo.sip.events

import org.pjsip.pjsua2.pjsip_status_code

/**
 * @Author: Wajid.Ali
 * @Date: 8/24/2021
 */
data class ConnectionState(
    val status: pjsip_status_code
)
