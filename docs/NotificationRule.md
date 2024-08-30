
# NotificationRule

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | A unique identifier for the notification rule. |  |
| **type** | [**NotificationEventType**](NotificationEventType.md) |  |  |
| **name** | **kotlin.String** | The user friendly name of the notification rule. |  |
| **channels** | [**kotlin.collections.List&lt;NotificationChannelMeta&gt;**](NotificationChannelMeta.md) | List of notification channels the rule applies to. |  |
| **createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | Timestamp when the rule was created. |  |
| **updatedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | Timestamp when the rule was modified. |  |
| **disabled** | **kotlin.Boolean** | Whether the rule is disabled or not. |  |
| **thresholds** | [**kotlin.collections.List&lt;NotificationRuleBalanceThresholdValue&gt;**](NotificationRuleBalanceThresholdValue.md) | List of thresholds the rule suppose to be triggered. |  |
| **deletedAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | Timestamp when the channel was deleted. |  [optional] |
| **features** | [**kotlin.collections.Set&lt;FeatureMeta&gt;**](FeatureMeta.md) | Optional field containing list of features the rule applies to. |  [optional] |



