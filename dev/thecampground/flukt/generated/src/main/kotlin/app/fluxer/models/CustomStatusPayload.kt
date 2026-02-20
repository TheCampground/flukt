package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.Pattern
import kotlin.Any
import kotlin.String

public data class CustomStatusPayload(
  @param:JsonProperty("text")
  @get:JsonProperty("text")
  public val text: String? = null,
  /**
   * When the custom status expires
   */
  @param:JsonProperty("expires_at")
  @get:JsonProperty("expires_at")
  public val expiresAt: Any? = null,
  @param:JsonProperty("emoji_id")
  @get:JsonProperty("emoji_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val emojiId: String? = null,
  @param:JsonProperty("emoji_name")
  @get:JsonProperty("emoji_name")
  public val emojiName: String? = null,
)
