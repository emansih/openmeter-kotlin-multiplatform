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

import xyz.hisname.openmeter.models.NotificationEventBalanceThresholdPayload
import xyz.hisname.openmeter.models.NotificationEventBalanceThresholdPayloadAllOfData
import xyz.hisname.openmeter.models.NotificationEventType

class NotificationEventBalanceThresholdPayloadTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of NotificationEventBalanceThresholdPayload
        //val modelInstance = NotificationEventBalanceThresholdPayload()

        // to test the property `id` - A unique identifier for the notification event the payload belongs to.
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property `type`
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `timestamp` - Timestamp when the notification event was created.
        should("test timestamp") {
            // uncomment below to test the property
            //modelInstance.timestamp shouldBe ("TODO")
        }

        // to test the property ``data``
        should("test `data`") {
            // uncomment below to test the property
            //modelInstance.`data` shouldBe ("TODO")
        }

    }
}
