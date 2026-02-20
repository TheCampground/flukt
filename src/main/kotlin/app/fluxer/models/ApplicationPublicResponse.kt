package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

public data class ApplicationPublicResponse(
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
   * The registered redirect URIs for OAuth2
   */
  @param:JsonProperty("redirect_uris")
  @get:JsonProperty("redirect_uris")
  @get:NotNull
  @get:Size(max = 20)
  public val redirectUris: List<String>,
  /**
   * The available OAuth2 scopes
   */
  @param:JsonProperty("scopes")
  @get:JsonProperty("scopes")
  @get:NotNull
  @get:Size(max = 50)
  public val scopes: List<String>,
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
  /**
   * Detailed bot user metadata
   */
  @param:JsonProperty("bot")
  @get:JsonProperty("bot")
  @get:Valid
  public val bot: ApplicationBotResponse?,
)
