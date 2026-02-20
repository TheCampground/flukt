package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.collections.List

public data class TenorFeaturedResponse(
  /**
   * Array of featured GIFs
   */
  @param:JsonProperty("gifs")
  @get:JsonProperty("gifs")
  @get:NotNull
  @get:Size(max = 50)
  @get:Valid
  public val gifs: List<TenorGifResponse>,
  /**
   * Array of GIF categories
   */
  @param:JsonProperty("categories")
  @get:JsonProperty("categories")
  @get:NotNull
  @get:Size(max = 100)
  @get:Valid
  public val categories: List<TenorCategoryTagResponse>,
)
