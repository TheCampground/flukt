package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class SentryWebhookMetadata(
  @param:JsonProperty("value")
  @get:JsonProperty("value")
  @get:NotNull
  public val `value`: String,
  @param:JsonProperty("type")
  @get:JsonProperty("type")
  @get:NotNull
  public val type: String,
)
