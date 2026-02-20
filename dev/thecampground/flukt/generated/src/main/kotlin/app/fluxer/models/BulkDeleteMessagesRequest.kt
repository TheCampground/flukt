package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String
import kotlin.collections.List

public data class BulkDeleteMessagesRequest(
  /**
   * Array of message IDs to delete
   */
  @param:JsonProperty("message_ids")
  @get:JsonProperty("message_ids")
  @get:NotNull
  public val messageIds: List<String>,
)
