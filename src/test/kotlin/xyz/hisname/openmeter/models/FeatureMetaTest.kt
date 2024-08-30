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

import xyz.hisname.openmeter.models.FeatureMeta

class FeatureMetaTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of FeatureMeta
        //val modelInstance = FeatureMeta()

        // to test the property `id` - A unique identifier for the notification rule.
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property `key` - The key is an immutable unique identifier of the feature used throughout the API, for example when interacting with a subject's entitlements. 
        should("test key") {
            // uncomment below to test the property
            //modelInstance.key shouldBe ("TODO")
        }

    }
}
