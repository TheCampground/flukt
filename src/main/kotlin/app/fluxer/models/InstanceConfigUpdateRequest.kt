package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import java.net.URI
import kotlin.Boolean
import kotlin.Int

public data class InstanceConfigUpdateRequest(
  @param:JsonProperty("manual_review_enabled")
  @get:JsonProperty("manual_review_enabled")
  public val manualReviewEnabled: Boolean? = null,
  @param:JsonProperty("manual_review_schedule_enabled")
  @get:JsonProperty("manual_review_schedule_enabled")
  public val manualReviewScheduleEnabled: Boolean? = null,
  @param:JsonProperty("manual_review_schedule_start_hour_utc")
  @get:JsonProperty("manual_review_schedule_start_hour_utc")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "23",
    inclusive = true,
  )
  public val manualReviewScheduleStartHourUtc: Int? = null,
  @param:JsonProperty("manual_review_schedule_end_hour_utc")
  @get:JsonProperty("manual_review_schedule_end_hour_utc")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "23",
    inclusive = true,
  )
  public val manualReviewScheduleEndHourUtc: Int? = null,
  @param:JsonProperty("registration_alerts_webhook_url")
  @get:JsonProperty("registration_alerts_webhook_url")
  public val registrationAlertsWebhookUrl: URI? = null,
  @param:JsonProperty("system_alerts_webhook_url")
  @get:JsonProperty("system_alerts_webhook_url")
  public val systemAlertsWebhookUrl: URI? = null,
  @param:JsonProperty("sso")
  @get:JsonProperty("sso")
  @get:Valid
  public val sso: InstanceConfigUpdateRequestSso? = null,
)
