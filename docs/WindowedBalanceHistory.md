
# WindowedBalanceHistory

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **windowedHistory** | [**kotlin.collections.List&lt;BalanceHistoryWindow&gt;**](BalanceHistoryWindow.md) | The windowed balance history. - It only returns rows for windows where there was usage. - The windows are inclusive at their start and exclusive at their end. - The last window may be smaller than the window size and is inclusive at both ends.  |  [optional] |
| **burndownHistory** | [**kotlin.collections.List&lt;GrantBurnDownHistorySegment&gt;**](GrantBurnDownHistorySegment.md) | Grant burndown history.  |  [optional] |



