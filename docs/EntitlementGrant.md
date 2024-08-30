
# EntitlementGrant

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **amount** | **kotlin.Double** | The amount to grant. Should be a positive number.  |  |
| **effectiveAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | Effective date for grants and anchor for recurring grants. Provided value will be ceiled to metering windowSize (minute).  |  |
| **expiration** | [**ExpirationPeriod**](ExpirationPeriod.md) |  |  |
| **id** | **kotlin.String** | Readonly unique ULID identifier.  |  [readonly] |
| **createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The date and time the resource was created. |  [readonly] |
| **updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The date and time the resource was last updated. The initial value is the same as createdAt. |  [readonly] |
| **entitlementId** | **kotlin.String** | The unique entitlement ULID that the grant is associated with.  |  [readonly] |
| **priority** | **kotlin.Int** | The priority of the grant. Grants with higher priority are applied first. Priority is a positive decimal numbers. With lower numbers indicating higher importance. For example, a priority of 1 is more urgent than a priority of 2. When there are several grants available for the same subject, the system selects the grant with the highest priority. In cases where grants share the same priority level, the grant closest to its expiration will be used first. In the case of two grants have identical priorities and expiration dates, the system will use the grant that was created first.  |  [optional] |
| **maxRolloverAmount** | **kotlin.Double** | Grants are rolled over at reset, after which they can have a different balance compared to what they had before the reset.  Balance after the reset is calculated as: Balance_After_Reset &#x3D; MIN(MaxRolloverAmount, MAX(Balance_Before_Reset, MinRolloverAmount))  |  [optional] |
| **minRolloverAmount** | **kotlin.Double** | Grants are rolled over at reset, after which they can have a different balance compared to what they had before the reset.  Balance after the reset is calculated as: Balance_After_Reset &#x3D; MIN(MaxRolloverAmount, MAX(Balance_Before_Reset, MinRolloverAmount))  |  [optional] |
| **metadata** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** |  |  [optional] |
| **recurrence** | [**RecurringPeriod**](RecurringPeriod.md) |  |  [optional] |
| **deletedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The date and time the resource was deleted. |  [optional] [readonly] |
| **nextRecurrence** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The next time the grant will recurr.  |  [optional] |
| **expiresAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The expiration date of the grant.  |  [optional] [readonly] |
| **voidedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The date and time the grant was voided (cannot be used after that). |  [optional] [readonly] |



