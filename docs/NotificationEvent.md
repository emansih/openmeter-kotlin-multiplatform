
# NotificationEvent

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | A unique identifier for the notification event. |  |
| **type** | [**NotificationEventType**](NotificationEventType.md) |  |  |
| **createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | Timestamp when the notification event was created. |  |
| **rule** | [**NotificationRule**](NotificationRule.md) |  |  |
| **deliveryStatus** | [**kotlin.collections.List&lt;NotificationEventDeliveryStatus&gt;**](NotificationEventDeliveryStatus.md) | The delivery status of the notification event. |  |
| **payload** | [**NotificationEventPayload**](NotificationEventPayload.md) |  |  |
| **annotations** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | List of annotations managed by the system.  |  [optional] |



