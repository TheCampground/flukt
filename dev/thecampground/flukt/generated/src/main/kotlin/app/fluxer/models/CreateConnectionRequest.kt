package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.Int
import kotlin.String

public data class CreateConnectionRequest(
  /**
   * The type of connection to create
   */
  @param:JsonProperty("type")
  @get:JsonProperty("type")
  @get:NotNull
  public val type: CreateConnectionRequestType,
  /**
   * The connection identifier (handle or domain)
   */
  @param:JsonProperty("identifier")
  @get:JsonProperty("identifier")
  @get:NotNull
  @get:Size(
    min = 1,
    max = 253,
  )
  public val identifier: String,
  @param:JsonProperty("visibility_flags")
  @get:JsonProperty("visibility_flags")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val visibilityFlags: Int? = null,
)
