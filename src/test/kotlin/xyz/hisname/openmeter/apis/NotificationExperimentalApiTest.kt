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

package xyz.hisname.openmeter.apis

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import xyz.hisname.openmeter.apis.NotificationExperimentalApi
import xyz.hisname.openmeter.models.ConflictProblem
import xyz.hisname.openmeter.models.NotificationChannel
import xyz.hisname.openmeter.models.NotificationChannelCreateRequest
import xyz.hisname.openmeter.models.NotificationChannelsResponse
import xyz.hisname.openmeter.models.NotificationEventsResponse
import xyz.hisname.openmeter.models.NotificationRule
import xyz.hisname.openmeter.models.NotificationRuleCreateRequest
import xyz.hisname.openmeter.models.NotificationRulesResponse
import xyz.hisname.openmeter.models.Problem
import xyz.hisname.openmeter.models.TestNotificationRule201Response

class NotificationExperimentalApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of NotificationExperimentalApi
        //val apiInstance = NotificationExperimentalApi()

        // to test createNotificationChannel
        should("test createNotificationChannel") {
            // uncomment below to test createNotificationChannel
            //val notificationChannelCreateRequest : NotificationChannelCreateRequest =  // NotificationChannelCreateRequest | The notification channel to create.
            //val result : NotificationChannel = apiInstance.createNotificationChannel(notificationChannelCreateRequest)
            //result shouldBe ("TODO")
        }

        // to test createNotificationRule
        should("test createNotificationRule") {
            // uncomment below to test createNotificationRule
            //val notificationRuleCreateRequest : NotificationRuleCreateRequest =  // NotificationRuleCreateRequest | The notification rule to create.
            //val result : NotificationRule = apiInstance.createNotificationRule(notificationRuleCreateRequest)
            //result shouldBe ("TODO")
        }

        // to test deleteNotificationChannel
        should("test deleteNotificationChannel") {
            // uncomment below to test deleteNotificationChannel
            //val channelId : kotlin.String = 01ARZ3NDEKTSV4RRFFQ69G5FAV // kotlin.String | A unique ULID identifier for a notification channel.
            //apiInstance.deleteNotificationChannel(channelId)
        }

        // to test deleteNotificationRule
        should("test deleteNotificationRule") {
            // uncomment below to test deleteNotificationRule
            //val ruleId : kotlin.String = 01J2XYZEPMCKMBKAHXJZF8S3YQ // kotlin.String | A unique ULID identifier for a notification rule.
            //apiInstance.deleteNotificationRule(ruleId)
        }

        // to test getNotificationChannel
        should("test getNotificationChannel") {
            // uncomment below to test getNotificationChannel
            //val channelId : kotlin.String = 01ARZ3NDEKTSV4RRFFQ69G5FAV // kotlin.String | A unique ULID identifier for a notification channel.
            //val result : NotificationChannel = apiInstance.getNotificationChannel(channelId)
            //result shouldBe ("TODO")
        }

        // to test getNotificationEvent
        should("test getNotificationEvent") {
            // uncomment below to test getNotificationEvent
            //val eventId : kotlin.String = 01J2XYZEPMCKMBKAHXJZF8S3YQ // kotlin.String | A unique ULID identifier for a notification event.
            //val result : TestNotificationRule201Response = apiInstance.getNotificationEvent(eventId)
            //result shouldBe ("TODO")
        }

        // to test getNotificationRule
        should("test getNotificationRule") {
            // uncomment below to test getNotificationRule
            //val ruleId : kotlin.String = 01J2XYZEPMCKMBKAHXJZF8S3YQ // kotlin.String | A unique ULID identifier for a notification rule.
            //val result : NotificationRule = apiInstance.getNotificationRule(ruleId)
            //result shouldBe ("TODO")
        }

        // to test listNotificationChannels
        should("test listNotificationChannels") {
            // uncomment below to test listNotificationChannels
            //val page : kotlin.Int = 1 // kotlin.Int | Page number to return
            //val pageSize : kotlin.Int = 56 // kotlin.Int | Number of entries to return per page
            //val orderBy : kotlin.String = orderBy_example // kotlin.String | Order by field
            //val order : kotlin.String = order_example // kotlin.String | Order by field.  Usage: `?order=ASC` 
            //val includeDisabled : kotlin.Boolean = true // kotlin.Boolean | Include disabled entries.
            //val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | Include deleted entries.
            //val result : NotificationChannelsResponse = apiInstance.listNotificationChannels(page, pageSize, orderBy, order, includeDisabled, includeDeleted)
            //result shouldBe ("TODO")
        }

        // to test listNotificationEvents
        should("test listNotificationEvents") {
            // uncomment below to test listNotificationEvents
            //val page : kotlin.Int = 1 // kotlin.Int | Page number to return
            //val pageSize : kotlin.Int = 56 // kotlin.Int | Number of entries to return per page
            //val orderBy : kotlin.String = orderBy_example // kotlin.String | Order by field
            //val order : kotlin.String = order_example // kotlin.String | Order by field.  Usage: `?order=ASC` 
            //val from : kotlinx.datetime.Instant = 2023-01-01T00:00Z // kotlinx.datetime.Instant | Start date-time in RFC 3339 format. Inclusive. 
            //val to : kotlinx.datetime.Instant = 2023-01-02T00:00Z // kotlinx.datetime.Instant | End date-time in RFC 3339 format. Inclusive. 
            //val feature : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtering by multiple features.  Usage: `?feature=feature-1&feature=feature-2` 
            //val subject : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtering by multiple subjects.  Usage: `?subject=customer-1&subject=customer-2` 
            //val rule : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtering by multiple rules.  Usage: `?rule=ID1&rule=rule=ID2` 
            //val channel : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtering by multiple channels.  Usage: `?channel=ID1&channel=ID2` 
            //val result : NotificationEventsResponse = apiInstance.listNotificationEvents(page, pageSize, orderBy, order, from, to, feature, subject, rule, channel)
            //result shouldBe ("TODO")
        }

        // to test listNotificationRules
        should("test listNotificationRules") {
            // uncomment below to test listNotificationRules
            //val page : kotlin.Int = 1 // kotlin.Int | Page number to return
            //val pageSize : kotlin.Int = 56 // kotlin.Int | Number of entries to return per page
            //val orderBy : kotlin.String = orderBy_example // kotlin.String | Order by field
            //val order : kotlin.String = order_example // kotlin.String | Order by field.  Usage: `?order=ASC` 
            //val includeDisabled : kotlin.Boolean = true // kotlin.Boolean | Include disabled entries.
            //val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | Include deleted entries.
            //val feature : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtering by multiple features.  Usage: `?feature=feature-1&feature=feature-2` 
            //val channel : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtering by multiple notification channels.  Usage: `?channel=channel-1&channel=channel-2` 
            //val result : NotificationRulesResponse = apiInstance.listNotificationRules(page, pageSize, orderBy, order, includeDisabled, includeDeleted, feature, channel)
            //result shouldBe ("TODO")
        }

        // to test testNotificationRule
        should("test testNotificationRule") {
            // uncomment below to test testNotificationRule
            //val ruleId : kotlin.String = 01J2XYZEPMCKMBKAHXJZF8S3YQ // kotlin.String | A unique ULID identifier for a notification rule.
            //val result : TestNotificationRule201Response = apiInstance.testNotificationRule(ruleId)
            //result shouldBe ("TODO")
        }

        // to test updateNotificationChannel
        should("test updateNotificationChannel") {
            // uncomment below to test updateNotificationChannel
            //val channelId : kotlin.String = 01ARZ3NDEKTSV4RRFFQ69G5FAV // kotlin.String | A unique ULID identifier for a notification channel.
            //val notificationChannelCreateRequest : NotificationChannelCreateRequest =  // NotificationChannelCreateRequest | The notification channel to update.
            //val result : NotificationChannel = apiInstance.updateNotificationChannel(channelId, notificationChannelCreateRequest)
            //result shouldBe ("TODO")
        }

        // to test updateNotificationRule
        should("test updateNotificationRule") {
            // uncomment below to test updateNotificationRule
            //val ruleId : kotlin.String = 01J2XYZEPMCKMBKAHXJZF8S3YQ // kotlin.String | A unique ULID identifier for a notification rule.
            //val notificationRuleCreateRequest : NotificationRuleCreateRequest =  // NotificationRuleCreateRequest | The notification rule to update.
            //val result : NotificationRule = apiInstance.updateNotificationRule(ruleId, notificationRuleCreateRequest)
            //result shouldBe ("TODO")
        }

    }
}
