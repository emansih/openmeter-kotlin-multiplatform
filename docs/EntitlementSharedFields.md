
# EntitlementSharedFields

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | Readonly unique ULID identifier.  |  [readonly] |
| **createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The date and time the resource was created. |  [readonly] |
| **updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The date and time the resource was last updated. The initial value is the same as createdAt. |  [readonly] |
| **featureKey** | **kotlin.String** | The feature the subject is entitled to use. Either featureKey or featureId is required.  |  |
| **featureId** | **kotlin.String** | The feature the subject is entitled to use. Either featureKey or featureId is required.  |  |
| **subjectKey** | **kotlin.String** | The identifier key unique to the subject |  |
| **deletedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The date and time the resource was deleted. |  [optional] [readonly] |
| **metadata** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Additional metadata for the feature.  |  [optional] |
| **usagePeriod** | [**RecurringPeriod**](RecurringPeriod.md) |  |  [optional] |
| **currentUsagePeriod** | [**Period**](Period.md) |  |  [optional] |



