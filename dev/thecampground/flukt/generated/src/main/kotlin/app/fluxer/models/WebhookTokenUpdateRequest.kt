package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.ByteArray
import kotlin.String

public data class WebhookTokenUpdateRequest(
  /**
   * The new name of the webhook
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  public val name: String? = null,
  /**
   * Base64-encoded image data
   */
  @param:JsonProperty("avatar")
  @get:JsonProperty("avatar")
  public val avatar: ByteArray? = null,
)
