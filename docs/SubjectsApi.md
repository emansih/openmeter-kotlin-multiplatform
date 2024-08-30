# SubjectsApi

All URIs are relative to *http://127.0.0.1:8888*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**deleteSubject**](SubjectsApi.md#deleteSubject) | **DELETE** /api/v1/subjects/{subjectIdOrKey} | ☁ Delete subject |
| [**getSubject**](SubjectsApi.md#getSubject) | **GET** /api/v1/subjects/{subjectIdOrKey} | ☁ Get subject |
| [**listSubjects**](SubjectsApi.md#listSubjects) | **GET** /api/v1/subjects | ☁ List subjects |
| [**upsertSubject**](SubjectsApi.md#upsertSubject) | **POST** /api/v1/subjects | ☁ Upsert subject |


<a id="deleteSubject"></a>
# **deleteSubject**
> deleteSubject(subjectIdOrKey)

☁ Delete subject

*Available in OpenMeter Cloud.*  Delete a subject by ID or key. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = SubjectsApi()
val subjectIdOrKey : kotlin.String = customer-id // kotlin.String | A unique identifier for a subject.
try {
    apiInstance.deleteSubject(subjectIdOrKey)
} catch (e: ClientException) {
    println("4xx response calling SubjectsApi#deleteSubject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubjectsApi#deleteSubject")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subjectIdOrKey** | **kotlin.String**| A unique identifier for a subject. | |

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

<a id="getSubject"></a>
# **getSubject**
> Subject getSubject(subjectIdOrKey)

☁ Get subject

*Available in OpenMeter Cloud.*  Get subject by ID or key. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = SubjectsApi()
val subjectIdOrKey : kotlin.String = customer-id // kotlin.String | A unique identifier for a subject.
try {
    val result : Subject = apiInstance.getSubject(subjectIdOrKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubjectsApi#getSubject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubjectsApi#getSubject")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subjectIdOrKey** | **kotlin.String**| A unique identifier for a subject. | |

### Return type

[**Subject**](Subject.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="listSubjects"></a>
# **listSubjects**
> kotlin.collections.List&lt;Subject&gt; listSubjects()

☁ List subjects

*Available in OpenMeter Cloud.*  List subjects. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = SubjectsApi()
try {
    val result : kotlin.collections.List<Subject> = apiInstance.listSubjects()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubjectsApi#listSubjects")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubjectsApi#listSubjects")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;Subject&gt;**](Subject.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="upsertSubject"></a>
# **upsertSubject**
> kotlin.collections.List&lt;Subject&gt; upsertSubject(subject)

☁ Upsert subject

*Available in OpenMeter Cloud.*  Upserts a subject. Creates or updates subject. If the subject doesn&#39;t exist, it will be created. If the subject exists, it will be partially updated with the provided fields. 

### Example
```kotlin
// Import classes:
//import xyz.hisname.openmeter.infrastructure.*
//import xyz.hisname.openmeter.models.*

val apiInstance = SubjectsApi()
val subject : kotlin.collections.List<Subject> =  // kotlin.collections.List<Subject> | The subject to upsert.
try {
    val result : kotlin.collections.List<Subject> = apiInstance.upsertSubject(subject)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubjectsApi#upsertSubject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubjectsApi#upsertSubject")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subject** | [**kotlin.collections.List&lt;Subject&gt;**](Subject.md)| The subject to upsert. | |

### Return type

[**kotlin.collections.List&lt;Subject&gt;**](Subject.md)

### Authorization


Configure CloudCookieAuth:
    ApiClient.apiKey["__session"] = ""
    ApiClient.apiKeyPrefix["__session"] = ""
Configure CloudTokenAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

