
# Meter

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **slug** | **kotlin.String** | A unique, human-readable identifier for the meter. Must consist only alphanumeric and underscore characters. |  |
| **aggregation** | [**MeterAggregation**](MeterAggregation.md) |  |  |
| **windowSize** | [**WindowSize**](WindowSize.md) |  |  |
| **eventType** | **kotlin.String** | The event type to aggregate. |  |
| **id** | **kotlin.String** | A unique identifier for the meter. |  [optional] [readonly] |
| **description** | **kotlin.String** | A description of the meter. |  [optional] |
| **valueProperty** | **kotlin.String** | JSONPath expression to extract the value from the ingested event&#39;s data property. The ingested value for SUM, AVG, MIN, and MAX aggregations is a number or a string that can be parsed to a number. For UNIQUE_COUNT aggregation, the ingested value must be a string. For COUNT aggregation the valueProperty is ignored.  |  [optional] |
| **groupBy** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Named JSONPath expressions to extract the group by values from the event data. Keys must be unique and consist only alphanumeric and underscore characters. |  [optional] |



