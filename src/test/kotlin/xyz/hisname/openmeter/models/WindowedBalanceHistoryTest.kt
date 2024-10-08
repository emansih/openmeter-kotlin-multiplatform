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

import xyz.hisname.openmeter.models.WindowedBalanceHistory
import xyz.hisname.openmeter.models.BalanceHistoryWindow
import xyz.hisname.openmeter.models.GrantBurnDownHistorySegment

class WindowedBalanceHistoryTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of WindowedBalanceHistory
        //val modelInstance = WindowedBalanceHistory()

        // to test the property `windowedHistory` - The windowed balance history. - It only returns rows for windows where there was usage. - The windows are inclusive at their start and exclusive at their end. - The last window may be smaller than the window size and is inclusive at both ends. 
        should("test windowedHistory") {
            // uncomment below to test the property
            //modelInstance.windowedHistory shouldBe ("TODO")
        }

        // to test the property `burndownHistory` - Grant burndown history. 
        should("test burndownHistory") {
            // uncomment below to test the property
            //modelInstance.burndownHistory shouldBe ("TODO")
        }

    }
}
