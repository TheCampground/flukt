package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class GuildEmojiUpdateRequest(
  /**
   * The name of the emoji (2-32 characters, alphanumeric and underscores only)
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
)
