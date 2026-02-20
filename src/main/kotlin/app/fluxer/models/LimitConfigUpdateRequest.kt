package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull

public data class LimitConfigUpdateRequest(
  /**
   * New limit configuration snapshot
   */
  @param:JsonProperty("limit_config")
  @get:JsonProperty("limit_config")
  @get:NotNull
  @get:Valid
  public val limitConfig: LimitConfigUpdateRequestLimitConfig,
)
