package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Int
import kotlin.String

public data class TempBanUserRequest(
  @param:JsonProperty("user_id")
  @get:JsonProperty("user_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val userId: String,
  /**
   * Duration of the ban in hours. Use 0 for a permanent ban (until manually unbanned).
   */
  @param:JsonProperty(
    "duration_hours",
    required = true,
  )
  @get:JsonProperty("duration_hours")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "8760",
    inclusive = true,
  )
  public val durationHours: Int,
  /**
   * Reason for the temporary ban
   */
  @param:JsonProperty("reason")
  @get:JsonProperty("reason")
  public val reason: String? = null,
)
