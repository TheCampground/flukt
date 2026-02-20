package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.Boolean
import kotlin.ByteArray
import kotlin.String

public data class GuildCreateRequest(
  /**
   * The name of the guild (1-100 characters)
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
  /**
   * Base64-encoded image data
   */
  @param:JsonProperty("icon")
  @get:JsonProperty("icon")
  public val icon: ByteArray? = null,
  /**
   * Whether to create the guild without default features
   */
  @param:JsonProperty("empty_features")
  @get:JsonProperty("empty_features")
  public val emptyFeatures: Boolean? = null,
)
