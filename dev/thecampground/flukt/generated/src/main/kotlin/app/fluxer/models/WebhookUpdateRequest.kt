package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.Pattern
import kotlin.ByteArray
import kotlin.String

public data class WebhookUpdateRequest(
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
  @param:JsonProperty("channel_id")
  @get:JsonProperty("channel_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val channelId: String? = null,
)
