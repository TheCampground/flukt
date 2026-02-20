package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.String
import kotlin.collections.List

public data class CreateAdminApiKeyResponse(
  /**
   * Unique identifier for the API key
   */
  @param:JsonProperty("key_id")
  @get:JsonProperty("key_id")
  @get:NotNull
  public val keyId: String,
  /**
   * The generated API key secret (only shown once)
   */
  @param:JsonProperty("key")
  @get:JsonProperty("key")
  @get:NotNull
  public val key: String,
  /**
   * Display name for the API key
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
  /**
   * ISO 8601 timestamp when the key was created
   */
  @param:JsonProperty("created_at")
  @get:JsonProperty("created_at")
  @get:NotNull
  public val createdAt: String,
  @param:JsonProperty("expires_at")
  @get:JsonProperty("expires_at")
  public val expiresAt: String?,
  /**
   * List of access control permissions for the key
   */
  @param:JsonProperty("acls")
  @get:JsonProperty("acls")
  @get:NotNull
  @get:Size(max = 100)
  public val acls: List<String>,
)
