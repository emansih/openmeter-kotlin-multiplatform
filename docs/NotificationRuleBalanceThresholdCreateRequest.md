
# NotificationRuleBalanceThresholdCreateRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**NotificationEventType**](NotificationEventType.md) |  |  |
| **name** | **kotlin.String** | The user friendly name of the notification rule. |  |
| **channels** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of notification channel identifiers or names the rule applies to. |  |
| **thresholds** | [**kotlin.collections.List&lt;NotificationRuleBalanceThresholdValue&gt;**](NotificationRuleBalanceThresholdValue.md) | List of thresholds the rule suppose to be triggered. |  |
| **disabled** | **kotlin.Boolean** | Whether the rule is disabled or not. |  [optional] |
| **features** | **kotlin.collections.Set&lt;kotlin.String&gt;** | Optional field for defining the scope of notification by feature. It may contain features by id or key.  |  [optional] |



