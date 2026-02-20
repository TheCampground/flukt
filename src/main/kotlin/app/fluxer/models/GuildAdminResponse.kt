package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public data class GuildAdminResponse(
  /**
   * The unique identifier for this guild
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  /**
   * The name of the guild
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
  /**
   * Array of guild feature flags
   */
  @param:JsonProperty("features")
  @get:JsonProperty("features")
  @get:NotNull
  @get:Size(max = 100)
  public val features: List<String>,
  /**
   * The ID of the guild owner
   */
  @param:JsonProperty("owner_id")
  @get:JsonProperty("owner_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val ownerId: String,
  @param:JsonProperty("icon")
  @get:JsonProperty("icon")
  public val icon: String?,
  @param:JsonProperty("banner")
  @get:JsonProperty("banner")
  public val banner: String?,
  /**
   * The number of members in the guild
   */
  @param:JsonProperty(
    "member_count",
    required = true,
  )
  @get:JsonProperty("member_count")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val memberCount: Int,
)
