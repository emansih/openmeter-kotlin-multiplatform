
# NotificationChannel

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | A unique identifier for the notification channel. |  |
| **type** | [**NotificationChannelType**](NotificationChannelType.md) |  |  |
| **name** | **kotlin.String** | User friendly name of the channel. |  |
| **createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | Timestamp when the channel was created. |  |
| **updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | Timestamp when the channel was modified. |  |
| **disabled** | **kotlin.Boolean** | Whether the channel is disabled or not. |  |
| **url** | **kotlin.String** | Webhook URL where the notification is sent. |  |
| **signingSecret** | **kotlin.String** | Signing secret used for webhook request validation on the receiving end.  Format: &#x60;base64&#x60; encoded random bytes optionally prefixed with &#x60;whsec_&#x60;. Recommended size: 24  |  |
| **deletedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | Timestamp when the channel was deleted. |  [optional] |
| **customHeaders** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Custom HTTP headers sent as part of the webhook request. |  [optional] |



