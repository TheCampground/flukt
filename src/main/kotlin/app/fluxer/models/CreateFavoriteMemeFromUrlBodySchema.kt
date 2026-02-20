package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import java.net.URI
import kotlin.String
import kotlin.collections.List

public data class CreateFavoriteMemeFromUrlBodySchema(
  @param:JsonProperty("alt_text")
  @get:JsonProperty("alt_text")
  public val altText: String? = null,
  @param:JsonProperty("tags")
  @get:JsonProperty("tags")
  public val tags: List<String>? = null,
  /**
   * URL of the image or video to save as a favorite meme
   */
  @param:JsonProperty("url")
  @get:JsonProperty("url")
  @get:NotNull
  public val url: URI,
  @param:JsonProperty("klipy_slug")
  @get:JsonProperty("klipy_slug")
  public val klipySlug: String? = null,
  @param:JsonProperty("tenor_slug_id")
  @get:JsonProperty("tenor_slug_id")
  public val tenorSlugId: String? = null,
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  public val name: String? = null,
)
