package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Boolean
import kotlin.String

public data class IpAuthorizationPollResponse(
  /**
   * Whether the IP authorization has been completed
   */
  @param:JsonProperty(
    "completed",
    required = true,
  )
  @get:JsonProperty("completed")
  @get:NotNull
  public val completed: Boolean,
  @param:JsonProperty("token")
  @get:JsonProperty("token")
  public val token: String? = null,
  @param:JsonProperty("user_id")
  @get:JsonProperty("user_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val userId: String? = null,
)
