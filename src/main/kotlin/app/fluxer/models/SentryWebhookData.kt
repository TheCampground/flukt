package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull

public data class SentryWebhookData(
  @param:JsonProperty("issue")
  @get:JsonProperty("issue")
  @get:NotNull
  @get:Valid
  public val issue: SentryWebhookIssue,
)
