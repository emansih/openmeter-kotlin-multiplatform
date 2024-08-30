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

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import xyz.hisname.openmeter.models.NotificationRuleCreateRequest
import xyz.hisname.openmeter.models.NotificationEventType
import xyz.hisname.openmeter.models.NotificationRuleBalanceThresholdCreateRequest
import xyz.hisname.openmeter.models.NotificationRuleBalanceThresholdValue

class NotificationRuleCreateRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of NotificationRuleCreateRequest
        //val modelInstance = NotificationRuleCreateRequest()

        // to test the property `type`
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `name` - The user friendly name of the notification rule.
        should("test name") {
            // uncomment below to test the property
            //modelInstance.name shouldBe ("TODO")
        }

        // to test the property `channels` - List of notification channel identifiers or names the rule applies to.
        should("test channels") {
            // uncomment below to test the property
            //modelInstance.channels shouldBe ("TODO")
        }

        // to test the property `thresholds` - List of thresholds the rule suppose to be triggered.
        should("test thresholds") {
            // uncomment below to test the property
            //modelInstance.thresholds shouldBe ("TODO")
        }

        // to test the property `disabled` - Whether the rule is disabled or not.
        should("test disabled") {
            // uncomment below to test the property
            //modelInstance.disabled shouldBe ("TODO")
        }

        // to test the property `features` - Optional field for defining the scope of notification by feature. It may contain features by id or key. 
        should("test features") {
            // uncomment below to test the property
            //modelInstance.features shouldBe ("TODO")
        }

    }
}
