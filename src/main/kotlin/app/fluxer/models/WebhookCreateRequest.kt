package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.ByteArray
import kotlin.String

public data class WebhookCreateRequest(
  /**
   * The name of the webhook
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
  /**
   * Base64-encoded image data
   */
  @param:JsonProperty("avatar")
  @get:JsonProperty("avatar")
  public val avatar: ByteArray? = null,
)
