
# NotificationChannelWebhookCreateRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | User friendly name of the channel. |  |
| **type** | [**NotificationChannelType**](NotificationChannelType.md) |  |  |
| **url** | **kotlin.String** | Webhook URL where the notification is sent. |  |
| **disabled** | **kotlin.Boolean** | Whether the channel is disabled or not. |  [optional] |
| **customHeaders** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | Custom HTTP headers sent as part of the webhook request. |  [optional] |
| **signingSecret** | **kotlin.String** | Signing secret used for webhook request validation on the receiving end. Automatically generated if not provided.  Format: &#x60;base64&#x60; encoded random bytes optionally prefixed with &#x60;whsec_&#x60;. Recommended size: 24  |  [optional] |



