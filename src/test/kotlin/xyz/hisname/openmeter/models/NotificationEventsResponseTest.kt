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

import xyz.hisname.openmeter.models.NotificationEventsResponse
import xyz.hisname.openmeter.models.NotificationEvent

class NotificationEventsResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of NotificationEventsResponse
        //val modelInstance = NotificationEventsResponse()

        // to test the property `totalCount` - Total number of rules.
        should("test totalCount") {
            // uncomment below to test the property
            //modelInstance.totalCount shouldBe ("TODO")
        }

        // to test the property `page` - Current page number.
        should("test page") {
            // uncomment below to test the property
            //modelInstance.page shouldBe ("TODO")
        }

        // to test the property `pageSize` - Number of rules per page.
        should("test pageSize") {
            // uncomment below to test the property
            //modelInstance.pageSize shouldBe ("TODO")
        }

        // to test the property `items` - List of notification events.
        should("test items") {
            // uncomment below to test the property
            //modelInstance.items shouldBe ("TODO")
        }

    }
}
