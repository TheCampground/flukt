package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.String

public data class PackUpdateRequest(
  /**
   * The new name of the pack
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  public val name: String? = null,
  @param:JsonProperty("description")
  @get:JsonProperty("description")
  public val description: String? = null,
)
