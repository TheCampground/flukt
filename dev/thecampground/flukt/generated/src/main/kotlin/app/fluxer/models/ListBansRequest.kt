package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import kotlin.Int

public data class ListBansRequest(
  /**
   * Maximum number of bans to return
   */
  @param:JsonProperty("limit")
  @get:JsonProperty("limit")
  @get:DecimalMin(
    value = "1",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "500",
    inclusive = true,
  )
  public val limit: Int? = null,
)
