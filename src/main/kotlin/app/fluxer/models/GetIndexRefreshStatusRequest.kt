package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class GetIndexRefreshStatusRequest(
  /**
   * ID of the index refresh job to check
   */
  @param:JsonProperty("job_id")
  @get:JsonProperty("job_id")
  @get:NotNull
  public val jobId: String,
)
