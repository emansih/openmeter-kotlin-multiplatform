# EntitlementsExperimentalApi

All URIs are relative to *http://127.0.0.1:8888*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createEntitlement**](EntitlementsExperimentalApi.md#createEntitlement) | **POST** /api/v1/subjects/{subjectIdOrKey}/entitlements | Create an entitlement |
| [**createFeature**](EntitlementsExperimentalApi.md#createFeature) | **POST** /api/v1/features | Create a feature |
| [**createGrant**](EntitlementsExperimentalApi.md#createGrant) | **POST** /api/v1/subjects/{subjectIdOrKey}/entitlements/{entitlementIdOrFeatureKey}/grants | Create a grant |
| [**deleteEntitlement**](EntitlementsExperimentalApi.md#deleteEntitlement) | **DELETE** /api/v1/subjects/{subjectIdOrKey}/entitlements/{entitlementId} | Delete an entitlement |
| [**deleteFeature**](EntitlementsExperimentalApi.md#deleteFeature) | **DELETE** /api/v1/features/{featureId} | Archive a feature |
| [**getEntitlement**](EntitlementsExperimentalApi.md#getEntitlement) | **GET** /api/v1/subjects/{subjectIdOrKey}/entitlements/{entitlementId} | Get an entitlement |
| [**getEntitlementById**](EntitlementsExperimentalApi.md#getEntitlementById) | **GET** /api/v1/entitlements/{entitlementId} | Get an entitlement |
| [**getEntitlementHistory**](EntitlementsExperimentalApi.md#getEntitlementHistory) | **GET** /api/v1/subjects/{subjectIdOrKey}/entitlements/{entitlementId}/history | Get the balance history of a specific entitlement. |
| [**getEntitlementValue**](EntitlementsExperimentalApi.md#getEntitlementValue) | **GET** /api/v1/subjects/{subjectIdOrKey}/entitlements/{entitlementIdOrFeatureKey}/value | Get the current value and access of an entitlement |
| [**getFeature**](EntitlementsExperimentalApi.md#getFeature) | **GET** /api/v1/features/{featureId} | Get feature |
| [**listEntitlementGrants**](EntitlementsExperimentalApi.md#listEntitlementGrants) | **GET** /api/v1/subjects/{subjectIdOrKey}/entitlements/{entitlementIdOrFeatureKey}/grants | List grants for an entitlement |
| [**listEntitlements**](EntitlementsExperimentalApi.md#listEntitlements) | **GET** /api/v1/entitlements | List entitlements |
| [**listFeatures**](EntitlementsExperimentalApi.md#listFeatures) | **GET** /api/v1/features | List features |
| [**listGrants**](EntitlementsExperimentalApi.md#listGrants) | **GET** /api/v1/grants | List grants |
| [**listSubjectEntitlements**](EntitlementsExperimentalApi.md#listSubjectEntitlements) | **GET** /api/v1/subjects/{subjectIdOrKey}/entitlements | List entitlements of a subject |
| [**overrideEntitlement**](EntitlementsExperimentalApi.md#overrideEntitlement) | **PUT** /api/v1/subjects/{subjectIdOrKey}/entitlements/{entitlementIdOrFeatureKey}/override | Override an entitlement |
| [**resetEntitlementUsage**](EntitlementsExperimentalApi.md#resetEntitlementUsage) | **POST** /api/v1/subjects/{subjectIdOrKey}/entitlements/{entitlementId}/reset | Reset an entitlement |
| [**voidGrant**](EntitlementsExperimentalApi.md#voidGrant) | **DELETE** /api/v1/grants/{grantId} | Void a grant |


<a id="createEntitlement"></a>
# **createEntitlement**
> Entitlement createEntitlement(subjectIdOrKey, entitlementCreateInputs)

Create an entitlement

OpenMeter has three types of entitlements: metered, boolean, and static. The type property determines the type of entitlement. The underlying feature has to be compatible with the entitlement type specified in the request (e.g., a metered entitlement needs a feature associated with a meter).  - Boolean entitlements define static feature access, e.g. \&quot;Can use SSO authentication\&quot;. - Static entitlements let you pass along a configuration while granting access, e.g. \&quot;Using this feature with X Y settings\&quot; (passed in the config). - Metered entitlements have many use cases, from setting up usage-based access to implementing complex credit systems.  Example: The customer can use 10000 AI tokens during the usage period of the entitlement.  A given subject can only have one active (non-deleted) entitlement per featureKey. If you try to create a new entitlement for a featureKey that already has an active entitlement, the request will fail with a 409 error.  Once an entitlement is created you cannot modify it, only delete it. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = EntitlementsExperimentalApi()
val subjectIdOrKey : kotlin.String = customer-id // kotlin.String | A unique identifier for a subject.
val entitlementCreateInputs : EntitlementCreateInputs =  // EntitlementCreateInputs | The entitlement to create.
try {
    val result : Entitlement = apiInstance.createEntitlement(subjectIdOrKey, entitlementCreateInputs)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EntitlementsExperimentalApi#createEntitlement")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EntitlementsExperimentalApi#createEntitlement")
    e.printStackTrace()
}
```

### Parameters
| **subjectIdOrKey** | **kotlin.String**| A unique identifier for a subject. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entitlementCreateInputs** | [**EntitlementCreateInputs**](EntitlementCreateInputs.md)| The entitlement to create. | |

### Return type

[**Entitlement**](Entitlement.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a id="createFeature"></a>
# **createFeature**
> Feature createFeature(featureCreateInputs)

Create a feature

Features are either metered or static. A feature is metered if meterSlug is provided at creation. For metered features you can pass additional filters that will be applied when calculating feature usage, based on the meter&#39;s groupBy fields. Only meters with SUM and COUNT aggregation are supported for features.  Features cannot be updated later, only archived. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = EntitlementsExperimentalApi()
val featureCreateInputs : FeatureCreateInputs =  // FeatureCreateInputs | The feature to create.
try {
    val result : Feature = apiInstance.createFeature(featureCreateInputs)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EntitlementsExperimentalApi#createFeature")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EntitlementsExperimentalApi#createFeature")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **featureCreateInputs** | [**FeatureCreateInputs**](FeatureCreateInputs.md)| The feature to create. | |

### Return type

[**Feature**](Feature.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a id="createGrant"></a>
# **createGrant**
> EntitlementGrant createGrant(subjectIdOrKey, entitlementIdOrFeatureKey, entitlementGrantCreateInput)

Create a grant

Grants define a behavior of granting usage for a metered entitlement. They can have complicated recurrence and rollover rules, thanks to which you can define a wide range of access patterns with a single grant, in most cases you don&#39;t have to periodically create new grants. You can only issue grants for active metered entitlements.  A grant defines a given amount of usage that can be consumed for the entitlement. The grant is in effect between its effective date and its expiration date. Specifying both is mandatory for new grants.  Grants have a priority setting that determines their order of use. Lower numbers have higher priority, with 0 being the highest priority.  Grants can have a recurrence setting intended to automate the manual reissuing of grants. For example, a daily recurrence is equal to reissuing that same grant every day (ignoring rollover settings).  Rollover settings define what happens to the remaining balance of a grant at a reset. Balance_After_Reset &#x3D; MIN(MaxRolloverAmount, MAX(Balance_Before_Reset, MinRolloverAmount))  Grants cannot be changed once created, only deleted. This is to ensure that balance is deterministic regardless of when it is queried. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = EntitlementsExperimentalApi()
val subjectIdOrKey : kotlin.String = customer-id // kotlin.String | A unique identifier for a subject.
val entitlementIdOrFeatureKey : kotlin.String = 01ARZ3NDEKTSV4RRFFQ69G5FAV or gpt4_tokens // kotlin.String | The id of the entitlement or the key of the feature.
val entitlementGrantCreateInput : EntitlementGrantCreateInput =  // EntitlementGrantCreateInput | The grant to create.
try {
    val result : EntitlementGrant = apiInstance.createGrant(subjectIdOrKey, entitlementIdOrFeatureKey, entitlementGrantCreateInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EntitlementsExperimentalApi#createGrant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EntitlementsExperimentalApi#createGrant")
    e.printStackTrace()
}
```

### Parameters
| **subjectIdOrKey** | **kotlin.String**| A unique identifier for a subject. | |
| **entitlementIdOrFeatureKey** | **kotlin.String**| The id of the entitlement or the key of the feature. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entitlementGrantCreateInput** | [**EntitlementGrantCreateInput**](EntitlementGrantCreateInput.md)| The grant to create. | |

### Return type

[**EntitlementGrant**](EntitlementGrant.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a id="deleteEntitlement"></a>
# **deleteEntitlement**
> deleteEntitlement(subjectIdOrKey, entitlementId)

Delete an entitlement

Deleting an entitlement revokes access to the associated feature. As a single subject can only have one entitlement per featureKey, when \&quot;migrating\&quot; features you have to delete the old entitlements as well. As access and status checks can be historical queries, deleting an entitlement populates the deletedAt timestamp. When queried for a time before that, the entitlement is still considered active, you cannot have retroactive changes to access, which is important for, among other things, auditing. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = EntitlementsExperimentalApi()
val subjectIdOrKey : kotlin.String = customer-id // kotlin.String | A unique identifier for a subject.
val entitlementId : kotlin.String = 01ARZ3NDEKTSV4RRFFQ69G5FAV // kotlin.String | A unique ULID for an entitlement.
try {
    apiInstance.deleteEntitlement(subjectIdOrKey, entitlementId)
} catch (e: ClientException) {
    println("4xx response calling EntitlementsExperimentalApi#deleteEntitlement")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EntitlementsExperimentalApi#deleteEntitlement")
    e.printStackTrace()
}
```

### Parameters
| **subjectIdOrKey** | **kotlin.String**| A unique identifier for a subject. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entitlementId** | **kotlin.String**| A unique ULID for an entitlement. | |

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

<a id="deleteFeature"></a>
# **deleteFeature**
> deleteFeature(featureId)

Archive a feature

Once a feature is archived it cannot be unarchived. If a feature is archived, new entitlements cannot be created for it, but archiving the feature does not affect existing entitlements. This means, if you want to create a new feature with the same key, and then create entitlements for it, the previous entitlements have to be deleted first on a per subject basis. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = EntitlementsExperimentalApi()
val featureId : kotlin.String = 01ARZ3NDEKTSV4RRFFQ69G5FAV // kotlin.String | A unique ULID identifier for a feature.
try {
    apiInstance.deleteFeature(featureId)
} catch (e: ClientException) {
    println("4xx response calling EntitlementsExperimentalApi#deleteFeature")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EntitlementsExperimentalApi#deleteFeature")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **featureId** | **kotlin.String**| A unique ULID identifier for a feature. | |

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

<a id="getEntitlement"></a>
# **getEntitlement**
> GetEntitlementById200Response getEntitlement(subjectIdOrKey, entitlementId)

Get an entitlement

Get entitlement by id. For checking entitlement access, use the /value endpoint instead. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = EntitlementsExperimentalApi()
val subjectIdOrKey : kotlin.String = customer-id // kotlin.String | A unique identifier for a subject.
val entitlementId : kotlin.String = 01ARZ3NDEKTSV4RRFFQ69G5FAV // kotlin.String | A unique ULID for an entitlement.
try {
    val result : GetEntitlementById200Response = apiInstance.getEntitlement(subjectIdOrKey, entitlementId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EntitlementsExperimentalApi#getEntitlement")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EntitlementsExperimentalApi#getEntitlement")
    e.printStackTrace()
}
```

### Parameters
| **subjectIdOrKey** | **kotlin.String**| A unique identifier for a subject. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entitlementId** | **kotlin.String**| A unique ULID for an entitlement. | |

### Return type

[**GetEntitlementById200Response**](GetEntitlementById200Response.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="getEntitlementById"></a>
# **getEntitlementById**
> GetEntitlementById200Response getEntitlementById(entitlementId)

Get an entitlement

Get entitlement by id. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = EntitlementsExperimentalApi()
val entitlementId : kotlin.String = 01ARZ3NDEKTSV4RRFFQ69G5FAV // kotlin.String | A unique ULID for an entitlement.
try {
    val result : GetEntitlementById200Response = apiInstance.getEntitlementById(entitlementId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EntitlementsExperimentalApi#getEntitlementById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EntitlementsExperimentalApi#getEntitlementById")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entitlementId** | **kotlin.String**| A unique ULID for an entitlement. | |

### Return type

[**GetEntitlementById200Response**](GetEntitlementById200Response.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="getEntitlementHistory"></a>
# **getEntitlementHistory**
> WindowedBalanceHistory getEntitlementHistory(subjectIdOrKey, entitlementId, windowSize, from, to, windowTimeZone)

Get the balance history of a specific entitlement.

Returns historical balance and usage data for the entitlement. The queried history can span accross multiple reset events.  BurndownHistory returns a continous history of segments, where the segments are seperated by events that changed either the grant burndown priority or the usage period.  WindowedHistory returns windowed usage data for the period enriched with balance information and the list of grants that were being burnt down in that window. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = EntitlementsExperimentalApi()
val subjectIdOrKey : kotlin.String = customer-id // kotlin.String | A unique identifier for a subject.
val entitlementId : kotlin.String = 01ARZ3NDEKTSV4RRFFQ69G5FAV // kotlin.String | A unique ULID for an entitlement.
val windowSize : kotlin.String = windowSize_example // kotlin.String | Size of the time window to group the history by. Cannot be shorter than meter granularity. 
val from : kotlinx.datetime.Instant = 2023-01-01T00:00Z // kotlinx.datetime.Instant | Start of time range to query entitlement: date-time in RFC 3339 format. Defaults to the last reset. Gets truncated to the granularity of the underlying meter. 
val to : kotlinx.datetime.Instant = 2023-01-01T00:00Z // kotlinx.datetime.Instant | End of time range to query entitlement: date-time in RFC 3339 format. Defaults to now. If not now then gets truncated to the granularity of the underlying meter. 
val windowTimeZone : kotlin.String = America/New_York // kotlin.String | The value is the name of the time zone as defined in the IANA Time Zone Database (http://www.iana.org/time-zones). If not specified, the UTC timezone will be used. 
try {
    val result : WindowedBalanceHistory = apiInstance.getEntitlementHistory(subjectIdOrKey, entitlementId, windowSize, from, to, windowTimeZone)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EntitlementsExperimentalApi#getEntitlementHistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EntitlementsExperimentalApi#getEntitlementHistory")
    e.printStackTrace()
}
```

### Parameters
| **subjectIdOrKey** | **kotlin.String**| A unique identifier for a subject. | |
| **entitlementId** | **kotlin.String**| A unique ULID for an entitlement. | |
| **windowSize** | **kotlin.String**| Size of the time window to group the history by. Cannot be shorter than meter granularity.  | [enum: MINUTE, HOUR, DAY] |
| **from** | **kotlinx.datetime.Instant**| Start of time range to query entitlement: date-time in RFC 3339 format. Defaults to the last reset. Gets truncated to the granularity of the underlying meter.  | [optional] |
| **to** | **kotlinx.datetime.Instant**| End of time range to query entitlement: date-time in RFC 3339 format. Defaults to now. If not now then gets truncated to the granularity of the underlying meter.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **windowTimeZone** | **kotlin.String**| The value is the name of the time zone as defined in the IANA Time Zone Database (http://www.iana.org/time-zones). If not specified, the UTC timezone will be used.  | [optional] [default to &quot;UTC&quot;] |

### Return type

[**WindowedBalanceHistory**](WindowedBalanceHistory.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="getEntitlementValue"></a>
# **getEntitlementValue**
> EntitlementValue getEntitlementValue(subjectIdOrKey, entitlementIdOrFeatureKey, time)

Get the current value and access of an entitlement

This endpoint should be used for access checks and enforcement. All entitlement types share the hasAccess property in their value response, but multiple other properties are returned based on the entitlement type.  For convenience reasons, /value works with both entitlementId and featureKey. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = EntitlementsExperimentalApi()
val subjectIdOrKey : kotlin.String = customer-id // kotlin.String | A unique identifier for a subject.
val entitlementIdOrFeatureKey : kotlin.String = 01ARZ3NDEKTSV4RRFFQ69G5FAV or gpt4_tokens // kotlin.String | The id of the entitlement or the key of the feature.
val time : kotlinx.datetime.Instant = 2023-01-01T00:00Z // kotlinx.datetime.Instant | Point of time to check value: date-time in RFC 3339 format. Defaults to now. 
try {
    val result : EntitlementValue = apiInstance.getEntitlementValue(subjectIdOrKey, entitlementIdOrFeatureKey, time)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EntitlementsExperimentalApi#getEntitlementValue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EntitlementsExperimentalApi#getEntitlementValue")
    e.printStackTrace()
}
```

### Parameters
| **subjectIdOrKey** | **kotlin.String**| A unique identifier for a subject. | |
| **entitlementIdOrFeatureKey** | **kotlin.String**| The id of the entitlement or the key of the feature. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **time** | **kotlinx.datetime.Instant**| Point of time to check value: date-time in RFC 3339 format. Defaults to now.  | [optional] |

### Return type

[**EntitlementValue**](EntitlementValue.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="getFeature"></a>
# **getFeature**
> Feature getFeature(featureId)

Get feature

Get a feature by id. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = EntitlementsExperimentalApi()
val featureId : kotlin.String = 01ARZ3NDEKTSV4RRFFQ69G5FAV // kotlin.String | A unique ULID identifier for a feature.
try {
    val result : Feature = apiInstance.getFeature(featureId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EntitlementsExperimentalApi#getFeature")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EntitlementsExperimentalApi#getFeature")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **featureId** | **kotlin.String**| A unique ULID identifier for a feature. | |

### Return type

[**Feature**](Feature.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="listEntitlementGrants"></a>
# **listEntitlementGrants**
> kotlin.collections.List&lt;EntitlementGrant&gt; listEntitlementGrants(subjectIdOrKey, entitlementIdOrFeatureKey, includeDeleted, orderBy)

List grants for an entitlement

List all grants issued for an entitlement. The entitlement can be defined either by its id or featureKey. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = EntitlementsExperimentalApi()
val subjectIdOrKey : kotlin.String = customer-id // kotlin.String | A unique identifier for a subject.
val entitlementIdOrFeatureKey : kotlin.String = 01ARZ3NDEKTSV4RRFFQ69G5FAV or gpt4_tokens // kotlin.String | The id of the entitlement or the key of the feature.
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | Include deleted entries.
val orderBy : kotlin.String = orderBy_example // kotlin.String | Order by field
try {
    val result : kotlin.collections.List<EntitlementGrant> = apiInstance.listEntitlementGrants(subjectIdOrKey, entitlementIdOrFeatureKey, includeDeleted, orderBy)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EntitlementsExperimentalApi#listEntitlementGrants")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EntitlementsExperimentalApi#listEntitlementGrants")
    e.printStackTrace()
}
```

### Parameters
| **subjectIdOrKey** | **kotlin.String**| A unique identifier for a subject. | |
| **entitlementIdOrFeatureKey** | **kotlin.String**| The id of the entitlement or the key of the feature. | |
| **includeDeleted** | **kotlin.Boolean**| Include deleted entries. | [optional] [default to false] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **orderBy** | **kotlin.String**| Order by field | [optional] [default to updatedAt] [enum: id, createdAt, updatedAt] |

### Return type

[**kotlin.collections.List&lt;EntitlementGrant&gt;**](EntitlementGrant.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="listEntitlements"></a>
# **listEntitlements**
> ListEntitlementResponse listEntitlements(page, pageSize, limit, offset, subject, feature, entitlementType, order, orderBy)

List entitlements

List all entitlements regardless of subject. This endpoint is intended for administrative purposes. If page is provided that takes precedence and the paginated response is returned. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = EntitlementsExperimentalApi()
val page : kotlin.Int = 1 // kotlin.Int | Page number to return
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of entries to return per page
val limit : kotlin.Int = 100 // kotlin.Int | Number of entries to return
val offset : kotlin.Int = 0 // kotlin.Int | Number of entries to skip
val subject : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtering by multiple subjects.  Usage: `?subject=customer-1&subject=customer-2` 
val feature : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtering by multiple features.  Usage: `?feature=feature-1&feature=feature-2` 
val entitlementType : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtering by multiple entitlement types.  Usage: `?entitlementType=metered&entitlementType=static` 
val order : kotlin.String = order_example // kotlin.String | Order by field.  Usage: `?order=ASC` 
val orderBy : kotlin.String = orderBy_example // kotlin.String | Order by field
try {
    val result : ListEntitlementResponse = apiInstance.listEntitlements(page, pageSize, limit, offset, subject, feature, entitlementType, order, orderBy)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EntitlementsExperimentalApi#listEntitlements")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EntitlementsExperimentalApi#listEntitlements")
    e.printStackTrace()
}
```

### Parameters
| **page** | **kotlin.Int**| Page number to return | [optional] [default to 1] |
| **pageSize** | **kotlin.Int**| Number of entries to return per page | [optional] [default to 100] |
| **limit** | **kotlin.Int**| Number of entries to return | [optional] [default to 1000] |
| **offset** | **kotlin.Int**| Number of entries to skip | [optional] [default to 0] |
| **subject** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Filtering by multiple subjects.  Usage: &#x60;?subject&#x3D;customer-1&amp;subject&#x3D;customer-2&#x60;  | [optional] |
| **feature** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Filtering by multiple features.  Usage: &#x60;?feature&#x3D;feature-1&amp;feature&#x3D;feature-2&#x60;  | [optional] |
| **entitlementType** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Filtering by multiple entitlement types.  Usage: &#x60;?entitlementType&#x3D;metered&amp;entitlementType&#x3D;static&#x60;  | [optional] |
| **order** | **kotlin.String**| Order by field.  Usage: &#x60;?order&#x3D;ASC&#x60;  | [optional] [default to ASC] [enum: ASC, DESC] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **orderBy** | **kotlin.String**| Order by field | [optional] [default to createdAt] [enum: createdAt, updatedAt] |

### Return type

[**ListEntitlementResponse**](ListEntitlementResponse.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="listFeatures"></a>
# **listFeatures**
> ListFeatureResponse listFeatures(page, pageSize, limit, offset, meterSlug, order, orderBy, includeArchived)

List features

List all features. If page is provided that takes precedence and the paginated response is returned. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = EntitlementsExperimentalApi()
val page : kotlin.Int = 1 // kotlin.Int | Page number to return
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of entries to return per page
val limit : kotlin.Int = 100 // kotlin.Int | Number of entries to return
val offset : kotlin.Int = 0 // kotlin.Int | Number of entries to skip
val meterSlug : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtering by multiple meterSlug.  Usage: `?meterSlug=meter-1&meterSlug=meter-2` 
val order : kotlin.String = order_example // kotlin.String | Order by field.  Usage: `?order=ASC` 
val orderBy : kotlin.String = orderBy_example // kotlin.String | Order by field
val includeArchived : kotlin.Boolean = true // kotlin.Boolean | Include archived features.
try {
    val result : ListFeatureResponse = apiInstance.listFeatures(page, pageSize, limit, offset, meterSlug, order, orderBy, includeArchived)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EntitlementsExperimentalApi#listFeatures")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EntitlementsExperimentalApi#listFeatures")
    e.printStackTrace()
}
```

### Parameters
| **page** | **kotlin.Int**| Page number to return | [optional] [default to 1] |
| **pageSize** | **kotlin.Int**| Number of entries to return per page | [optional] [default to 100] |
| **limit** | **kotlin.Int**| Number of entries to return | [optional] [default to 1000] |
| **offset** | **kotlin.Int**| Number of entries to skip | [optional] [default to 0] |
| **meterSlug** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Filtering by multiple meterSlug.  Usage: &#x60;?meterSlug&#x3D;meter-1&amp;meterSlug&#x3D;meter-2&#x60;  | [optional] |
| **order** | **kotlin.String**| Order by field.  Usage: &#x60;?order&#x3D;ASC&#x60;  | [optional] [default to ASC] [enum: ASC, DESC] |
| **orderBy** | **kotlin.String**| Order by field | [optional] [default to updatedAt] [enum: id, createdAt, updatedAt] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **includeArchived** | **kotlin.Boolean**| Include archived features. | [optional] [default to false] |

### Return type

[**ListFeatureResponse**](ListFeatureResponse.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="listGrants"></a>
# **listGrants**
> ListEntitlementGrantResponse listGrants(page, pageSize, limit, offset, subject, feature, order, orderBy, includeDeleted)

List grants

List all grants for all the subjects and entitlements. This endpoint is intended for administrative purposes only. To fetch the grants of a specific entitlement please use the /api/v1/subjects/{subjectKeyOrID}/entitlements/{entitlementOrFeatureID}/grants endpoint.  If page is provided that takes precedence and the paginated response is returned. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = EntitlementsExperimentalApi()
val page : kotlin.Int = 1 // kotlin.Int | Page number to return
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of entries to return per page
val limit : kotlin.Int = 100 // kotlin.Int | Number of entries to return
val offset : kotlin.Int = 0 // kotlin.Int | Number of entries to skip
val subject : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtering by multiple subjects.  Usage: `?subject=customer-1&subject=customer-2` 
val feature : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | Filtering by multiple features.  Usage: `?feature=feature-1&feature=feature-2` 
val order : kotlin.String = order_example // kotlin.String | Order by field.  Usage: `?order=ASC` 
val orderBy : kotlin.String = orderBy_example // kotlin.String | Order by field
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | Include deleted entries.
try {
    val result : ListEntitlementGrantResponse = apiInstance.listGrants(page, pageSize, limit, offset, subject, feature, order, orderBy, includeDeleted)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EntitlementsExperimentalApi#listGrants")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EntitlementsExperimentalApi#listGrants")
    e.printStackTrace()
}
```

### Parameters
| **page** | **kotlin.Int**| Page number to return | [optional] [default to 1] |
| **pageSize** | **kotlin.Int**| Number of entries to return per page | [optional] [default to 100] |
| **limit** | **kotlin.Int**| Number of entries to return | [optional] [default to 1000] |
| **offset** | **kotlin.Int**| Number of entries to skip | [optional] [default to 0] |
| **subject** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Filtering by multiple subjects.  Usage: &#x60;?subject&#x3D;customer-1&amp;subject&#x3D;customer-2&#x60;  | [optional] |
| **feature** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Filtering by multiple features.  Usage: &#x60;?feature&#x3D;feature-1&amp;feature&#x3D;feature-2&#x60;  | [optional] |
| **order** | **kotlin.String**| Order by field.  Usage: &#x60;?order&#x3D;ASC&#x60;  | [optional] [default to ASC] [enum: ASC, DESC] |
| **orderBy** | **kotlin.String**| Order by field | [optional] [default to updatedAt] [enum: id, createdAt, updatedAt] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **includeDeleted** | **kotlin.Boolean**| Include deleted entries. | [optional] [default to false] |

### Return type

[**ListEntitlementGrantResponse**](ListEntitlementGrantResponse.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="listSubjectEntitlements"></a>
# **listSubjectEntitlements**
> kotlin.collections.List&lt;Entitlement&gt; listSubjectEntitlements(subjectIdOrKey, includeDeleted)

List entitlements of a subject

List all entitlements for a subject. For checking entitlement access, use the /value endpoint instead. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = EntitlementsExperimentalApi()
val subjectIdOrKey : kotlin.String = customer-id // kotlin.String | A unique identifier for a subject.
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | Include deleted entries.
try {
    val result : kotlin.collections.List<Entitlement> = apiInstance.listSubjectEntitlements(subjectIdOrKey, includeDeleted)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EntitlementsExperimentalApi#listSubjectEntitlements")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EntitlementsExperimentalApi#listSubjectEntitlements")
    e.printStackTrace()
}
```

### Parameters
| **subjectIdOrKey** | **kotlin.String**| A unique identifier for a subject. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **includeDeleted** | **kotlin.Boolean**| Include deleted entries. | [optional] [default to false] |

### Return type

[**kotlin.collections.List&lt;Entitlement&gt;**](Entitlement.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="overrideEntitlement"></a>
# **overrideEntitlement**
> Entitlement overrideEntitlement(subjectIdOrKey, entitlementIdOrFeatureKey, entitlementCreateInputs)

Override an entitlement

Overriding an entitlement creates a new entitlement from the provided inputs and soft deletes the previous entitlement for the provided subject-feature pair. If the previous entitlement is already deleted or otherwise doesnt exist, the override will fail.  This endpoint is useful for upgrades, downgrades, or other changes to entitlements that require a new entitlement to be created with zero downtime. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = EntitlementsExperimentalApi()
val subjectIdOrKey : kotlin.String = customer-id // kotlin.String | A unique identifier for a subject.
val entitlementIdOrFeatureKey : kotlin.String = 01ARZ3NDEKTSV4RRFFQ69G5FAV or gpt4_tokens // kotlin.String | The id of the entitlement or the key of the feature.
val entitlementCreateInputs : EntitlementCreateInputs =  // EntitlementCreateInputs | The entitlement to create.
try {
    val result : Entitlement = apiInstance.overrideEntitlement(subjectIdOrKey, entitlementIdOrFeatureKey, entitlementCreateInputs)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EntitlementsExperimentalApi#overrideEntitlement")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EntitlementsExperimentalApi#overrideEntitlement")
    e.printStackTrace()
}
```

### Parameters
| **subjectIdOrKey** | **kotlin.String**| A unique identifier for a subject. | |
| **entitlementIdOrFeatureKey** | **kotlin.String**| The id of the entitlement or the key of the feature. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entitlementCreateInputs** | [**EntitlementCreateInputs**](EntitlementCreateInputs.md)| The entitlement to create. | |

### Return type

[**Entitlement**](Entitlement.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a id="resetEntitlementUsage"></a>
# **resetEntitlementUsage**
> resetEntitlementUsage(subjectIdOrKey, entitlementId, resetEntitlementUsageRequest)

Reset an entitlement

Reset marks the start of a new usage period for the entitlement and initiates grant rollover. At the start of a period usage is zerod out and grants are rolled over based on their rollover settings. It would typically be synced with the subjects billing period to enforce usage based on their subscription.  Usage is automatically reset for metered entitlements based on their usage period, but this endpoint allows to manually reset it at any time. When doing so the period anchor of the entitlement can be changed if needed. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = EntitlementsExperimentalApi()
val subjectIdOrKey : kotlin.String = customer-id // kotlin.String | A unique identifier for a subject.
val entitlementId : kotlin.String = 01ARZ3NDEKTSV4RRFFQ69G5FAV // kotlin.String | A unique ULID for an entitlement.
val resetEntitlementUsageRequest : ResetEntitlementUsageRequest =  // ResetEntitlementUsageRequest | 
try {
    apiInstance.resetEntitlementUsage(subjectIdOrKey, entitlementId, resetEntitlementUsageRequest)
} catch (e: ClientException) {
    println("4xx response calling EntitlementsExperimentalApi#resetEntitlementUsage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EntitlementsExperimentalApi#resetEntitlementUsage")
    e.printStackTrace()
}
```

### Parameters
| **subjectIdOrKey** | **kotlin.String**| A unique identifier for a subject. | |
| **entitlementId** | **kotlin.String**| A unique ULID for an entitlement. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **resetEntitlementUsageRequest** | [**ResetEntitlementUsageRequest**](ResetEntitlementUsageRequest.md)|  | |

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

<a id="voidGrant"></a>
# **voidGrant**
> voidGrant(grantId)

Void a grant

Voiding a grant means it is no longer valid, it doesn&#39;t take part in further balance calculations. Voiding a grant does not retroactively take effect, meaning any usage that has already been attributed to the grant will remain, but future usage cannot be burnt down from the grant.  For example, if you have a single grant for your metered entitlement with an initial amount of 100, and so far 60 usage has been metered, the grant (and the entitlement itself) would have a balance of 40. If you then void that grant, balance becomes 0, but the 60 previous usage will not be affected. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = EntitlementsExperimentalApi()
val grantId : kotlin.String = 01ARZ3NDEKTSV4RRFFQ69G5FAV // kotlin.String | A unique identifier for a grant.
try {
    apiInstance.voidGrant(grantId)
} catch (e: ClientException) {
    println("4xx response calling EntitlementsExperimentalApi#voidGrant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EntitlementsExperimentalApi#voidGrant")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **grantId** | **kotlin.String**| A unique identifier for a grant. | |

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

