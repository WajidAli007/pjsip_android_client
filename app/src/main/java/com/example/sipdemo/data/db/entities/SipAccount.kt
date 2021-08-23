package com.example.sipdemo.data.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.sipdemo.data.db.enums.TransportTypeEnum
import org.pjsip.pjsua2.pjsip_transport_type_e

/**
 * @Author: Wajid.Ali
 * @Date: 8/16/2021
 */

@Entity data class SipAccount(
    @PrimaryKey(autoGenerate = true) val sipAccountId : Long,
    val domain : String,
    val userName : String,
    val displayName : String,
    val password : String,
    val port : String = "5060",
    val transport : String,
    val isSelf : Boolean = false
){

    fun getTransportType() : TransportTypeEnum{
        return when {
            transport.contentEquals("TLS", true) -> {
                TransportTypeEnum.TLS
            }
            transport.contentEquals("TCP", true) -> {
                TransportTypeEnum.TCP
            }
            transport.contentEquals("UDP", true) -> {
                TransportTypeEnum.UDP
            }
            else -> {
                TransportTypeEnum.TLS
            }
        }
    }

    fun getTransportTypeInPJSipTerms() : pjsip_transport_type_e {
        return when {
            transport.contentEquals("TLS", true) -> {
                pjsip_transport_type_e.PJSIP_TRANSPORT_TLS
            }
            transport.contentEquals("TCP", true) -> {
                pjsip_transport_type_e.PJSIP_TRANSPORT_TCP
            }
            transport.contentEquals("UDP", true) -> {
                pjsip_transport_type_e.PJSIP_TRANSPORT_UDP
            }
            else -> {
                pjsip_transport_type_e.PJSIP_TRANSPORT_TLS
            }
        }
    }
}
