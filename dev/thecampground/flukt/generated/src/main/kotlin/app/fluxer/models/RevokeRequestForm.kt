package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.String

public data class RevokeRequestForm(
  /**
   * The token to revoke
   */
  @param:JsonProperty("token")
  @get:JsonProperty("token")
  @get:NotNull
  public val token: String,
  /**
   * A hint about the type of token being revoked
   */
  @param:JsonProperty("token_type_hint")
  @get:JsonProperty("token_type_hint")
  public val tokenTypeHint: RevokeRequestFormTokenTypeHint? = null,
  @param:JsonProperty("client_id")
  @get:JsonProperty("client_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val clientId: String? = null,
  /**
   * The application client secret
   */
  @param:JsonProperty("client_secret")
  @get:JsonProperty("client_secret")
  public val clientSecret: String? = null,
)
