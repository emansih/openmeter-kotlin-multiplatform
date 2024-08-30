# Kotlin Multiplatform client library for OpenMeter API

OpenMeter is a cloud native usage metering service.
The OpenMeter API allows you to ingest events, query meter usage, and manage resources.
---
*Operations with the ☁ (cloud) notation are only available in OpenMeter Cloud.*

## How this was generated

1. Download the latest jar from here: https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/
2. Ensure you have java in your environment
3. Run this: `java -jar openapi-generator-cli-<VERSION_NUMBER>.jar generate -i https://raw.githubusercontent.com/openmeterio/openmeter/main/api/openapi.yaml -g kotlin --package-name xyz.hisname.openmeter --additional-properties=serializationLibrary=kotlinx_serialization --additional-properties dateLibrary=kotlinx-datetime --additional-properties=buildTool=gradle --library=multiplatform`

This library was generated from 0485818371cc286ec230c0620a4593e77fae08ff and requires a bit of modification since the generator could not generate a client library that could be compiled. 

## Overview
This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [openapi-spec](https://github.com/OAI/OpenAPI-Specification) from a remote server, you can easily generate an API client.

- API version: 1.0.0
- Package version: 
- Generator version: 7.8.0
- Build package: org.openapitools.codegen.languages.KotlinClientCodegen

## Requires

* Kotlin 1.5.10

## Build

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.


<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://127.0.0.1:8888*

| Class | Method | HTTP request | Description |
| ------------ | ------------- | ------------- | ------------- |
| *DebugApi* | [**getDebugMetrics**](docs/DebugApi.md#getdebugmetrics) | **GET** /api/v1/debug/metrics | Get event metrics |
| *EntitlementsExperimentalApi* | [**createEntitlement**](docs/EntitlementsExperimentalApi.md#createentitlement) | **POST** /api/v1/subjects/{subjectIdOrKey}/entitlements | Create an entitlement |
| *EntitlementsExperimentalApi* | [**createFeature**](docs/EntitlementsExperimentalApi.md#createfeature) | **POST** /api/v1/features | Create a feature |
| *EntitlementsExperimentalApi* | [**createGrant**](docs/EntitlementsExperimentalApi.md#creategrant) | **POST** /api/v1/subjects/{subjectIdOrKey}/entitlements/{entitlementIdOrFeatureKey}/grants | Create a grant |
| *EntitlementsExperimentalApi* | [**deleteEntitlement**](docs/EntitlementsExperimentalApi.md#deleteentitlement) | **DELETE** /api/v1/subjects/{subjectIdOrKey}/entitlements/{entitlementId} | Delete an entitlement |
| *EntitlementsExperimentalApi* | [**deleteFeature**](docs/EntitlementsExperimentalApi.md#deletefeature) | **DELETE** /api/v1/features/{featureId} | Archive a feature |
| *EntitlementsExperimentalApi* | [**getEntitlement**](docs/EntitlementsExperimentalApi.md#getentitlement) | **GET** /api/v1/subjects/{subjectIdOrKey}/entitlements/{entitlementId} | Get an entitlement |
| *EntitlementsExperimentalApi* | [**getEntitlementById**](docs/EntitlementsExperimentalApi.md#getentitlementbyid) | **GET** /api/v1/entitlements/{entitlementId} | Get an entitlement |
| *EntitlementsExperimentalApi* | [**getEntitlementHistory**](docs/EntitlementsExperimentalApi.md#getentitlementhistory) | **GET** /api/v1/subjects/{subjectIdOrKey}/entitlements/{entitlementId}/history | Get the balance history of a specific entitlement. |
| *EntitlementsExperimentalApi* | [**getEntitlementValue**](docs/EntitlementsExperimentalApi.md#getentitlementvalue) | **GET** /api/v1/subjects/{subjectIdOrKey}/entitlements/{entitlementIdOrFeatureKey}/value | Get the current value and access of an entitlement |
| *EntitlementsExperimentalApi* | [**getFeature**](docs/EntitlementsExperimentalApi.md#getfeature) | **GET** /api/v1/features/{featureId} | Get feature |
| *EntitlementsExperimentalApi* | [**listEntitlementGrants**](docs/EntitlementsExperimentalApi.md#listentitlementgrants) | **GET** /api/v1/subjects/{subjectIdOrKey}/entitlements/{entitlementIdOrFeatureKey}/grants | List grants for an entitlement |
| *EntitlementsExperimentalApi* | [**listEntitlements**](docs/EntitlementsExperimentalApi.md#listentitlements) | **GET** /api/v1/entitlements | List entitlements |
| *EntitlementsExperimentalApi* | [**listFeatures**](docs/EntitlementsExperimentalApi.md#listfeatures) | **GET** /api/v1/features | List features |
| *EntitlementsExperimentalApi* | [**listGrants**](docs/EntitlementsExperimentalApi.md#listgrants) | **GET** /api/v1/grants | List grants |
| *EntitlementsExperimentalApi* | [**listSubjectEntitlements**](docs/EntitlementsExperimentalApi.md#listsubjectentitlements) | **GET** /api/v1/subjects/{subjectIdOrKey}/entitlements | List entitlements of a subject |
| *EntitlementsExperimentalApi* | [**overrideEntitlement**](docs/EntitlementsExperimentalApi.md#overrideentitlement) | **PUT** /api/v1/subjects/{subjectIdOrKey}/entitlements/{entitlementIdOrFeatureKey}/override | Override an entitlement |
| *EntitlementsExperimentalApi* | [**resetEntitlementUsage**](docs/EntitlementsExperimentalApi.md#resetentitlementusage) | **POST** /api/v1/subjects/{subjectIdOrKey}/entitlements/{entitlementId}/reset | Reset an entitlement |
| *EntitlementsExperimentalApi* | [**voidGrant**](docs/EntitlementsExperimentalApi.md#voidgrant) | **DELETE** /api/v1/grants/{grantId} | Void a grant |
| *EventsApi* | [**ingestEvents**](docs/EventsApi.md#ingestevents) | **POST** /api/v1/events | Ingest events |
| *EventsApi* | [**listEvents**](docs/EventsApi.md#listevents) | **GET** /api/v1/events | List ingested events |
| *MetersApi* | [**createMeter**](docs/MetersApi.md#createmeter) | **POST** /api/v1/meters | ☁ Create meter |
| *MetersApi* | [**deleteMeter**](docs/MetersApi.md#deletemeter) | **DELETE** /api/v1/meters/{meterIdOrSlug} | ☁ Delete meter |
| *MetersApi* | [**getMeter**](docs/MetersApi.md#getmeter) | **GET** /api/v1/meters/{meterIdOrSlug} | Get meter |
| *MetersApi* | [**listMeterSubjects**](docs/MetersApi.md#listmetersubjects) | **GET** /api/v1/meters/{meterIdOrSlug}/subjects | List meter subjects |
| *MetersApi* | [**listMeters**](docs/MetersApi.md#listmeters) | **GET** /api/v1/meters | List meters |
| *MetersApi* | [**queryMeter**](docs/MetersApi.md#querymeter) | **GET** /api/v1/meters/{meterIdOrSlug}/query | Query meter |
| *NotificationExperimentalApi* | [**createNotificationChannel**](docs/NotificationExperimentalApi.md#createnotificationchannel) | **POST** /api/v1/notification/channels | Create a notification channel |
| *NotificationExperimentalApi* | [**createNotificationRule**](docs/NotificationExperimentalApi.md#createnotificationrule) | **POST** /api/v1/notification/rules | Create a notification rule |
| *NotificationExperimentalApi* | [**deleteNotificationChannel**](docs/NotificationExperimentalApi.md#deletenotificationchannel) | **DELETE** /api/v1/notification/channels/{channelId} | Delete a notification channel |
| *NotificationExperimentalApi* | [**deleteNotificationRule**](docs/NotificationExperimentalApi.md#deletenotificationrule) | **DELETE** /api/v1/notification/rules/{ruleId} | Delete a notification rule |
| *NotificationExperimentalApi* | [**getNotificationChannel**](docs/NotificationExperimentalApi.md#getnotificationchannel) | **GET** /api/v1/notification/channels/{channelId} | Get notification channel |
| *NotificationExperimentalApi* | [**getNotificationEvent**](docs/NotificationExperimentalApi.md#getnotificationevent) | **GET** /api/v1/notification/events/{eventId} | Get notification event |
| *NotificationExperimentalApi* | [**getNotificationRule**](docs/NotificationExperimentalApi.md#getnotificationrule) | **GET** /api/v1/notification/rules/{ruleId} | Get notification rule |
| *NotificationExperimentalApi* | [**listNotificationChannels**](docs/NotificationExperimentalApi.md#listnotificationchannels) | **GET** /api/v1/notification/channels | List notification channels |
| *NotificationExperimentalApi* | [**listNotificationEvents**](docs/NotificationExperimentalApi.md#listnotificationevents) | **GET** /api/v1/notification/events | List notification evens |
| *NotificationExperimentalApi* | [**listNotificationRules**](docs/NotificationExperimentalApi.md#listnotificationrules) | **GET** /api/v1/notification/rules | List notification rules |
| *NotificationExperimentalApi* | [**testNotificationRule**](docs/NotificationExperimentalApi.md#testnotificationrule) | **POST** /api/v1/notification/rules/{ruleId}/test | Test notification rule |
| *NotificationExperimentalApi* | [**updateNotificationChannel**](docs/NotificationExperimentalApi.md#updatenotificationchannel) | **PUT** /api/v1/notification/channels/{channelId} | Update notification channel |
| *NotificationExperimentalApi* | [**updateNotificationRule**](docs/NotificationExperimentalApi.md#updatenotificationrule) | **PUT** /api/v1/notification/rules/{ruleId} | Update a notification rule |
| *NotificationsExperimentalApi* | [**receiveSvixOperationalEvent**](docs/NotificationsExperimentalApi.md#receivesvixoperationalevent) | **POST** /api/v1/notification/webhook/svix | Receive Svix operational events |
| *PortalApi* | [**createPortalToken**](docs/PortalApi.md#createportaltoken) | **POST** /api/v1/portal/tokens | Create portal token |
| *PortalApi* | [**invalidatePortalTokens**](docs/PortalApi.md#invalidateportaltokens) | **POST** /api/v1/portal/tokens/invalidate | ☁ Invalidate portal tokens |
| *PortalApi* | [**listPortalTokens**](docs/PortalApi.md#listportaltokens) | **GET** /api/v1/portal/tokens | ☁ List portal tokens |
| *PortalApi* | [**queryPortalMeter**](docs/PortalApi.md#queryportalmeter) | **GET** /api/v1/portal/meters/{meterSlug}/query | Query portal meter |
| *SubjectsApi* | [**deleteSubject**](docs/SubjectsApi.md#deletesubject) | **DELETE** /api/v1/subjects/{subjectIdOrKey} | ☁ Delete subject |
| *SubjectsApi* | [**getSubject**](docs/SubjectsApi.md#getsubject) | **GET** /api/v1/subjects/{subjectIdOrKey} | ☁ Get subject |
| *SubjectsApi* | [**listSubjects**](docs/SubjectsApi.md#listsubjects) | **GET** /api/v1/subjects | ☁ List subjects |
| *SubjectsApi* | [**upsertSubject**](docs/SubjectsApi.md#upsertsubject) | **POST** /api/v1/subjects | ☁ Upsert subject |


<a id="documentation-for-models"></a>
## Documentation for Models

 - [xyz.hisname.openmeter.models.BalanceHistoryWindow](docs/BalanceHistoryWindow.md)
 - [xyz.hisname.openmeter.models.ConflictProblem](docs/ConflictProblem.md)
 - [xyz.hisname.openmeter.models.ConflictProblemExtensions](docs/ConflictProblemExtensions.md)
 - [xyz.hisname.openmeter.models.Entitlement](docs/Entitlement.md)
 - [xyz.hisname.openmeter.models.EntitlementBoolean](docs/EntitlementBoolean.md)
 - [xyz.hisname.openmeter.models.EntitlementBooleanCreateInputs](docs/EntitlementBooleanCreateInputs.md)
 - [xyz.hisname.openmeter.models.EntitlementCreateInputs](docs/EntitlementCreateInputs.md)
 - [xyz.hisname.openmeter.models.EntitlementCreateSharedFields](docs/EntitlementCreateSharedFields.md)
 - [xyz.hisname.openmeter.models.EntitlementGrant](docs/EntitlementGrant.md)
 - [xyz.hisname.openmeter.models.EntitlementGrantCreateInput](docs/EntitlementGrantCreateInput.md)
 - [xyz.hisname.openmeter.models.EntitlementMetered](docs/EntitlementMetered.md)
 - [xyz.hisname.openmeter.models.EntitlementMeteredCalculatedFields](docs/EntitlementMeteredCalculatedFields.md)
 - [xyz.hisname.openmeter.models.EntitlementMeteredCreateInputs](docs/EntitlementMeteredCreateInputs.md)
 - [xyz.hisname.openmeter.models.EntitlementSharedFields](docs/EntitlementSharedFields.md)
 - [xyz.hisname.openmeter.models.EntitlementStatic](docs/EntitlementStatic.md)
 - [xyz.hisname.openmeter.models.EntitlementStaticCreateInputs](docs/EntitlementStaticCreateInputs.md)
 - [xyz.hisname.openmeter.models.EntitlementValue](docs/EntitlementValue.md)
 - [xyz.hisname.openmeter.models.Event](docs/Event.md)
 - [xyz.hisname.openmeter.models.ExpirationPeriod](docs/ExpirationPeriod.md)
 - [xyz.hisname.openmeter.models.Feature](docs/Feature.md)
 - [xyz.hisname.openmeter.models.FeatureCreateInputs](docs/FeatureCreateInputs.md)
 - [xyz.hisname.openmeter.models.FeatureMeta](docs/FeatureMeta.md)
 - [xyz.hisname.openmeter.models.GetEntitlementById](docs/GetEntitlementById.md)
 - [xyz.hisname.openmeter.models.GrantBurnDownHistorySegment](docs/GrantBurnDownHistorySegment.md)
 - [xyz.hisname.openmeter.models.GrantUsageRecord](docs/GrantUsageRecord.md)
 - [xyz.hisname.openmeter.models.IdOrSlug](docs/IdOrSlug.md)
 - [xyz.hisname.openmeter.models.IngestedEvent](docs/IngestedEvent.md)
 - [xyz.hisname.openmeter.models.InvalidatePortalTokensRequest](docs/InvalidatePortalTokensRequest.md)
 - [xyz.hisname.openmeter.models.ListEntitlementGrantResponse](docs/ListEntitlementGrantResponse.md)
 - [xyz.hisname.openmeter.models.ListEntitlementGrantResponseOneOf](docs/ListEntitlementGrantResponseOneOf.md)
 - [xyz.hisname.openmeter.models.ListEntitlementResponse](docs/ListEntitlementResponse.md)
 - [xyz.hisname.openmeter.models.ListEntitlementResponseOneOf](docs/ListEntitlementResponseOneOf.md)
 - [xyz.hisname.openmeter.models.ListFeatureResponse](docs/ListFeatureResponse.md)
 - [xyz.hisname.openmeter.models.ListFeatureResponseOneOf](docs/ListFeatureResponseOneOf.md)
 - [xyz.hisname.openmeter.models.MeasureUsageFrom](docs/MeasureUsageFrom.md)
 - [xyz.hisname.openmeter.models.MeasureUsageFromEnum](docs/MeasureUsageFromEnum.md)
 - [xyz.hisname.openmeter.models.Meter](docs/Meter.md)
 - [xyz.hisname.openmeter.models.MeterAggregation](docs/MeterAggregation.md)
 - [xyz.hisname.openmeter.models.MeterQueryResult](docs/MeterQueryResult.md)
 - [xyz.hisname.openmeter.models.MeterQueryRow](docs/MeterQueryRow.md)
 - [xyz.hisname.openmeter.models.NotificationChannel](docs/NotificationChannel.md)
 - [xyz.hisname.openmeter.models.NotificationChannelCommon](docs/NotificationChannelCommon.md)
 - [xyz.hisname.openmeter.models.NotificationChannelCommonCreateRequest](docs/NotificationChannelCommonCreateRequest.md)
 - [xyz.hisname.openmeter.models.NotificationChannelCreateRequest](docs/NotificationChannelCreateRequest.md)
 - [xyz.hisname.openmeter.models.NotificationChannelMeta](docs/NotificationChannelMeta.md)
 - [xyz.hisname.openmeter.models.NotificationChannelType](docs/NotificationChannelType.md)
 - [xyz.hisname.openmeter.models.NotificationChannelWebhook](docs/NotificationChannelWebhook.md)
 - [xyz.hisname.openmeter.models.NotificationChannelWebhookCreateRequest](docs/NotificationChannelWebhookCreateRequest.md)
 - [xyz.hisname.openmeter.models.NotificationChannelsResponse](docs/NotificationChannelsResponse.md)
 - [xyz.hisname.openmeter.models.NotificationEvent](docs/NotificationEvent.md)
 - [xyz.hisname.openmeter.models.NotificationEventBalanceThresholdPayload](docs/NotificationEventBalanceThresholdPayload.md)
 - [xyz.hisname.openmeter.models.NotificationEventBalanceThresholdPayloadAllOfData](docs/NotificationEventBalanceThresholdPayloadAllOfData.md)
 - [xyz.hisname.openmeter.models.NotificationEventCommonPayload](docs/NotificationEventCommonPayload.md)
 - [xyz.hisname.openmeter.models.NotificationEventCreateRequest](docs/NotificationEventCreateRequest.md)
 - [xyz.hisname.openmeter.models.NotificationEventDeliveryStatus](docs/NotificationEventDeliveryStatus.md)
 - [xyz.hisname.openmeter.models.NotificationEventPayload](docs/NotificationEventPayload.md)
 - [xyz.hisname.openmeter.models.NotificationEventType](docs/NotificationEventType.md)
 - [xyz.hisname.openmeter.models.NotificationEventsResponse](docs/NotificationEventsResponse.md)
 - [xyz.hisname.openmeter.models.NotificationRule](docs/NotificationRule.md)
 - [xyz.hisname.openmeter.models.NotificationRuleBalanceThreshold](docs/NotificationRuleBalanceThreshold.md)
 - [xyz.hisname.openmeter.models.NotificationRuleBalanceThresholdCreateRequest](docs/NotificationRuleBalanceThresholdCreateRequest.md)
 - [xyz.hisname.openmeter.models.NotificationRuleBalanceThresholdValue](docs/NotificationRuleBalanceThresholdValue.md)
 - [xyz.hisname.openmeter.models.NotificationRuleCommon](docs/NotificationRuleCommon.md)
 - [xyz.hisname.openmeter.models.NotificationRuleCommonCreateRequest](docs/NotificationRuleCommonCreateRequest.md)
 - [xyz.hisname.openmeter.models.NotificationRuleCreateRequest](docs/NotificationRuleCreateRequest.md)
 - [xyz.hisname.openmeter.models.NotificationRuleMeta](docs/NotificationRuleMeta.md)
 - [xyz.hisname.openmeter.models.NotificationRulesResponse](docs/NotificationRulesResponse.md)
 - [xyz.hisname.openmeter.models.Period](docs/Period.md)
 - [xyz.hisname.openmeter.models.PortalToken](docs/PortalToken.md)
 - [xyz.hisname.openmeter.models.Problem](docs/Problem.md)
 - [xyz.hisname.openmeter.models.RecurringPeriod](docs/RecurringPeriod.md)
 - [xyz.hisname.openmeter.models.RecurringPeriodCreateInput](docs/RecurringPeriodCreateInput.md)
 - [xyz.hisname.openmeter.models.RecurringPeriodEnum](docs/RecurringPeriodEnum.md)
 - [xyz.hisname.openmeter.models.ResetEntitlementUsageRequest](docs/ResetEntitlementUsageRequest.md)
 - [xyz.hisname.openmeter.models.SharedMetaFields](docs/SharedMetaFields.md)
 - [xyz.hisname.openmeter.models.Subject](docs/Subject.md)
 - [xyz.hisname.openmeter.models.SvixOperationalWebhookRequest](docs/SvixOperationalWebhookRequest.md)
 - [xyz.hisname.openmeter.models.TestNotificationRule201Response](docs/TestNotificationRule201Response.md)
 - [xyz.hisname.openmeter.models.WindowSize](docs/WindowSize.md)
 - [xyz.hisname.openmeter.models.WindowedBalanceHistory](docs/WindowedBalanceHistory.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="PortalTokenAuth"></a>
### PortalTokenAuth

- **Type**: HTTP Bearer Token authentication (jwt)

<a id="CloudTokenAuth"></a>
### CloudTokenAuth

- **Type**: HTTP Bearer Token authentication (opaque)

<a id="CloudCookieAuth"></a>
### CloudCookieAuth

- **Type**: API key
- **API key parameter name**: __session
- **Location**: 

<a id="CloudPortalTokenAuth"></a>
### CloudPortalTokenAuth

- **Type**: HTTP Bearer Token authentication (opaque)

