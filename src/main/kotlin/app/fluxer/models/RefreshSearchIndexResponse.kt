package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.Boolean
import kotlin.String

public data class RefreshSearchIndexResponse(
  @param:JsonProperty(
    "success",
    required = true,
  )
  @get:JsonProperty("success")
  @get:NotNull
  public val success: Boolean,
  @param:JsonProperty("job_id")
  @get:JsonProperty("job_id")
  @get:NotNull
  public val jobId: String,
)
