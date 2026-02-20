package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.collections.List

public data class ReadStateAckBulkRequest(
  /**
   * Array of channel/message pairs to acknowledge
   */
  @param:JsonProperty("read_states")
  @get:JsonProperty("read_states")
  @get:NotNull
  @get:Size(
    min = 1,
    max = 100,
  )
  @get:Valid
  public val readStates: List<ReadStateAckBulkRequestReadStates>,
)
