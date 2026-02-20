package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

public data class ApplicationResponse(
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
  /**
   * The registered redirect URIs for OAuth2
   */
  @param:JsonProperty("redirect_uris")
  @get:JsonProperty("redirect_uris")
  @get:NotNull
  @get:Size(max = 20)
  public val redirectUris: List<String>,
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
   * Whether the bot requires OAuth2 code grant
   */
  @param:JsonProperty(
    "bot_require_code_grant",
    required = true,
  )
  @get:JsonProperty("bot_require_code_grant")
  @get:NotNull
  public val botRequireCodeGrant: Boolean,
  /**
   * The client secret for OAuth2 authentication
   */
  @param:JsonProperty("client_secret")
  @get:JsonProperty("client_secret")
  public val clientSecret: String? = null,
  /**
   * Detailed bot user metadata
   */
  @param:JsonProperty("bot")
  @get:JsonProperty("bot")
  @get:Valid
  public val bot: ApplicationBotResponse? = null,
)
