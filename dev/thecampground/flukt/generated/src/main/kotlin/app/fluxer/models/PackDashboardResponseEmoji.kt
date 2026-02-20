package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.Int
import kotlin.collections.List

/**
 * Dashboard section for emoji packs
 */
public data class PackDashboardResponseEmoji(
  /**
   * Maximum number of packs the user can install
   */
  @param:JsonProperty(
    "installed_limit",
    required = true,
  )
  @get:JsonProperty("installed_limit")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val installedLimit: Int,
  /**
   * Maximum number of packs the user can create
   */
  @param:JsonProperty(
    "created_limit",
    required = true,
  )
  @get:JsonProperty("created_limit")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val createdLimit: Int,
  /**
   * List of packs the user has installed
   */
  @param:JsonProperty("installed")
  @get:JsonProperty("installed")
  @get:NotNull
  @get:Size(max = 100)
  @get:Valid
  public val installed: List<PackSummaryResponse>,
  /**
   * List of packs the user has created
   */
  @param:JsonProperty("created")
  @get:JsonProperty("created")
  @get:NotNull
  @get:Size(max = 100)
  @get:Valid
  public val created: List<PackSummaryResponse>,
)
