
# Event

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | Identifies the event. |  |
| **source** | **kotlin.String** | Identifies the context in which an event happened. |  |
| **specversion** | **kotlin.String** | The version of the CloudEvents specification which the event uses. |  |
| **type** | **kotlin.String** | Describes the type of event related to the originating occurrence. |  |
| **subject** | **kotlin.String** | Describes the subject of the event in the context of the event producer (identified by source). |  |
| **datacontenttype** | [**inline**](#Datacontenttype) | Content type of the data value. Must adhere to RFC 2046 format. |  [optional] |
| **dataschema** | **kotlin.String** | Identifies the schema that data adheres to. |  [optional] |
| **time** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) | Timestamp of when the occurrence happened. Must adhere to RFC 3339. |  [optional] |
| **&#x60;data&#x60;** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | The event payload. |  [optional] |


<a id="Datacontenttype"></a>
## Enum: datacontenttype
| Name | Value |
| ---- | ----- |
| datacontenttype | application/json |



