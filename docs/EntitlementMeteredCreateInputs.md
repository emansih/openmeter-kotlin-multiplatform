
# EntitlementMeteredCreateInputs

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **usagePeriod** | [**RecurringPeriodCreateInput**](RecurringPeriodCreateInput.md) |  |  |
| **type** | [**inline**](#Type) |  |  |
| **featureKey** | **kotlin.String** | The feature the subject is entitled to use. Either featureKey or featureId is required.  |  [optional] |
| **featureId** | **kotlin.String** | The feature the subject is entitled to use. Either featureKey or featureId is required.  |  [optional] |
| **metadata** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | Additional metadata for the feature.  |  [optional] |
| **isSoftLimit** | **kotlin.Boolean** | If softLimit&#x3D;true the subject can use the feature even if the entitlement is exhausted, hasAccess will always be true.  |  [optional] |
| **isUnlimited** | **kotlin.Boolean** | Deprecated, ignored by the backend. Please use isSoftLimit instead; this field will be removed in the future.  |  [optional] |
| **measureUsageFrom** | [**MeasureUsageFrom**](MeasureUsageFrom.md) |  |  [optional] |
| **issueAfterReset** | **kotlin.Double** | You can grant usage automatically alongside the entitlement, the example scenario would be creating a starting balance. If an amount is specified here, a grant will be created alongside the entitlement with the specified amount. That grant will have it&#39;s rollover settings configured in a way that after each reset operation, the balance will return the original amount specified here.  Manually creating such a grant would mean having the \&quot;amount\&quot;, \&quot;minRolloverAmount\&quot;, and \&quot;maxRolloverAmount\&quot; fields all be the same.  |  [optional] |
| **issueAfterResetPriority** | **kotlin.Int** | Defines the grant priority for the default grant. If provided, issueAfterReset must have a value.  |  [optional] |
| **preserveOverageAtReset** | **kotlin.Boolean** | If true, the overage is preserved at reset. If false, the usage is forgiven.  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | metered |



