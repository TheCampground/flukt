package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

public data class ApplicationCreateRequest(
  /**
   * The name of the application
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
  @param:JsonProperty("redirect_uris")
  @get:JsonProperty("redirect_uris")
  @get:Size(max = 10)
  public val redirectUris: List<String>? = null,
  /**
   * Whether the bot can be invited by anyone
   */
  @param:JsonProperty("bot_public")
  @get:JsonProperty("bot_public")
  public val botPublic: Boolean? = null,
  /**
   * Whether the bot requires OAuth2 code grant
   */
  @param:JsonProperty("bot_require_code_grant")
  @get:JsonProperty("bot_require_code_grant")
  public val botRequireCodeGrant: Boolean? = null,
)
