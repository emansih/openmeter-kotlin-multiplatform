
# PortalToken

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **subject** | **kotlin.String** |  |  |
| **id** | **kotlin.String** |  |  [optional] [readonly] |
| **expiresAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  |  [optional] [readonly] |
| **expired** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **createdAt** | [**kotlinx.datetime.Instant**](kotlinx.datetime.Instant.md) |  |  [optional] [readonly] |
| **token** | **kotlin.String** | The token is only returned at creation. |  [optional] [readonly] |
| **allowedMeterSlugs** | **kotlin.collections.Set&lt;kotlin.String&gt;** | Optional, if defined only the specified meters will be allowed |  [optional] |



