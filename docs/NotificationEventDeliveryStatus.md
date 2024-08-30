
# NotificationEventDeliveryStatus

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **channel** | [**NotificationChannelMeta**](NotificationChannelMeta.md) |  |  |
| **state** | [**inline**](#State) |  |  |
| **updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  |  |
| **reason** | **kotlin.String** |  |  [optional] |


<a id="State"></a>
## Enum: state
| Name | Value |
| ---- | ----- |
| state | SUCCESS, FAILED, SENDING, PENDING |



