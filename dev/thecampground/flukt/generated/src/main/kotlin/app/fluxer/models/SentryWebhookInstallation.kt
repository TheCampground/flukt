package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class SentryWebhookInstallation(
  @param:JsonProperty("uuid")
  @get:JsonProperty("uuid")
  @get:NotNull
  public val uuid: String,
)
