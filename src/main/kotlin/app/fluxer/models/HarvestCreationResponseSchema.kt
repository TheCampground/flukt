package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.String

public data class HarvestCreationResponseSchema(
  /**
   * Unique identifier for the harvest request
   */
  @param:JsonProperty("harvest_id")
  @get:JsonProperty("harvest_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val harvestId: String,
  /**
   * Current status of the harvest request
   */
  @param:JsonProperty("status")
  @get:JsonProperty("status")
  @get:NotNull
  public val status: HarvestStatusEnum,
  /**
   * ISO 8601 timestamp when the harvest request was created
   */
  @param:JsonProperty("created_at")
  @get:JsonProperty("created_at")
  @get:NotNull
  public val createdAt: String,
)
