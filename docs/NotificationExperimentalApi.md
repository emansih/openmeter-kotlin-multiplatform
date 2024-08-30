# NotificationExperimentalApi

All URIs are relative to *http://127.0.0.1:8888*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createNotificationChannel**](NotificationExperimentalApi.md#createNotificationChannel) | **POST** /api/v1/notification/channels | Create a notification channel |
| [**createNotificationRule**](NotificationExperimentalApi.md#createNotificationRule) | **POST** /api/v1/notification/rules | Create a notification rule |
| [**deleteNotificationChannel**](NotificationExperimentalApi.md#deleteNotificationChannel) | **DELETE** /api/v1/notification/channels/{channelId} | Delete a notification channel |
| [**deleteNotificationRule**](NotificationExperimentalApi.md#deleteNotificationRule) | **DELETE** /api/v1/notification/rules/{ruleId} | Delete a notification rule |
| [**getNotificationChannel**](NotificationExperimentalApi.md#getNotificationChannel) | **GET** /api/v1/notification/channels/{channelId} | Get notification channel |
| [**getNotificationEvent**](NotificationExperimentalApi.md#getNotificationEvent) | **GET** /api/v1/notification/events/{eventId} | Get notification event |
| [**getNotificationRule**](NotificationExperimentalApi.md#getNotificationRule) | **GET** /api/v1/notification/rules/{ruleId} | Get notification rule |
| [**listNotificationChannels**](NotificationExperimentalApi.md#listNotificationChannels) | **GET** /api/v1/notification/channels | List notification channels |
| [**listNotificationEvents**](NotificationExperimentalApi.md#listNotificationEvents) | **GET** /api/v1/notification/events | List notification evens |
| [**listNotificationRules**](NotificationExperimentalApi.md#listNotificationRules) | **GET** /api/v1/notification/rules | List notification rules |
| [**testNotificationRule**](NotificationExperimentalApi.md#testNotificationRule) | **POST** /api/v1/notification/rules/{ruleId}/test | Test notification rule |
| [**updateNotificationChannel**](NotificationExperimentalApi.md#updateNotificationChannel) | **PUT** /api/v1/notification/channels/{channelId} | Update notification channel |
| [**updateNotificationRule**](NotificationExperimentalApi.md#updateNotificationRule) | **PUT** /api/v1/notification/rules/{ruleId} | Update a notification rule |


<a id="createNotificationChannel"></a>
# **createNotificationChannel**
> NotificationChannel createNotificationChannel(notificationChannelCreateRequest)

Create a notification channel

Create a new notification channel. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = NotificationExperimentalApi()
val notificationChannelCreateRequest : NotificationChannelCreateRequest =  // NotificationChannelCreateRequest | The notification channel to create.
try {
    val result : NotificationChannel = apiInstance.createNotificationChannel(notificationChannelCreateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationExperimentalApi#createNotificationChannel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationExperimentalApi#createNotificationChannel")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **notificationChannelCreateRequest** | [**NotificationChannelCreateRequest**](NotificationChannelCreateRequest.md)| The notification channel to create. | |

### Return type

[**NotificationChannel**](NotificationChannel.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a id="createNotificationRule"></a>
# **createNotificationRule**
> NotificationRule createNotificationRule(notificationRuleCreateRequest)

Create a notification rule

Create a new notification rule. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = NotificationExperimentalApi()
val notificationRuleCreateRequest : NotificationRuleCreateRequest =  // NotificationRuleCreateRequest | The notification rule to create.
try {
    val result : NotificationRule = apiInstance.createNotificationRule(notificationRuleCreateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationExperimentalApi#createNotificationRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationExperimentalApi#createNotificationRule")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **notificationRuleCreateRequest** | [**NotificationRuleCreateRequest**](NotificationRuleCreateRequest.md)| The notification rule to create. | |

### Return type

[**NotificationRule**](NotificationRule.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a id="deleteNotificationChannel"></a>
# **deleteNotificationChannel**
> deleteNotificationChannel(channelId)

Delete a notification channel

Delete notification channel by id. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = NotificationExperimentalApi()
val channelId : kotlin.String = 01ARZ3NDEKTSV4RRFFQ69G5FAV // kotlin.String | A unique ULID identifier for a notification channel.
try {
    apiInstance.deleteNotificationChannel(channelId)
} catch (e: ClientException) {
    println("4xx response calling NotificationExperimentalApi#deleteNotificationChannel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationExperimentalApi#deleteNotificationChannel")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **channelId** | **kotlin.String**| A unique ULID identifier for a notification channel. | |

### Return type

null (empty response body)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/problem+json

<a id="deleteNotificationRule"></a>
# **deleteNotificationRule**
> deleteNotificationRule(ruleId)

Delete a notification rule

Delete notification rule by id. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = NotificationExperimentalApi()
val ruleId : kotlin.String = 01J2XYZEPMCKMBKAHXJZF8S3YQ // kotlin.String | A unique ULID identifier for a notification rule.
try {
    apiInstance.deleteNotificationRule(ruleId)
} catch (e: ClientException) {
    println("4xx response calling NotificationExperimentalApi#deleteNotificationRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationExperimentalApi#deleteNotificationRule")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleId** | **kotlin.String**| A unique ULID identifier for a notification rule. | |

### Return type

null (empty response body)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/problem+json

<a id="getNotificationChannel"></a>
# **getNotificationChannel**
> NotificationChannel getNotificationChannel(channelId)

Get notification channel

Get a notification channel by id. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = NotificationExperimentalApi()
val channelId : kotlin.String = 01ARZ3NDEKTSV4RRFFQ69G5FAV // kotlin.String | A unique ULID identifier for a notification channel.
try {
    val result : NotificationChannel = apiInstance.getNotificationChannel(channelId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationExperimentalApi#getNotificationChannel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationExperimentalApi#getNotificationChannel")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **channelId** | **kotlin.String**| A unique ULID identifier for a notification channel. | |

### Return type

[**NotificationChannel**](NotificationChannel.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="getNotificationEvent"></a>
# **getNotificationEvent**
> TestNotificationRule201Response getNotificationEvent(eventId)

Get notification event

Get a notification event by id. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = NotificationExperimentalApi()
val eventId : kotlin.String = 01J2XYZEPMCKMBKAHXJZF8S3YQ // kotlin.String | A unique ULID identifier for a notification event.
try {
    val result : TestNotificationRule201Response = apiInstance.getNotificationEvent(eventId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationExperimentalApi#getNotificationEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationExperimentalApi#getNotificationEvent")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **eventId** | **kotlin.String**| A unique ULID identifier for a notification event. | |

### Return type

[**TestNotificationRule201Response**](TestNotificationRule201Response.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="getNotificationRule"></a>
# **getNotificationRule**
> NotificationRule getNotificationRule(ruleId)

Get notification rule

Get a notification rule by id. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = NotificationExperimentalApi()
val ruleId : kotlin.String = 01J2XYZEPMCKMBKAHXJZF8S3YQ // kotlin.String | A unique ULID identifier for a notification rule.
try {
    val result : NotificationRule = apiInstance.getNotificationRule(ruleId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationExperimentalApi#getNotificationRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationExperimentalApi#getNotificationRule")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleId** | **kotlin.String**| A unique ULID identifier for a notification rule. | |

### Return type

[**NotificationRule**](NotificationRule.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="listNotificationChannels"></a>
# **listNotificationChannels**
> NotificationChannelsResponse listNotificationChannels(page, pageSize, orderBy, order, includeDisabled, includeDeleted)

List notification channels

List all notification channels. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = NotificationExperimentalApi()
val page : kotlin.Int = 1 // kotlin.Int | Page number to return
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of entries to return per page
val orderBy : kotlin.String = orderBy_example // kotlin.String | Order by field
val order : kotlin.String = order_example // kotlin.String | Order by field.  Usage: `?order=ASC` 
val includeDisabled : kotlin.Boolean = true // kotlin.Boolean | Include disabled entries.
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | Include deleted entries.
try {
    val result : NotificationChannelsResponse = apiInstance.listNotificationChannels(page, pageSize, orderBy, order, includeDisabled, includeDeleted)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationExperimentalApi#listNotificationChannels")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationExperimentalApi#listNotificationChannels")
    e.printStackTrace()
}
```

### Parameters
| **page** | **kotlin.Int**| Page number to return | [optional] [default to 1] |
| **pageSize** | **kotlin.Int**| Number of entries to return per page | [optional] [default to 100] |
| **orderBy** | **kotlin.String**| Order by field | [optional] [default to id] [enum: id, type, createdAt, updatedAt] |
| **order** | **kotlin.String**| Order by field.  Usage: &#x60;?order&#x3D;ASC&#x60;  | [optional] [default to ASC] [enum: ASC, DESC] |
| **includeDisabled** | **kotlin.Boolean**| Include disabled entries. | [optional] [default to false] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **includeDeleted** | **kotlin.Boolean**| Include deleted entries. | [optional] [default to false] |

### Return type

[**NotificationChannelsResponse**](NotificationChannelsResponse.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="listNotificationEvents"></a>
# **listNotificationEvents**
> NotificationEventsResponse listNotificationEvents(page, pageSize, orderBy, order, from, to, feature, subject, rule, channel)

List notification evens

List all notification events. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = NotificationExperimentalApi()
val page : kotlin.Int = 1 // kotlin.Int | Page number to return
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of entries to return per page
val orderBy : kotlin.String = orderBy_example // kotlin.String | Order by field
val order : kotlin.String = order_example // kotlin.String | Order by field.  Usage: `?order=ASC` 
val from : kotlinx.datetime.Instant = 2023-01-01T00:00Z // kotlinx.datetime.Instant | Start date-time in RFC 3339 format. Inclusive. 
val to : kotlinx.datetime.Instant = 2023-01-02T00:00Z // kotlinx.datetime.Instant | End date-time in RFC 3339 format. Inclusive. 
val feature : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtering by multiple features.  Usage: `?feature=feature-1&feature=feature-2` 
val subject : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtering by multiple subjects.  Usage: `?subject=customer-1&subject=customer-2` 
val rule : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtering by multiple rules.  Usage: `?rule=ID1&rule=rule=ID2` 
val channel : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtering by multiple channels.  Usage: `?channel=ID1&channel=ID2` 
try {
    val result : NotificationEventsResponse = apiInstance.listNotificationEvents(page, pageSize, orderBy, order, from, to, feature, subject, rule, channel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationExperimentalApi#listNotificationEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationExperimentalApi#listNotificationEvents")
    e.printStackTrace()
}
```

### Parameters
| **page** | **kotlin.Int**| Page number to return | [optional] [default to 1] |
| **pageSize** | **kotlin.Int**| Number of entries to return per page | [optional] [default to 100] |
| **orderBy** | **kotlin.String**| Order by field | [optional] [default to createdAt] [enum: id, createdAt] |
| **order** | **kotlin.String**| Order by field.  Usage: &#x60;?order&#x3D;ASC&#x60;  | [optional] [default to ASC] [enum: ASC, DESC] |
| **from** | **kotlinx.datetime.Instant**| Start date-time in RFC 3339 format. Inclusive.  | [optional] |
| **to** | **kotlinx.datetime.Instant**| End date-time in RFC 3339 format. Inclusive.  | [optional] |
| **feature** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Filtering by multiple features.  Usage: &#x60;?feature&#x3D;feature-1&amp;feature&#x3D;feature-2&#x60;  | [optional] |
| **subject** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Filtering by multiple subjects.  Usage: &#x60;?subject&#x3D;customer-1&amp;subject&#x3D;customer-2&#x60;  | [optional] |
| **rule** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Filtering by multiple rules.  Usage: &#x60;?rule&#x3D;ID1&amp;rule&#x3D;rule&#x3D;ID2&#x60;  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **channel** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Filtering by multiple channels.  Usage: &#x60;?channel&#x3D;ID1&amp;channel&#x3D;ID2&#x60;  | [optional] |

### Return type

[**NotificationEventsResponse**](NotificationEventsResponse.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="listNotificationRules"></a>
# **listNotificationRules**
> NotificationRulesResponse listNotificationRules(page, pageSize, orderBy, order, includeDisabled, includeDeleted, feature, channel)

List notification rules

List all notification rules. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = NotificationExperimentalApi()
val page : kotlin.Int = 1 // kotlin.Int | Page number to return
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of entries to return per page
val orderBy : kotlin.String = orderBy_example // kotlin.String | Order by field
val order : kotlin.String = order_example // kotlin.String | Order by field.  Usage: `?order=ASC` 
val includeDisabled : kotlin.Boolean = true // kotlin.Boolean | Include disabled entries.
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | Include deleted entries.
val feature : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtering by multiple features.  Usage: `?feature=feature-1&feature=feature-2` 
val channel : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtering by multiple notification channels.  Usage: `?channel=channel-1&channel=channel-2` 
try {
    val result : NotificationRulesResponse = apiInstance.listNotificationRules(page, pageSize, orderBy, order, includeDisabled, includeDeleted, feature, channel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationExperimentalApi#listNotificationRules")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationExperimentalApi#listNotificationRules")
    e.printStackTrace()
}
```

### Parameters
| **page** | **kotlin.Int**| Page number to return | [optional] [default to 1] |
| **pageSize** | **kotlin.Int**| Number of entries to return per page | [optional] [default to 100] |
| **orderBy** | **kotlin.String**| Order by field | [optional] [default to id] [enum: id, type, createdAt, updatedAt] |
| **order** | **kotlin.String**| Order by field.  Usage: &#x60;?order&#x3D;ASC&#x60;  | [optional] [default to ASC] [enum: ASC, DESC] |
| **includeDisabled** | **kotlin.Boolean**| Include disabled entries. | [optional] [default to false] |
| **includeDeleted** | **kotlin.Boolean**| Include deleted entries. | [optional] [default to false] |
| **feature** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Filtering by multiple features.  Usage: &#x60;?feature&#x3D;feature-1&amp;feature&#x3D;feature-2&#x60;  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **channel** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Filtering by multiple notification channels.  Usage: &#x60;?channel&#x3D;channel-1&amp;channel&#x3D;channel-2&#x60;  | [optional] |

### Return type

[**NotificationRulesResponse**](NotificationRulesResponse.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="testNotificationRule"></a>
# **testNotificationRule**
> TestNotificationRule201Response testNotificationRule(ruleId)

Test notification rule

Test a notification rule by sending a test event with random data. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = NotificationExperimentalApi()
val ruleId : kotlin.String = 01J2XYZEPMCKMBKAHXJZF8S3YQ // kotlin.String | A unique ULID identifier for a notification rule.
try {
    val result : TestNotificationRule201Response = apiInstance.testNotificationRule(ruleId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationExperimentalApi#testNotificationRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationExperimentalApi#testNotificationRule")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ruleId** | **kotlin.String**| A unique ULID identifier for a notification rule. | |

### Return type

[**TestNotificationRule201Response**](TestNotificationRule201Response.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="updateNotificationChannel"></a>
# **updateNotificationChannel**
> NotificationChannel updateNotificationChannel(channelId, notificationChannelCreateRequest)

Update notification channel

Update a notification channel by id. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = NotificationExperimentalApi()
val channelId : kotlin.String = 01ARZ3NDEKTSV4RRFFQ69G5FAV // kotlin.String | A unique ULID identifier for a notification channel.
val notificationChannelCreateRequest : NotificationChannelCreateRequest =  // NotificationChannelCreateRequest | The notification channel to update.
try {
    val result : NotificationChannel = apiInstance.updateNotificationChannel(channelId, notificationChannelCreateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationExperimentalApi#updateNotificationChannel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationExperimentalApi#updateNotificationChannel")
    e.printStackTrace()
}
```

### Parameters
| **channelId** | **kotlin.String**| A unique ULID identifier for a notification channel. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **notificationChannelCreateRequest** | [**NotificationChannelCreateRequest**](NotificationChannelCreateRequest.md)| The notification channel to update. | |

### Return type

[**NotificationChannel**](NotificationChannel.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a id="updateNotificationRule"></a>
# **updateNotificationRule**
> NotificationRule updateNotificationRule(ruleId, notificationRuleCreateRequest)

Update a notification rule

Update a notification rule by id. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = NotificationExperimentalApi()
val ruleId : kotlin.String = 01J2XYZEPMCKMBKAHXJZF8S3YQ // kotlin.String | A unique ULID identifier for a notification rule.
val notificationRuleCreateRequest : NotificationRuleCreateRequest =  // NotificationRuleCreateRequest | The notification rule to update.
try {
    val result : NotificationRule = apiInstance.updateNotificationRule(ruleId, notificationRuleCreateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NotificationExperimentalApi#updateNotificationRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationExperimentalApi#updateNotificationRule")
    e.printStackTrace()
}
```

### Parameters
| **ruleId** | **kotlin.String**| A unique ULID identifier for a notification rule. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **notificationRuleCreateRequest** | [**NotificationRuleCreateRequest**](NotificationRuleCreateRequest.md)| The notification rule to update. | |

### Return type

[**NotificationRule**](NotificationRule.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

