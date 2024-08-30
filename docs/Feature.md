
# Feature

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **key** | **kotlin.String** | The key is an immutable unique identifier of the feature used throughout the API, for example when interacting with a subject&#39;s entitlements. The key has to be unique across all active features, but archived features can share the same key. The key should consist of lowercase alphanumeric characters and dashes.  |  |
| **name** | **kotlin.String** | The name of the feature.  |  |
| **id** | **kotlin.String** | Readonly unique ULID identifier.  |  [readonly] |
| **createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The date and time the resource was created. |  [readonly] |
| **updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The date and time the resource was last updated. The initial value is the same as createdAt. |  [readonly] |
| **metadata** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Additional metadata for the feature, useful for syncing with external systems and annotating custom fields.  |  [optional] |
| **meterSlug** | **kotlin.String** | The meter that the feature is associated with and and based on which usage is calculated. The meter selected must have SUM or COUNT aggregation.  |  [optional] |
| **meterGroupByFilters** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Optional meter group by filters. Useful if the meter scope is broader than what feature tracks. Example scenario would be a meter tracking all token use with groupBy fields for the model, then the feature could filter for model&#x3D;gpt-4.  |  [optional] |
| **deletedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The date and time the resource was deleted. |  [optional] [readonly] |
| **archivedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | If the feature is archived, no new entitlements can be created for it.  |  [optional] [readonly] |



