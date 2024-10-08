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
 * 
 *
 * @param conflictingEntityId The id of the conflicting entity.
 */
@Serializable

data class ConflictProblemExtensions (

    /* The id of the conflicting entity. */
    @SerialName(value = "conflictingEntityId") @Required val conflictingEntityId: kotlin.String

) {


}

