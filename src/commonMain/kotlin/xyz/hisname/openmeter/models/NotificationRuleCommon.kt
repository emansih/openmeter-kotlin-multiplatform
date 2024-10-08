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
import xyz.hisname.openmeter.models.NotificationEventType

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * Common fields for notification rules.
 *
 * @param id A unique identifier for the notification rule.
 * @param type 
 * @param name The user friendly name of the notification rule.
 * @param channels List of notification channels the rule applies to.
 * @param createdAt Timestamp when the rule was created.
 * @param updatedAt Timestamp when the rule was modified.
 * @param disabled Whether the rule is disabled or not.
 * @param deletedAt Timestamp when the channel was deleted.
 */
@Serializable

data class NotificationRuleCommon (

    /* A unique identifier for the notification rule. */
    @SerialName(value = "id") @Required val id: kotlin.String,

    @SerialName(value = "type") @Required val type: NotificationEventType,

    /* The user friendly name of the notification rule. */
    @SerialName(value = "name") @Required val name: kotlin.String,

    /* List of notification channels the rule applies to. */
    @SerialName(value = "channels") @Required val channels: kotlin.collections.List<NotificationChannelMeta>,

    /* Timestamp when the rule was created. */
    @SerialName(value = "createdAt") @Required val createdAt: kotlinx.datetime.Instant,

    /* Timestamp when the rule was modified. */
    @SerialName(value = "updatedAt") @Required val updatedAt: kotlinx.datetime.Instant,

    /* Whether the rule is disabled or not. */
    @SerialName(value = "disabled") @Required val disabled: kotlin.Boolean = false,

    /* Timestamp when the channel was deleted. */
    @SerialName(value = "deletedAt") val deletedAt: kotlinx.datetime.Instant? = null

) {


}

