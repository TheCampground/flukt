package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.String

public data class DiscoveryAdminRejectRequest(
  /**
   * Rejection reason
   */
  @param:JsonProperty("reason")
  @get:JsonProperty("reason")
  @get:NotNull
  @get:Size(
    min = 1,
    max = 500,
  )
  public val reason: String,
)
