package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull

public data class CreateVoiceRegionResponse(
  /**
   * Created voice region
   */
  @param:JsonProperty("region")
  @get:JsonProperty("region")
  @get:NotNull
  @get:Valid
  public val region: CreateVoiceRegionResponseRegion,
)
