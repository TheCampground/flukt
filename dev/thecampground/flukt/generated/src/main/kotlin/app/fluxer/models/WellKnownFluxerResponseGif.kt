package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull

/**
 * GIF provider configuration for clients
 */
public data class WellKnownFluxerResponseGif(
  /**
   * GIF provider used by the instance GIF picker
   */
  @param:JsonProperty("provider")
  @get:JsonProperty("provider")
  @get:NotNull
  public val provider: GifProvider,
)
