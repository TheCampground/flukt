package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import kotlin.Int

public data class GenerateGiftCodesRequest(
  /**
   * Number of gift codes to generate
   */
  @param:JsonProperty(
    "count",
    required = true,
  )
  @get:JsonProperty("count")
  @get:NotNull
  @get:DecimalMin(
    value = "1",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "100",
    inclusive = true,
  )
  public val count: Int,
  /**
   * Type of gift subscription
   */
  @param:JsonProperty("product_type")
  @get:JsonProperty("product_type")
  @get:NotNull
  public val productType: GenerateGiftCodesRequestProductType,
)
