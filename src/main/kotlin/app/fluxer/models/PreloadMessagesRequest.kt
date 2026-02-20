package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.String
import kotlin.collections.List

public data class PreloadMessagesRequest(
  /**
   * Array of channel IDs to preload messages from (max 100)
   */
  @param:JsonProperty("channels")
  @get:JsonProperty("channels")
  @get:NotNull
  @get:Size(max = 100)
  public val channels: List<String>,
)
