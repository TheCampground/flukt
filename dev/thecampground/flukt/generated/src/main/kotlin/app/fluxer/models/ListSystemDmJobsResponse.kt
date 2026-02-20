package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.String
import kotlin.collections.List

public data class ListSystemDmJobsResponse(
  /**
   * List of system DM jobs
   */
  @param:JsonProperty("jobs")
  @get:JsonProperty("jobs")
  @get:NotNull
  @get:Size(max = 100)
  @get:Valid
  public val jobs: List<SystemDmJobResponse>,
  @param:JsonProperty("next_cursor")
  @get:JsonProperty("next_cursor")
  public val nextCursor: String? = null,
)
