package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.String
import kotlin.collections.List

public data class UpdateFavoriteMemeBodySchema(
  /**
   * Display name for the meme
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  public val name: String? = null,
  @param:JsonProperty("alt_text")
  @get:JsonProperty("alt_text")
  public val altText: String? = null,
  @param:JsonProperty("tags")
  @get:JsonProperty("tags")
  public val tags: List<String>? = null,
)
