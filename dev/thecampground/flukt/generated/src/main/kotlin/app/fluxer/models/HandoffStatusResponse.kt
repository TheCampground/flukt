package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.String

public data class HandoffStatusResponse(
  /**
   * Current status of the handoff (pending, completed, expired)
   */
  @param:JsonProperty("status")
  @get:JsonProperty("status")
  @get:NotNull
  public val status: String,
  @param:JsonProperty("token")
  @get:JsonProperty("token")
  public val token: String? = null,
  @param:JsonProperty("user_id")
  @get:JsonProperty("user_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val userId: String? = null,
)
