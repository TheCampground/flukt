package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import java.math.BigDecimal
import kotlin.String

public data class DiscoveryApplicationResponse(
  /**
   * Guild ID
   */
  @param:JsonProperty("guild_id")
  @get:JsonProperty("guild_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val guildId: String,
  /**
   * Application status
   */
  @param:JsonProperty("status")
  @get:JsonProperty("status")
  @get:NotNull
  public val status: String,
  /**
   * Discovery description
   */
  @param:JsonProperty("description")
  @get:JsonProperty("description")
  @get:NotNull
  public val description: String,
  /**
   * Discovery category type
   */
  @param:JsonProperty("category_type")
  @get:JsonProperty("category_type")
  @get:NotNull
  public val categoryType: BigDecimal,
  /**
   * Application timestamp
   */
  @param:JsonProperty("applied_at")
  @get:JsonProperty("applied_at")
  @get:NotNull
  public val appliedAt: String,
  @param:JsonProperty("reviewed_at")
  @get:JsonProperty("reviewed_at")
  public val reviewedAt: String? = null,
  @param:JsonProperty("review_reason")
  @get:JsonProperty("review_reason")
  public val reviewReason: String? = null,
)
