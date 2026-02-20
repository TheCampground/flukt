package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.ByteArray
import kotlin.Int
import kotlin.String
import kotlin.collections.Map

public data class ChannelUpdateGroupDmRequest(
  @param:JsonProperty(
    "type",
    required = true,
  )
  @get:JsonProperty("type")
  @get:NotNull
  public val type: Int,
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  public val name: String? = null,
  /**
   * Base64-encoded image data
   */
  @param:JsonProperty("icon")
  @get:JsonProperty("icon")
  public val icon: ByteArray? = null,
  @param:JsonProperty("owner_id")
  @get:JsonProperty("owner_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val ownerId: String? = null,
  /**
   * User nickname overrides (user ID to nickname mapping)
   */
  @param:JsonProperty("nicks")
  @get:JsonProperty("nicks")
  public val nicks: Map<String, String?>? = null,
)
