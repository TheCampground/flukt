package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import kotlin.Int
import kotlin.String

public data class VerifyAndCreateConnectionRequest(
  /**
   * The signed initiation token returned from the create endpoint
   */
  @param:JsonProperty("initiation_token")
  @get:JsonProperty("initiation_token")
  @get:NotNull
  public val initiationToken: String,
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
