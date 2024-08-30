
# ResetEntitlementUsageRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **effectiveAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | The time at which the reset takes effect, defaults to now. The reset cannot be in the future. The provided value is truncated to the minute due to how historical meter data is stored.  |  [optional] |
| **retainAnchor** | **kotlin.Boolean** | Determines whether the usage period anchor is retained or reset to the effectiveAt time. - If true, the usage period anchor is retained. - If false, the usage period anchor is reset to the effectiveAt time.  |  [optional] |
| **preserveOverage** | **kotlin.Boolean** | Determines whether the overage is preserved or forgiven, overriding the entitlement&#39;s default behavior. - If true, the overage is preserved. - If false, the overage is forgiven.  |  [optional] |



