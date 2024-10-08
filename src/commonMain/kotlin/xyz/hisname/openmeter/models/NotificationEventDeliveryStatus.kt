/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package xyz.hisname.openmeter.models

import xyz.hisname.openmeter.models.NotificationChannelMeta

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param channel 
 * @param state 
 * @param updatedAt 
 * @param reason 
 */
@Serializable

data class NotificationEventDeliveryStatus (

    @SerialName(value = "channel") @Required val channel: NotificationChannelMeta,

    @SerialName(value = "state") @Required val state: NotificationEventDeliveryStatus.State,

    @SerialName(value = "updatedAt") @Required val updatedAt: kotlinx.datetime.Instant,

    @SerialName(value = "reason") val reason: kotlin.String? = null

) {

    /**
     * 
     *
     * Values: SUCCESS,FAILED,SENDING,PENDING
     */
    @Serializable
    enum class State(val value: kotlin.String) {
        @SerialName(value = "SUCCESS") SUCCESS("SUCCESS"),
        @SerialName(value = "FAILED") FAILED("FAILED"),
        @SerialName(value = "SENDING") SENDING("SENDING"),
        @SerialName(value = "PENDING") PENDING("PENDING");
    }

}

