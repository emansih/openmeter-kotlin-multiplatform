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


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * CloudEvents Specification JSON Schema
 *
 * @param id Identifies the event.
 * @param source Identifies the context in which an event happened.
 * @param specversion The version of the CloudEvents specification which the event uses.
 * @param type Describes the type of event related to the originating occurrence.
 * @param subject Describes the subject of the event in the context of the event producer (identified by source).
 * @param datacontenttype Content type of the data value. Must adhere to RFC 2046 format.
 * @param dataschema Identifies the schema that data adheres to.
 * @param time Timestamp of when the occurrence happened. Must adhere to RFC 3339.
 * @param `data` The event payload.
 */
@Serializable

data class Event (

    /* Identifies the event. */
    @SerialName(value = "id") @Required val id: kotlin.String,

    /* Identifies the context in which an event happened. */
    @SerialName(value = "source") @Required val source: kotlin.String,

    /* The version of the CloudEvents specification which the event uses. */
    @SerialName(value = "specversion") @Required val specversion: kotlin.String,

    /* Describes the type of event related to the originating occurrence. */
    @SerialName(value = "type") @Required val type: kotlin.String,

    /* Describes the subject of the event in the context of the event producer (identified by source). */
    @SerialName(value = "subject") @Required val subject: kotlin.String,

    /* Content type of the data value. Must adhere to RFC 2046 format. */
    @SerialName(value = "datacontenttype") val datacontenttype: Event.Datacontenttype? = null,

    /* Identifies the schema that data adheres to. */
    @SerialName(value = "dataschema") val dataschema: kotlin.String? = null,

    /* Timestamp of when the occurrence happened. Must adhere to RFC 3339. */
    @SerialName(value = "time") val time: kotlinx.datetime.Instant? = null,

    /* The event payload. */
    @SerialName(value = "data") val `data`: kotlin.collections.Map<kotlin.String, kotlin.String>? = null

) {

    /**
     * Content type of the data value. Must adhere to RFC 2046 format.
     *
     * Values: applicationSlashJson
     */
    @Serializable
    enum class Datacontenttype(val value: kotlin.String) {
        @SerialName(value = "application/json") applicationSlashJson("application/json");
    }

}

