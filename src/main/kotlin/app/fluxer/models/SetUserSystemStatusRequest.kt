package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Boolean
import kotlin.String

public data class SetUserSystemStatusRequest(
  @param:JsonProperty("user_id")
  @get:JsonProperty("user_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val userId: String,
  /**
   * Whether the user should be marked as a system user
   */
  @param:JsonProperty(
    "system",
    required = true,
  )
  @get:JsonProperty("system")
  @get:NotNull
  public val system: Boolean,
)
