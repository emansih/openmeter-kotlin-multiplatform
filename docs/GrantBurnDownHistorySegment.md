
# GrantBurnDownHistorySegment

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **period** | [**Period**](Period.md) |  |  [optional] |
| **usage** | **kotlin.Double** | The usage of the grant in the period.  |  [optional] [readonly] |
| **overage** | **kotlin.Double** | Overuse that wasn&#39;t covered by grants.  |  [optional] [readonly] |
| **balanceAtStart** | **kotlin.Double** | The entitlement balance at the start of the period.  |  [optional] [readonly] |
| **grantBalancesAtStart** | **kotlin.collections.Map&lt;kotlin.String, kotlin.Double&gt;** | The balance breakdown of each active grant at the start of the period: GrantID: Balance  |  [optional] [readonly] |
| **balanceAtEnd** | **kotlin.Double** | The entitlement balance at the end of the period.  |  [optional] [readonly] |
| **grantBalancesAtEnd** | **kotlin.collections.Map&lt;kotlin.String, kotlin.Double&gt;** | The balance breakdown of each active grant at the start of the period: GrantID: Balance  |  [optional] [readonly] |
| **grantUsages** | [**kotlin.collections.List&lt;GrantUsageRecord&gt;**](GrantUsageRecord.md) | Which grants were actually burnt down in the period and by what amount.  |  [optional] [readonly] |



