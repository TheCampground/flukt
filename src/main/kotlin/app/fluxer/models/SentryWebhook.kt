package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import kotlin.String

public data class SentryWebhook(
  @param:JsonProperty("action")
  @get:JsonProperty("action")
  public val action: String? = null,
  @param:JsonProperty("installation")
  @get:JsonProperty("installation")
  @get:Valid
  public val installation: SentryWebhookInstallation? = null,
  @param:JsonProperty("data")
  @get:JsonProperty("data")
  @get:Valid
  public val `data`: SentryWebhookData? = null,
  @param:JsonProperty("actor")
  @get:JsonProperty("actor")
  @get:Valid
  public val actor: SentryWebhookActor? = null,
)
