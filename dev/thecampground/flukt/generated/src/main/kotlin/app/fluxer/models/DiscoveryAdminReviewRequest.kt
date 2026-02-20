package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.Size
import kotlin.String

public data class DiscoveryAdminReviewRequest(
  /**
   * Review reason
   */
  @param:JsonProperty("reason")
  @get:JsonProperty("reason")
  @get:Size(max = 500)
  public val reason: String? = null,
)
