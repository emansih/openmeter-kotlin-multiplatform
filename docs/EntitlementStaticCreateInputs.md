
# EntitlementStaticCreateInputs

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) |  |  |
| **config** | **kotlin.String** | The JSON parsable config of the entitlement. This value is also returned when checking entitlement access and it is useful for configuring fine-grained access settings to the feature, implemented in your own system. Has to be an object.  |  |
| **featureKey** | **kotlin.String** | The feature the subject is entitled to use. Either featureKey or featureId is required.  |  [optional] |
| **featureId** | **kotlin.String** | The feature the subject is entitled to use. Either featureKey or featureId is required.  |  [optional] |
| **metadata** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Additional metadata for the feature.  |  [optional] |
| **usagePeriod** | [**RecurringPeriodCreateInput**](RecurringPeriodCreateInput.md) |  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | static |



