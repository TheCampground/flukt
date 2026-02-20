package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import kotlin.String
import kotlin.collections.List

public data class CreatePrivateChannelRequest(
  @param:JsonProperty("recipient_id")
  @get:JsonProperty("recipient_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val recipientId: String? = null,
  /**
   * Array of user IDs for creating a group DM (max 9)
   */
  @param:JsonProperty("recipients")
  @get:JsonProperty("recipients")
  @get:Size(max = 9)
  public val recipients: List<String>? = null,
)
