package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.String
import kotlin.collections.List

public data class BulkOperationResponse(
  @param:JsonProperty("successful")
  @get:JsonProperty("successful")
  @get:NotNull
  @get:Size(max = 1_000)
  public val successful: List<String>,
  @param:JsonProperty("failed")
  @get:JsonProperty("failed")
  @get:NotNull
  @get:Size(max = 1_000)
  @get:Valid
  public val failed: List<BulkOperationFailedResponse>,
)
