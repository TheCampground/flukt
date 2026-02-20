package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.collections.List

public data class ListVoiceRegionsResponse(
  /**
   * List of voice regions
   */
  @param:JsonProperty("regions")
  @get:JsonProperty("regions")
  @get:NotNull
  @get:Size(max = 100)
  @get:Valid
  public val regions: List<VoiceRegionAdminResponse>,
)
