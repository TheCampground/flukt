package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Boolean
import kotlin.Int
import kotlin.String

public data class OAuth2IntrospectResponse(
  /**
   * Whether the token is currently active
   */
  @param:JsonProperty(
    "active",
    required = true,
  )
  @get:JsonProperty("active")
  @get:NotNull
  public val active: Boolean,
  /**
   * The space-separated list of scopes
   */
  @param:JsonProperty("scope")
  @get:JsonProperty("scope")
  public val scope: String? = null,
  @param:JsonProperty("client_id")
  @get:JsonProperty("client_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val clientId: String? = null,
  /**
   * The username of the token owner
   */
  @param:JsonProperty("username")
  @get:JsonProperty("username")
  public val username: String? = null,
  /**
   * The type of token
   */
  @param:JsonProperty("token_type")
  @get:JsonProperty("token_type")
  public val tokenType: String? = null,
  @param:JsonProperty("exp")
  @get:JsonProperty("exp")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val exp: Int? = null,
  @param:JsonProperty("iat")
  @get:JsonProperty("iat")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val iat: Int? = null,
  @param:JsonProperty("sub")
  @get:JsonProperty("sub")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val sub: String? = null,
)
