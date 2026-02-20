package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.collections.List

public data class GuildEmojiBulkCreateRequest(
  /**
   * Array of emoji objects to create (1-50 emojis per batch)
   */
  @param:JsonProperty("emojis")
  @get:JsonProperty("emojis")
  @get:NotNull
  @get:Size(
    min = 1,
    max = 50,
  )
  @get:Valid
  public val emojis: List<GuildEmojiCreateRequest>,
)
