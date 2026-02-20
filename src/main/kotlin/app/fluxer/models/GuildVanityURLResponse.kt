package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import kotlin.Int
import kotlin.String

public data class GuildVanityURLResponse(
  @param:JsonProperty("code")
  @get:JsonProperty("code")
  public val code: String? = null,
  /**
   * The number of times this vanity URL has been used
   */
  @param:JsonProperty(
    "uses",
    required = true,
  )
  @get:JsonProperty("uses")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val uses: Int,
)
