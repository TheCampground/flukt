package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Size
import kotlin.Int
import kotlin.String

public data class DiscoveryApplicationPatchRequest(
  /**
   * Updated description for discovery listing
   */
  @param:JsonProperty("description")
  @get:JsonProperty("description")
  @get:Size(
    min = 10,
    max = 300,
  )
  public val description: String? = null,
  /**
   * Updated discovery category type
   */
  @param:JsonProperty("category_type")
  @get:JsonProperty("category_type")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "8",
    inclusive = true,
  )
  public val categoryType: Int? = null,
)
