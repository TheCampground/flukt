package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.String
import kotlin.collections.List

public data class PurgeGuildAssetsRequest(
  /**
   * List of asset IDs to purge
   */
  @param:JsonProperty("ids")
  @get:JsonProperty("ids")
  @get:NotNull
  @get:Size(max = 100)
  public val ids: List<String>,
)
