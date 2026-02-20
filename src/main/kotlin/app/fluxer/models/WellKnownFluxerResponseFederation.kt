package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.Boolean
import kotlin.Int

/**
 * Federation configuration
 */
public data class WellKnownFluxerResponseFederation(
  /**
   * Whether federation is enabled on this instance
   */
  @param:JsonProperty(
    "enabled",
    required = true,
  )
  @get:JsonProperty("enabled")
  @get:NotNull
  public val enabled: Boolean,
  /**
   * Federation protocol version
   */
  @param:JsonProperty(
    "version",
    required = true,
  )
  @get:JsonProperty("version")
  @get:NotNull
  public val version: Int,
)
