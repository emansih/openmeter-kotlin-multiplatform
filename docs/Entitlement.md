
# Entitlement

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **featureKey** | **kotlin.String** | The feature the subject is entitled to use. Either featureKey or featureId is required.  |  |
| **featureId** | **kotlin.String** | The feature the subject is entitled to use. Either featureKey or featureId is required.  |  |
| **usagePeriod** | [**RecurringPeriod**](RecurringPeriod.md) |  |  |
| **type** | [**inline**](#Type) |  |  |
| **measureUsageFrom** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The time from which usage is measured. If not specified on creation, defaults to the entitlement creation time.  |  |
| **lastReset** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The last time a reset happened.  |  |
| **currentUsagePeriod** | [**Period**](Period.md) |  |  |
| **id** | **kotlin.String** | Readonly unique ULID identifier.  |  [readonly] |
| **createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The date and time the resource was created. |  [readonly] |
| **updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The date and time the resource was last updated. The initial value is the same as createdAt. |  [readonly] |
| **subjectKey** | **kotlin.String** | The identifier key unique to the subject |  |
| **config** | **kotlin.String** | The JSON parsable config of the entitlement. This value is also returned when checking entitlement access and it is useful for configuring fine-grained access settings to the feature, implemented in your own system. Has to be an object.  |  |
| **metadata** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Additional metadata for the feature.  |  [optional] |
| **isSoftLimit** | **kotlin.Boolean** | If softLimit&#x3D;true the subject can use the feature even if the entitlement is exhausted, hasAccess will always be true.  |  [optional] |
| **isUnlimited** | **kotlin.Boolean** | Deprecated, ignored by the backend. Please use isSoftLimit instead; this field will be removed in the future.  |  [optional] |
| **issueAfterReset** | **kotlin.Double** | You can grant usage automatically alongside the entitlement, the example scenario would be creating a starting balance. If an amount is specified here, a grant will be created alongside the entitlement with the specified amount. That grant will have it&#39;s rollover settings configured in a way that after each reset operation, the balance will return the original amount specified here.  Manually creating such a grant would mean having the \&quot;amount\&quot;, \&quot;minRolloverAmount\&quot;, and \&quot;maxRolloverAmount\&quot; fields all be the same.  |  [optional] |
| **issueAfterResetPriority** | **kotlin.Int** | Defines the grant priority for the default grant. If provided, issueAfterReset must have a value.  |  [optional] |
| **preserveOverageAtReset** | **kotlin.Boolean** | If true, the overage is preserved at reset. If false, the usage is forgiven.  |  [optional] |
| **deletedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The date and time the resource was deleted. |  [optional] [readonly] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | metered, static, boolean |



