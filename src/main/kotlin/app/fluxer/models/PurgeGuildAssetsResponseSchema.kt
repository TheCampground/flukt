package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import kotlin.collections.List

public data class PurgeGuildAssetsResponseSchema(
  @param:JsonProperty("processed")
  @get:JsonProperty("processed")
  @get:NotNull
  @get:Valid
  public val processed: List<PurgeGuildAssetResultSchema>,
  @param:JsonProperty("errors")
  @get:JsonProperty("errors")
  @get:NotNull
  @get:Valid
  public val errors: List<PurgeGuildAssetErrorSchema>,
)
