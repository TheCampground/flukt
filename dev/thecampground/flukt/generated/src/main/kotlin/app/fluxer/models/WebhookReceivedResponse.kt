package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.Boolean

public data class WebhookReceivedResponse(
  /**
   * Whether the webhook was successfully received
   */
  @param:JsonProperty(
    "received",
    required = true,
  )
  @get:JsonProperty("received")
  @get:NotNull
  public val received: Boolean,
)
