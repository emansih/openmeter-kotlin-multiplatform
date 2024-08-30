
# EntitlementBooleanCreateInputs

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) |  |  |
| **featureKey** | **kotlin.String** | The feature the subject is entitled to use. Either featureKey or featureId is required.  |  [optional] |
| **featureId** | **kotlin.String** | The feature the subject is entitled to use. Either featureKey or featureId is required.  |  [optional] |
| **metadata** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Additional metadata for the feature.  |  [optional] |
| **usagePeriod** | [**RecurringPeriodCreateInput**](RecurringPeriodCreateInput.md) |  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | boolean |



