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

import xyz.hisname.openmeter.models.ConflictProblemExtensions

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * Conflict
 *
 * @param type Type contains a URI that identifies the problem type.
 * @param title A a short, human-readable summary of the problem type.
 * @param status The HTTP status code generated by the origin server for this occurrence of the problem.
 * @param detail A human-readable explanation specific to this occurrence of the problem.
 * @param instance A URI reference that identifies the specific occurrence of the problem.
 * @param extensions 
 */
@Serializable

data class ConflictProblem (

    /* Type contains a URI that identifies the problem type. */
    @SerialName(value = "type") @Required val type: kotlin.String,

    /* A short, human-readable summary of the problem type. */
    @SerialName(value = "title") @Required val title: kotlin.String,

    /* The HTTP status code generated by the origin server for this occurrence of the problem. */
    @SerialName(value = "status") @Required val status: kotlin.Int,

    /* A human-readable explanation specific to this occurrence of the problem. */
    @SerialName(value = "detail") @Required val detail: kotlin.String,

    /* A URI reference that identifies the specific occurrence of the problem. */
    @SerialName(value = "instance") val instance: kotlin.String? = null,

    @SerialName(value = "extensions") val extensions: ConflictProblemExtensions? = null

)

