package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import java.math.BigDecimal
import kotlin.String
import kotlin.collections.List

public data class DiscoveryGuildResponse(
  /**
   * Guild ID
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  /**
   * Guild name
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
  @param:JsonProperty("icon")
  @get:JsonProperty("icon")
  public val icon: String? = null,
  @param:JsonProperty("description")
  @get:JsonProperty("description")
  public val description: String? = null,
  /**
   * Discovery category type
   */
  @param:JsonProperty("category_type")
  @get:JsonProperty("category_type")
  @get:NotNull
  public val categoryType: BigDecimal,
  /**
   * Approximate member count
   */
  @param:JsonProperty("member_count")
  @get:JsonProperty("member_count")
  @get:NotNull
  public val memberCount: BigDecimal,
  /**
   * Approximate online member count
   */
  @param:JsonProperty("online_count")
  @get:JsonProperty("online_count")
  @get:NotNull
  public val onlineCount: BigDecimal,
  /**
   * Guild feature flags
   */
  @param:JsonProperty("features")
  @get:JsonProperty("features")
  @get:NotNull
  public val features: List<String>,
  /**
   * Verification level
   */
  @param:JsonProperty("verification_level")
  @get:JsonProperty("verification_level")
  @get:NotNull
  public val verificationLevel: BigDecimal,
)
