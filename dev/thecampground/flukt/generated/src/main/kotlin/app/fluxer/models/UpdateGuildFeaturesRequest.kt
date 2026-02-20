package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import kotlin.String
import kotlin.collections.List

public data class UpdateGuildFeaturesRequest(
  @param:JsonProperty("guild_id")
  @get:JsonProperty("guild_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val guildId: String,
  /**
   * Guild features to add
   */
  @param:JsonProperty("add_features")
  @get:JsonProperty("add_features")
  @get:Size(max = 100)
  public val addFeatures: List<String>? = null,
  /**
   * Guild features to remove
   */
  @param:JsonProperty("remove_features")
  @get:JsonProperty("remove_features")
  @get:Size(max = 100)
  public val removeFeatures: List<String>? = null,
)
