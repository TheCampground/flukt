package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import kotlin.Boolean
import kotlin.Int
import kotlin.String

public data class InstanceConfigResponse(
  @param:JsonProperty(
    "manual_review_enabled",
    required = true,
  )
  @get:JsonProperty("manual_review_enabled")
  @get:NotNull
  public val manualReviewEnabled: Boolean,
  @param:JsonProperty(
    "manual_review_schedule_enabled",
    required = true,
  )
  @get:JsonProperty("manual_review_schedule_enabled")
  @get:NotNull
  public val manualReviewScheduleEnabled: Boolean,
  @param:JsonProperty(
    "manual_review_schedule_start_hour_utc",
    required = true,
  )
  @get:JsonProperty("manual_review_schedule_start_hour_utc")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val manualReviewScheduleStartHourUtc: Int,
  @param:JsonProperty(
    "manual_review_schedule_end_hour_utc",
    required = true,
  )
  @get:JsonProperty("manual_review_schedule_end_hour_utc")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val manualReviewScheduleEndHourUtc: Int,
  @param:JsonProperty(
    "manual_review_active_now",
    required = true,
  )
  @get:JsonProperty("manual_review_active_now")
  @get:NotNull
  public val manualReviewActiveNow: Boolean,
  @param:JsonProperty("registration_alerts_webhook_url")
  @get:JsonProperty("registration_alerts_webhook_url")
  public val registrationAlertsWebhookUrl: String?,
  @param:JsonProperty("system_alerts_webhook_url")
  @get:JsonProperty("system_alerts_webhook_url")
  public val systemAlertsWebhookUrl: String?,
  @param:JsonProperty("sso")
  @get:JsonProperty("sso")
  @get:NotNull
  @get:Valid
  public val sso: SsoConfigResponse,
  @param:JsonProperty(
    "self_hosted",
    required = true,
  )
  @get:JsonProperty("self_hosted")
  @get:NotNull
  public val selfHosted: Boolean,
)
