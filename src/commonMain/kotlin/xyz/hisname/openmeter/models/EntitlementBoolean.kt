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

import xyz.hisname.openmeter.models.Period
import xyz.hisname.openmeter.models.RecurringPeriod

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * Entitles a subject to use a feature. 
 *
 * @param featureKey The feature the subject is entitled to use. Either featureKey or featureId is required. 
 * @param featureId The feature the subject is entitled to use. Either featureKey or featureId is required. 
 * @param type 
 * @param id Readonly unique ULID identifier. 
 * @param createdAt The date and time the resource was created.
 * @param updatedAt The date and time the resource was last updated. The initial value is the same as createdAt.
 * @param subjectKey The identifier key unique to the subject
 * @param metadata Additional metadata for the feature. 
 * @param usagePeriod 
 * @param deletedAt The date and time the resource was deleted.
 * @param currentUsagePeriod 
 */
@Serializable

data class EntitlementBoolean (

    /* The feature the subject is entitled to use. Either featureKey or featureId is required.  */
    @SerialName(value = "featureKey") @Required val featureKey: kotlin.String,

    /* The feature the subject is entitled to use. Either featureKey or featureId is required.  */
    @SerialName(value = "featureId") @Required val featureId: kotlin.String,

    @SerialName(value = "type") @Required val type: EntitlementBoolean.Type,

    /* Readonly unique ULID identifier.  */
    @SerialName(value = "id") @Required val id: kotlin.String,

    /* The date and time the resource was created. */
    @SerialName(value = "createdAt") @Required val createdAt: kotlinx.datetime.Instant,

    /* The date and time the resource was last updated. The initial value is the same as createdAt. */
    @SerialName(value = "updatedAt") @Required val updatedAt: kotlinx.datetime.Instant,

    /* The identifier key unique to the subject */
    @SerialName(value = "subjectKey") @Required val subjectKey: kotlin.String,

    /* Additional metadata for the feature.  */
    @SerialName(value = "metadata") val metadata: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    @SerialName(value = "usagePeriod") val usagePeriod: RecurringPeriod? = null,

    /* The date and time the resource was deleted. */
    @SerialName(value = "deletedAt") val deletedAt: kotlinx.datetime.Instant? = null,

    @SerialName(value = "currentUsagePeriod") val currentUsagePeriod: Period? = null

) {

    /**
     * 
     *
     * Values: boolean
     */
    @Serializable
    enum class Type(val value: kotlin.String) {
        @SerialName(value = "boolean") boolean("boolean");
    }

}

