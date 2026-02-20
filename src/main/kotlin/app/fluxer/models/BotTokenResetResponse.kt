package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class BotTokenResetResponse(
  /**
   * The new bot token
   */
  @param:JsonProperty("token")
  @get:JsonProperty("token")
  @get:NotNull
  public val token: String,
  /**
   * Detailed bot user metadata
   */
  @param:JsonProperty("bot")
  @get:JsonProperty("bot")
  @get:NotNull
  @get:Valid
  public val bot: ApplicationBotResponse,
)
