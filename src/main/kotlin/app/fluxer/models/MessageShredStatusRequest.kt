package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class MessageShredStatusRequest(
  @param:JsonProperty("job_id")
  @get:JsonProperty("job_id")
  @get:NotNull
  public val jobId: String,
)
