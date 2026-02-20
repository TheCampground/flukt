package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import java.time.OffsetDateTime
import kotlin.Boolean
import kotlin.String

public data class CustomStatusResponse(
  @param:JsonProperty("text")
  @get:JsonProperty("text")
  public val text: String? = null,
  @param:JsonProperty("expires_at")
  @get:JsonProperty("expires_at")
  public val expiresAt: OffsetDateTime? = null,
  @param:JsonProperty("emoji_id")
  @get:JsonProperty("emoji_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val emojiId: String? = null,
  @param:JsonProperty("emoji_name")
  @get:JsonProperty("emoji_name")
  public val emojiName: String? = null,
  /**
   * Whether the status emoji is animated
   */
  @param:JsonProperty(
    "emoji_animated",
    required = true,
  )
  @get:JsonProperty("emoji_animated")
  @get:NotNull
  public val emojiAnimated: Boolean,
)
