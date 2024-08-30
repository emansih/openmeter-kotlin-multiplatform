# NotificationsExperimentalApi

All URIs are relative to *http://127.0.0.1:8888*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**receiveSvixOperationalEvent**](NotificationsExperimentalApi.md#receiveSvixOperationalEvent) | **POST** /api/v1/notification/webhook/svix | Receive Svix operational events |


<a id="receiveSvixOperationalEvent"></a>
# **receiveSvixOperationalEvent**
> receiveSvixOperationalEvent(svixOperationalWebhookRequest)

Receive Svix operational events

Callback endpoint used by Svix to notify about operational events 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = NotificationsExperimentalApi()
val svixOperationalWebhookRequest : SvixOperationalWebhookRequest =  // SvixOperationalWebhookRequest | The operational event.
try {
    apiInstance.receiveSvixOperationalEvent(svixOperationalWebhookRequest)
} catch (e: ClientException) {
    println("4xx response calling NotificationsExperimentalApi#receiveSvixOperationalEvent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NotificationsExperimentalApi#receiveSvixOperationalEvent")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **svixOperationalWebhookRequest** | [**SvixOperationalWebhookRequest**](SvixOperationalWebhookRequest.md)| The operational event. | |

### Return type

null (empty response body)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/problem+json

