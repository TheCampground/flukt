package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import kotlin.Boolean
import kotlin.Long
import kotlin.String

public data class MessageShredResponse(
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
  @param:JsonProperty("requested")
  @get:JsonProperty("requested")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "9007199254740991",
    inclusive = true,
  )
  public val requested: Long? = null,
)
