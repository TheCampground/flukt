package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.String
import kotlin.collections.List

public data class ReorderConnectionsRequest(
  /**
   * Ordered list of connection IDs defining the new display order
   */
  @param:JsonProperty("connection_ids")
  @get:JsonProperty("connection_ids")
  @get:NotNull
  @get:Size(
    min = 1,
    max = 20,
  )
  public val connectionIds: List<String>,
)
