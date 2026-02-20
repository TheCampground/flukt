package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import java.math.BigDecimal
import kotlin.Boolean

public data class DiscoveryStatusResponse(
  @param:JsonProperty("application")
  @get:JsonProperty("application")
  @get:Valid
  public val application: DiscoveryApplicationResponse? = null,
  /**
   * Whether the guild meets the requirements to apply for discovery
   */
  @param:JsonProperty(
    "eligible",
    required = true,
  )
  @get:JsonProperty("eligible")
  @get:NotNull
  public val eligible: Boolean,
  /**
   * Minimum member count required for discovery eligibility
   */
  @param:JsonProperty("min_member_count")
  @get:JsonProperty("min_member_count")
  @get:NotNull
  public val minMemberCount: BigDecimal,
)
