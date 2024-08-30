# PortalApi

All URIs are relative to *http://127.0.0.1:8888*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createPortalToken**](PortalApi.md#createPortalToken) | **POST** /api/v1/portal/tokens | Create portal token |
| [**invalidatePortalTokens**](PortalApi.md#invalidatePortalTokens) | **POST** /api/v1/portal/tokens/invalidate | ☁ Invalidate portal tokens |
| [**listPortalTokens**](PortalApi.md#listPortalTokens) | **GET** /api/v1/portal/tokens | ☁ List portal tokens |
| [**queryPortalMeter**](PortalApi.md#queryPortalMeter) | **GET** /api/v1/portal/meters/{meterSlug}/query | Query portal meter |


<a id="createPortalToken"></a>
# **createPortalToken**
> PortalToken createPortalToken(portalToken)

Create portal token

Create a consumer portal token.

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = PortalApi()
val portalToken : PortalToken = {"subject":"customer-id","allowedMeterSlugs":["tokens_total"]} // PortalToken | The portal token to create.
try {
    val result : PortalToken = apiInstance.createPortalToken(portalToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortalApi#createPortalToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortalApi#createPortalToken")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **portalToken** | [**PortalToken**](PortalToken.md)| The portal token to create. | |

### Return type

[**PortalToken**](PortalToken.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a id="invalidatePortalTokens"></a>
# **invalidatePortalTokens**
> invalidatePortalTokens(invalidatePortalTokensRequest)

☁ Invalidate portal tokens

*Available in OpenMeter Cloud.*  Invalidates consumer portal tokens by ID or subject. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = PortalApi()
val invalidatePortalTokensRequest : InvalidatePortalTokensRequest = {"id":"01G65Z755AFWAKHE12NY0CQ9FH"} // InvalidatePortalTokensRequest | If no id or subject is specified, all tokens will be invalidated.
try {
    apiInstance.invalidatePortalTokens(invalidatePortalTokensRequest)
} catch (e: ClientException) {
    println("4xx response calling PortalApi#invalidatePortalTokens")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortalApi#invalidatePortalTokens")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **invalidatePortalTokensRequest** | [**InvalidatePortalTokensRequest**](InvalidatePortalTokensRequest.md)| If no id or subject is specified, all tokens will be invalidated. | |

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

<a id="listPortalTokens"></a>
# **listPortalTokens**
> kotlin.collections.List&lt;PortalToken&gt; listPortalTokens(limit)

☁ List portal tokens

*Available in OpenMeter Cloud.*  List consumer portal tokens. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = PortalApi()
val limit : kotlin.Int = 25 // kotlin.Int | Number of portal tokens to return. Default is 25.
try {
    val result : kotlin.collections.List<PortalToken> = apiInstance.listPortalTokens(limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortalApi#listPortalTokens")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortalApi#listPortalTokens")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Number of portal tokens to return. Default is 25. | [optional] [default to 25] |

### Return type

[**kotlin.collections.List&lt;PortalToken&gt;**](PortalToken.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="queryPortalMeter"></a>
# **queryPortalMeter**
> MeterQueryResult queryPortalMeter(meterSlug, from, to, windowSize, windowTimeZone, filterGroupBy, groupBy)

Query portal meter

Query meter for consumer portal. This endpoint is publicly exposable to consumers.

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = PortalApi()
val meterSlug : kotlin.String = tokens_total // kotlin.String | A unique identifier for the meter.
val from : kotlinx.datetime.Instant = 2023-01-01T00:00Z // kotlinx.datetime.Instant | Start date-time in RFC 3339 format. Inclusive. 
val to : kotlinx.datetime.Instant = 2023-01-02T00:00Z // kotlinx.datetime.Instant | End date-time in RFC 3339 format. Inclusive. 
val windowSize : WindowSize =  // WindowSize | If not specified, a single usage aggregate will be returned for the entirety of the specified period for each subject and group. 
val windowTimeZone : kotlin.String = America/New_York // kotlin.String | The value is the name of the time zone as defined in the IANA Time Zone Database (http://www.iana.org/time-zones). If not specified, the UTC timezone will be used. 
val filterGroupBy : kotlin.collections.Map<kotlin.String, kotlin.String> = {"model":"gpt-4","type":"input"} // kotlin.collections.Map<kotlin.String, kotlin.String> | 
val groupBy : kotlin.collections.List<kotlin.String> = ["model","type"] // kotlin.collections.List<kotlin.String> | If not specified a single aggregate will be returned for each subject and time window. `subject` is a reserved group by value. 
try {
    val result : MeterQueryResult = apiInstance.queryPortalMeter(meterSlug, from, to, windowSize, windowTimeZone, filterGroupBy, groupBy)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortalApi#queryPortalMeter")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortalApi#queryPortalMeter")
    e.printStackTrace()
}
```

### Parameters
| **meterSlug** | **kotlin.String**| A unique identifier for the meter. | |
| **from** | **kotlinx.datetime.Instant**| Start date-time in RFC 3339 format. Inclusive.  | [optional] |
| **to** | **kotlinx.datetime.Instant**| End date-time in RFC 3339 format. Inclusive.  | [optional] |
| **windowSize** | [**WindowSize**](.md)| If not specified, a single usage aggregate will be returned for the entirety of the specified period for each subject and group.  | [optional] [enum: MINUTE, HOUR, DAY] |
| **windowTimeZone** | **kotlin.String**| The value is the name of the time zone as defined in the IANA Time Zone Database (http://www.iana.org/time-zones). If not specified, the UTC timezone will be used.  | [optional] [default to &quot;UTC&quot;] |
| **filterGroupBy** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;**](kotlin.String.md)|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupBy** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| If not specified a single aggregate will be returned for each subject and time window. &#x60;subject&#x60; is a reserved group by value.  | [optional] |

### Return type

[**MeterQueryResult**](MeterQueryResult.md)

### Authorization


Configure CloudPortalTokenAuth:
    ApiClient.accessToken = ""
Configure PortalTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv, application/problem+json

