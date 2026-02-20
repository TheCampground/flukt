package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public data class CreateAdminApiKeyRequest(
  /**
   * Display name for the API key
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  @get:Size(
    min = 1,
    max = 100,
  )
  public val name: String,
  /**
   * Number of days until the key expires
   */
  @param:JsonProperty("expires_in_days")
  @get:JsonProperty("expires_in_days")
  @get:DecimalMin(
    value = "1",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "365",
    inclusive = true,
  )
  public val expiresInDays: Int? = null,
  /**
   * List of access control permissions for the key
   */
  @param:JsonProperty("acls")
  @get:JsonProperty("acls")
  @get:NotNull
  @get:Size(max = 100)
  public val acls: List<String>,
)
