package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

public data class SsoConfigResponse(
  @param:JsonProperty(
    "enabled",
    required = true,
  )
  @get:JsonProperty("enabled")
  @get:NotNull
  public val enabled: Boolean,
  @param:JsonProperty("display_name")
  @get:JsonProperty("display_name")
  public val displayName: String?,
  @param:JsonProperty("issuer")
  @get:JsonProperty("issuer")
  public val issuer: String?,
  @param:JsonProperty("authorization_url")
  @get:JsonProperty("authorization_url")
  public val authorizationUrl: String?,
  @param:JsonProperty("token_url")
  @get:JsonProperty("token_url")
  public val tokenUrl: String?,
  @param:JsonProperty("userinfo_url")
  @get:JsonProperty("userinfo_url")
  public val userinfoUrl: String?,
  @param:JsonProperty("jwks_url")
  @get:JsonProperty("jwks_url")
  public val jwksUrl: String?,
  @param:JsonProperty("client_id")
  @get:JsonProperty("client_id")
  public val clientId: String?,
  @param:JsonProperty(
    "client_secret_set",
    required = true,
  )
  @get:JsonProperty("client_secret_set")
  @get:NotNull
  public val clientSecretSet: Boolean,
  @param:JsonProperty("scope")
  @get:JsonProperty("scope")
  public val scope: String?,
  @param:JsonProperty("allowed_domains")
  @get:JsonProperty("allowed_domains")
  @get:NotNull
  @get:Size(max = 100)
  public val allowedDomains: List<String>,
  @param:JsonProperty(
    "auto_provision",
    required = true,
  )
  @get:JsonProperty("auto_provision")
  @get:NotNull
  public val autoProvision: Boolean,
  @param:JsonProperty("redirect_uri")
  @get:JsonProperty("redirect_uri")
  public val redirectUri: String?,
)
