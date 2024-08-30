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

import xyz.hisname.openmeter.models.MeterAggregation
import xyz.hisname.openmeter.models.WindowSize

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * A meter is a configuration that defines how to match and aggregate events.
 *
 * @param slug A unique, human-readable identifier for the meter. Must consist only alphanumeric and underscore characters.
 * @param aggregation 
 * @param windowSize 
 * @param eventType The event type to aggregate.
 * @param id A unique identifier for the meter.
 * @param description A description of the meter.
 * @param valueProperty JSONPath expression to extract the value from the ingested event's data property. The ingested value for SUM, AVG, MIN, and MAX aggregations is a number or a string that can be parsed to a number. For UNIQUE_COUNT aggregation, the ingested value must be a string. For COUNT aggregation the valueProperty is ignored. 
 * @param groupBy Named JSONPath expressions to extract the group by values from the event data. Keys must be unique and consist only alphanumeric and underscore characters.
 */
@Serializable

data class Meter (

    /* A unique, human-readable identifier for the meter. Must consist only alphanumeric and underscore characters. */
    @SerialName(value = "slug") @Required val slug: kotlin.String,

    @SerialName(value = "aggregation") @Required val aggregation: MeterAggregation,

    @SerialName(value = "windowSize") @Required val windowSize: WindowSize,

    /* The event type to aggregate. */
    @SerialName(value = "eventType") @Required val eventType: kotlin.String,

    /* A unique identifier for the meter. */
    @SerialName(value = "id") val id: kotlin.String? = null,

    /* A description of the meter. */
    @SerialName(value = "description") val description: kotlin.String? = null,

    /* JSONPath expression to extract the value from the ingested event's data property. The ingested value for SUM, AVG, MIN, and MAX aggregations is a number or a string that can be parsed to a number. For UNIQUE_COUNT aggregation, the ingested value must be a string. For COUNT aggregation the valueProperty is ignored.  */
    @SerialName(value = "valueProperty") val valueProperty: kotlin.String? = null,

    /* Named JSONPath expressions to extract the group by values from the event data. Keys must be unique and consist only alphanumeric and underscore characters. */
    @SerialName(value = "groupBy") val groupBy: kotlin.collections.Map<kotlin.String, kotlin.String>? = null

) {


}

