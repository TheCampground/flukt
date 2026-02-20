package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * The application associated with the token
 */
public data class OAuth2MeResponseApplication(
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
   * The application flags
   */
  @param:JsonProperty(
    "flags",
    required = true,
  )
  @get:JsonProperty("flags")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val flags: Int,
)
