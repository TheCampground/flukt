package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.Int
import kotlin.String

public data class DiscoveryApplicationRequest(
  /**
   * Description for discovery listing
   */
  @param:JsonProperty("description")
  @get:JsonProperty("description")
  @get:NotNull
  @get:Size(
    min = 10,
    max = 300,
  )
  public val description: String,
  /**
   * Discovery category type
   */
  @param:JsonProperty(
    "category_type",
    required = true,
  )
  @get:JsonProperty("category_type")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "8",
    inclusive = true,
  )
  public val categoryType: Int,
)
