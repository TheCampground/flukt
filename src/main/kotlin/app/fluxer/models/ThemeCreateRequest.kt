package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.String

public data class ThemeCreateRequest(
  /**
   * CSS text to store and share
   */
  @param:JsonProperty("css")
  @get:JsonProperty("css")
  @get:NotNull
  @get:Size(min = 1)
  public val css: String,
)
