package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Boolean
import kotlin.String

public data class SetUserBotStatusRequest(
  @param:JsonProperty("user_id")
  @get:JsonProperty("user_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val userId: String,
  /**
   * Whether the user should be marked as a bot
   */
  @param:JsonProperty(
    "bot",
    required = true,
  )
  @get:JsonProperty("bot")
  @get:NotNull
  public val bot: Boolean,
)
