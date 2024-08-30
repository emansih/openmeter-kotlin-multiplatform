
# EntitlementGrantCreateInput

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **amount** | **kotlin.Double** | The amount to grant. Should be a positive number.  |  |
| **effectiveAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | Effective date for grants and anchor for recurring grants. Provided value will be ceiled to metering windowSize (minute).  |  |
| **expiration** | [**ExpirationPeriod**](ExpirationPeriod.md) |  |  |
| **priority** | **kotlin.Int** | The priority of the grant. Grants with higher priority are applied first. Priority is a positive decimal numbers. With lower numbers indicating higher importance. For example, a priority of 1 is more urgent than a priority of 2. When there are several grants available for the same subject, the system selects the grant with the highest priority. In cases where grants share the same priority level, the grant closest to its expiration will be used first. In the case of two grants have identical priorities and expiration dates, the system will use the grant that was created first.  |  [optional] |
| **maxRolloverAmount** | **kotlin.Double** | Grants are rolled over at reset, after which they can have a different balance compared to what they had before the reset.  Balance after the reset is calculated as: Balance_After_Reset &#x3D; MIN(MaxRolloverAmount, MAX(Balance_Before_Reset, MinRolloverAmount))  |  [optional] |
| **minRolloverAmount** | **kotlin.Double** | Grants are rolled over at reset, after which they can have a different balance compared to what they had before the reset.  Balance after the reset is calculated as: Balance_After_Reset &#x3D; MIN(MaxRolloverAmount, MAX(Balance_Before_Reset, MinRolloverAmount))  |  [optional] |
| **metadata** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** |  |  [optional] |
| **recurrence** | [**RecurringPeriodCreateInput**](RecurringPeriodCreateInput.md) |  |  [optional] |



