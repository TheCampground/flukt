package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import kotlin.String
import kotlin.collections.List

public data class ListAdminApiKeyResponse(
  /**
   * Unique identifier for the API key
   */
  @param:JsonProperty("key_id")
  @get:JsonProperty("key_id")
  @get:NotNull
  public val keyId: String,
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
  @param:JsonProperty("last_used_at")
  @get:JsonProperty("last_used_at")
  public val lastUsedAt: String?,
  @param:JsonProperty("expires_at")
  @get:JsonProperty("expires_at")
  public val expiresAt: String?,
  /**
   * User ID of the admin who created this key
   */
  @param:JsonProperty("created_by_user_id")
  @get:JsonProperty("created_by_user_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val createdByUserId: String,
  /**
   * List of access control permissions for the key
   */
  @param:JsonProperty("acls")
  @get:JsonProperty("acls")
  @get:NotNull
  @get:Size(max = 100)
  public val acls: List<String>,
)
