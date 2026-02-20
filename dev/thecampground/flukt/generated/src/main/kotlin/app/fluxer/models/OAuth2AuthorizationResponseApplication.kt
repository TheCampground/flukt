package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Boolean
import kotlin.String

/**
 * The application that was authorized
 */
public data class OAuth2AuthorizationResponseApplication(
  /**
   * The unique identifier of the application
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  /**
   * The name of the application
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
  @param:JsonProperty("icon")
  @get:JsonProperty("icon")
  public val icon: String?,
  @param:JsonProperty("description")
  @get:JsonProperty("description")
  public val description: String?,
  /**
   * Whether the bot can be invited by anyone
   */
  @param:JsonProperty(
    "bot_public",
    required = true,
  )
  @get:JsonProperty("bot_public")
  @get:NotNull
  public val botPublic: Boolean,
)
