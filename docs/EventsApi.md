# EventsApi

All URIs are relative to *http://127.0.0.1:8888*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ingestEvents**](EventsApi.md#ingestEvents) | **POST** /api/v1/events | Ingest events |
| [**listEvents**](EventsApi.md#listEvents) | **GET** /api/v1/events | List ingested events |


<a id="ingestEvents"></a>
# **ingestEvents**
> ingestEvents(event)

Ingest events

Ingests an event or batch of events following the CloudEvents specification. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = EventsApi()
val event : Event =  // Event | The event or batch of events to ingest. The request body must be a CloudEvents JSON object or an array of CloudEvents JSON objects. The CloudEvents JSON object must adhere to the CloudEvents Specification JSON Schema. 
try {
    apiInstance.ingestEvents(event)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#ingestEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#ingestEvents")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **event** | [**Event**](Event.md)| The event or batch of events to ingest. The request body must be a CloudEvents JSON object or an array of CloudEvents JSON objects. The CloudEvents JSON object must adhere to the CloudEvents Specification JSON Schema.  | |

### Return type

null (empty response body)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/cloudevents+json, application/cloudevents-batch+json
 - **Accept**: application/problem+json

<a id="listEvents"></a>
# **listEvents**
> kotlin.collections.List&lt;IngestedEvent&gt; listEvents(from, to, limit)

List ingested events

List ingested events within a time range. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = EventsApi()
val from : kotlinx.datetime.Instant = 2023-01-01T00:00Z // kotlinx.datetime.Instant | Start date-time in RFC 3339 format. Inclusive. 
val to : kotlinx.datetime.Instant = 2023-01-02T00:00Z // kotlinx.datetime.Instant | End date-time in RFC 3339 format. Inclusive. 
val limit : kotlin.Int = 100 // kotlin.Int | Number of events to return
try {
    val result : kotlin.collections.List<IngestedEvent> = apiInstance.listEvents(from, to, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EventsApi#listEvents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EventsApi#listEvents")
    e.printStackTrace()
}
```

### Parameters
| **from** | **kotlinx.datetime.Instant**| Start date-time in RFC 3339 format. Inclusive.  | [optional] |
| **to** | **kotlinx.datetime.Instant**| End date-time in RFC 3339 format. Inclusive.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Number of events to return | [optional] [default to 100] |

### Return type

[**kotlin.collections.List&lt;IngestedEvent&gt;**](IngestedEvent.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

