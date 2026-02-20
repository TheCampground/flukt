package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.Boolean

public data class CallEligibilityResponse(
  /**
   * Whether the current user can ring this call
   */
  @param:JsonProperty(
    "ringable",
    required = true,
  )
  @get:JsonProperty("ringable")
  @get:NotNull
  public val ringable: Boolean,
  /**
   * Whether the call should be joined silently
   */
  @param:JsonProperty(
    "silent",
    required = true,
  )
  @get:JsonProperty("silent")
  @get:NotNull
  public val silent: Boolean,
)
