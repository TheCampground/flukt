package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Boolean
import kotlin.String

public data class PurgeGuildAssetResultSchema(
  /**
   * Unique identifier of the asset
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  /**
   * Type of guild asset
   */
  @param:JsonProperty("asset_type")
  @get:JsonProperty("asset_type")
  @get:NotNull
  public val assetType: PurgeGuildAssetResultSchemaAssetType,
  /**
   * Whether the asset was found in the database
   */
  @param:JsonProperty(
    "found_in_db",
    required = true,
  )
  @get:JsonProperty("found_in_db")
  @get:NotNull
  public val foundInDb: Boolean,
  @param:JsonProperty("guild_id")
  @get:JsonProperty("guild_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val guildId: String,
)
