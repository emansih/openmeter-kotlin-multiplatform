# MetersApi

All URIs are relative to *http://127.0.0.1:8888*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createMeter**](MetersApi.md#createMeter) | **POST** /api/v1/meters | ☁ Create meter |
| [**deleteMeter**](MetersApi.md#deleteMeter) | **DELETE** /api/v1/meters/{meterIdOrSlug} | ☁ Delete meter |
| [**getMeter**](MetersApi.md#getMeter) | **GET** /api/v1/meters/{meterIdOrSlug} | Get meter |
| [**listMeterSubjects**](MetersApi.md#listMeterSubjects) | **GET** /api/v1/meters/{meterIdOrSlug}/subjects | List meter subjects |
| [**listMeters**](MetersApi.md#listMeters) | **GET** /api/v1/meters | List meters |
| [**queryMeter**](MetersApi.md#queryMeter) | **GET** /api/v1/meters/{meterIdOrSlug}/query | Query meter |


<a id="createMeter"></a>
# **createMeter**
> Meter createMeter(meter)

☁ Create meter

*Available in OpenMeter Cloud.* *In the open-source version, meters are created in the configuration file.*  Create a meter. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = MetersApi()
val meter : Meter =  // Meter | The meter to create.
try {
    val result : Meter = apiInstance.createMeter(meter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetersApi#createMeter")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetersApi#createMeter")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **meter** | [**Meter**](Meter.md)| The meter to create. | |

### Return type

[**Meter**](Meter.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a id="deleteMeter"></a>
# **deleteMeter**
> deleteMeter(meterIdOrSlug)

☁ Delete meter

*Available in OpenMeter Cloud.*  Delete a meter by ID or slug. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = MetersApi()
val meterIdOrSlug : IdOrSlug = meterIdOrSlug_example // IdOrSlug | A unique identifier for the meter.
try {
    apiInstance.deleteMeter(meterIdOrSlug)
} catch (e: ClientException) {
    println("4xx response calling MetersApi#deleteMeter")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetersApi#deleteMeter")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **meterIdOrSlug** | **IdOrSlug**| A unique identifier for the meter. | |

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

<a id="getMeter"></a>
# **getMeter**
> Meter getMeter(meterIdOrSlug)

Get meter

Get meter by ID or slug

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = MetersApi()
val meterIdOrSlug : IdOrSlug = meterIdOrSlug_example // IdOrSlug | A unique identifier for the meter.
try {
    val result : Meter = apiInstance.getMeter(meterIdOrSlug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetersApi#getMeter")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetersApi#getMeter")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **meterIdOrSlug** | **IdOrSlug**| A unique identifier for the meter. | |

### Return type

[**Meter**](Meter.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="listMeterSubjects"></a>
# **listMeterSubjects**
> kotlin.collections.List&lt;kotlin.String&gt; listMeterSubjects(meterIdOrSlug)

List meter subjects

List subjects for a meter.

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = MetersApi()
val meterIdOrSlug : IdOrSlug = meterIdOrSlug_example // IdOrSlug | A unique identifier for the meter.
try {
    val result : kotlin.collections.List<kotlin.String> = apiInstance.listMeterSubjects(meterIdOrSlug)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetersApi#listMeterSubjects")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetersApi#listMeterSubjects")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **meterIdOrSlug** | **IdOrSlug**| A unique identifier for the meter. | |

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="listMeters"></a>
# **listMeters**
> kotlin.collections.List&lt;Meter&gt; listMeters()

List meters

List meters.

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = MetersApi()
try {
    val result : kotlin.collections.List<Meter> = apiInstance.listMeters()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetersApi#listMeters")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetersApi#listMeters")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;Meter&gt;**](Meter.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="queryMeter"></a>
# **queryMeter**
> MeterQueryResult queryMeter(meterIdOrSlug, from, to, windowSize, windowTimeZone, subject, filterGroupBy, groupBy)

Query meter

Query meter for usage.

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = MetersApi()
val meterIdOrSlug : IdOrSlug = meterIdOrSlug_example // IdOrSlug | A unique identifier for the meter.
val from : kotlinx.datetime.Instant = 2023-01-01T00:00Z // kotlinx.datetime.Instant | Start date-time in RFC 3339 format. Inclusive. 
val to : kotlinx.datetime.Instant = 2023-01-02T00:00Z // kotlinx.datetime.Instant | End date-time in RFC 3339 format. Inclusive. 
val windowSize : WindowSize =  // WindowSize | If not specified, a single usage aggregate will be returned for the entirety of the specified period for each subject and group. 
val windowTimeZone : kotlin.String = America/New_York // kotlin.String | The value is the name of the time zone as defined in the IANA Time Zone Database (http://www.iana.org/time-zones). If not specified, the UTC timezone will be used. 
val subject : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtering by multiple subjects.  Usage: `?subject=customer-1&subject=customer-2` 
val filterGroupBy : kotlin.collections.Map<kotlin.String, kotlin.String> = {"model":"gpt-4","type":"input"} // kotlin.collections.Map<kotlin.String, kotlin.String> | 
val groupBy : kotlin.collections.List<kotlin.String> = ["model","type"] // kotlin.collections.List<kotlin.String> | If not specified a single aggregate will be returned for each subject and time window. `subject` is a reserved group by value. 
try {
    val result : MeterQueryResult = apiInstance.queryMeter(meterIdOrSlug, from, to, windowSize, windowTimeZone, subject, filterGroupBy, groupBy)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MetersApi#queryMeter")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MetersApi#queryMeter")
    e.printStackTrace()
}
```

### Parameters
| **meterIdOrSlug** | **IdOrSlug**| A unique identifier for the meter. | |
| **from** | **kotlinx.datetime.Instant**| Start date-time in RFC 3339 format. Inclusive.  | [optional] |
| **to** | **kotlinx.datetime.Instant**| End date-time in RFC 3339 format. Inclusive.  | [optional] |
| **windowSize** | [**WindowSize**](.md)| If not specified, a single usage aggregate will be returned for the entirety of the specified period for each subject and group.  | [optional] [enum: MINUTE, HOUR, DAY] |
| **windowTimeZone** | **kotlin.String**| The value is the name of the time zone as defined in the IANA Time Zone Database (http://www.iana.org/time-zones). If not specified, the UTC timezone will be used.  | [optional] [default to &quot;UTC&quot;] |
| **subject** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Filtering by multiple subjects.  Usage: &#x60;?subject&#x3D;customer-1&amp;subject&#x3D;customer-2&#x60;  | [optional] |
| **filterGroupBy** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;**](kotlin.String.md)|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupBy** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| If not specified a single aggregate will be returned for each subject and time window. &#x60;subject&#x60; is a reserved group by value.  | [optional] |

### Return type

[**MeterQueryResult**](MeterQueryResult.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv, application/problem+json

