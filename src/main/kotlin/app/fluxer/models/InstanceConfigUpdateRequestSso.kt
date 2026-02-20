package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.Size
import java.net.URI
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

public data class InstanceConfigUpdateRequestSso(
  @param:JsonProperty("enabled")
  @get:JsonProperty("enabled")
  public val enabled: Boolean? = null,
  @param:JsonProperty("display_name")
  @get:JsonProperty("display_name")
  public val displayName: String? = null,
  @param:JsonProperty("issuer")
  @get:JsonProperty("issuer")
  public val issuer: String? = null,
  @param:JsonProperty("authorization_url")
  @get:JsonProperty("authorization_url")
  public val authorizationUrl: String? = null,
  @param:JsonProperty("token_url")
  @get:JsonProperty("token_url")
  public val tokenUrl: String? = null,
  @param:JsonProperty("userinfo_url")
  @get:JsonProperty("userinfo_url")
  public val userinfoUrl: String? = null,
  @param:JsonProperty("jwks_url")
  @get:JsonProperty("jwks_url")
  public val jwksUrl: String? = null,
  @param:JsonProperty("client_id")
  @get:JsonProperty("client_id")
  public val clientId: String? = null,
  @param:JsonProperty("client_secret")
  @get:JsonProperty("client_secret")
  public val clientSecret: String? = null,
  @param:JsonProperty("scope")
  @get:JsonProperty("scope")
  public val scope: String? = null,
  @param:JsonProperty("allowed_domains")
  @get:JsonProperty("allowed_domains")
  @get:Size(max = 100)
  public val allowedDomains: List<String>? = null,
  @param:JsonProperty("auto_provision")
  @get:JsonProperty("auto_provision")
  public val autoProvision: Boolean? = null,
  @param:JsonProperty("redirect_uri")
  @get:JsonProperty("redirect_uri")
  public val redirectUri: URI? = null,
)
