package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Int
import kotlin.String

public data class ChannelOverwriteRequest(
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  /**
   * The type of overwrite (0 = role, 1 = member)
   */
  @param:JsonProperty(
    "type",
    required = true,
  )
  @get:JsonProperty("type")
  @get:NotNull
  public val type: Int,
  @param:JsonProperty("allow")
  @get:JsonProperty("allow")
  @get:Pattern(regexp = "^[0-9]+${'$'}")
  public val allow: String? = null,
  @param:JsonProperty("deny")
  @get:JsonProperty("deny")
  @get:Pattern(regexp = "^[0-9]+${'$'}")
  public val deny: String? = null,
)
