# DebugApi

All URIs are relative to *http://127.0.0.1:8888*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getDebugMetrics**](DebugApi.md#getDebugMetrics) | **GET** /api/v1/debug/metrics | Get event metrics |


<a id="getDebugMetrics"></a>
# **getDebugMetrics**
> kotlin.String getDebugMetrics()

Get event metrics

Returns debug metrics like the number of ingested events since mindnight UTC. The OpenMetrics Counter(s) reset every day at midnight UTC. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = DebugApi()
try {
    val result : kotlin.String = apiInstance.getDebugMetrics()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DebugApi#getDebugMetrics")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DebugApi#getDebugMetrics")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/problem+json

