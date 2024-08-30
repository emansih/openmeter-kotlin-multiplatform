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

import xyz.hisname.openmeter.models.NotificationEventType

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * Defines the common fields for create notification rule request.
 *
 * @param type 
 * @param name The user friendly name of the notification rule.
 * @param channels List of notification channel identifiers or names the rule applies to.
 * @param disabled Whether the rule is disabled or not.
 */
@Serializable

data class NotificationRuleCommonCreateRequest (

    @SerialName(value = "type") @Required val type: NotificationEventType,

    /* The user friendly name of the notification rule. */
    @SerialName(value = "name") @Required val name: kotlin.String,

    /* List of notification channel identifiers or names the rule applies to. */
    @SerialName(value = "channels") @Required val channels: kotlin.collections.List<kotlin.String>,

    /* Whether the rule is disabled or not. */
    @SerialName(value = "disabled") val disabled: kotlin.Boolean? = false

) {


}

