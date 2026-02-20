package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.String
import kotlin.collections.List

public data class BulkUpdateGuildFeaturesRequest(
  /**
   * List of guild IDs to update
   */
  @param:JsonProperty("guild_ids")
  @get:JsonProperty("guild_ids")
  @get:NotNull
  @get:Size(max = 1_000)
  public val guildIds: List<String>,
  /**
   * Guild features to add to all specified guilds
   */
  @param:JsonProperty("add_features")
  @get:JsonProperty("add_features")
  @get:Size(max = 100)
  public val addFeatures: List<String>? = null,
  /**
   * Guild features to remove from all specified guilds
   */
  @param:JsonProperty("remove_features")
  @get:JsonProperty("remove_features")
  @get:Size(max = 100)
  public val removeFeatures: List<String>? = null,
)
