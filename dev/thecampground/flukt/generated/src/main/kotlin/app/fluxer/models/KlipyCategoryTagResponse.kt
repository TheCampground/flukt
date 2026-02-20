package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class KlipyCategoryTagResponse(
  /**
   * The category/tag name
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
  /**
   * URL to the category preview image
   */
  @param:JsonProperty("src")
  @get:JsonProperty("src")
  @get:NotNull
  public val src: String,
  /**
   * Proxied URL to the category preview image
   */
  @param:JsonProperty("proxy_src")
  @get:JsonProperty("proxy_src")
  @get:NotNull
  public val proxySrc: String,
)
