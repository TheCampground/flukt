package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import java.time.OffsetDateTime
import kotlin.String
import kotlin.collections.List

public data class MessageCallResponse(
  /**
   * The user IDs of participants in the call
   */
  @param:JsonProperty("participants")
  @get:JsonProperty("participants")
  @get:NotNull
  @get:Size(max = 100)
  public val participants: List<String>,
  @param:JsonProperty("ended_timestamp")
  @get:JsonProperty("ended_timestamp")
  public val endedTimestamp: OffsetDateTime? = null,
)
