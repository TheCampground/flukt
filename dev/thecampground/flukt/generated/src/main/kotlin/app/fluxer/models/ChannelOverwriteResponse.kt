package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Int
import kotlin.String

public data class ChannelOverwriteResponse(
  /**
   * The unique identifier for the role or user this overwrite applies to
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  /**
   * The type of entity the overwrite applies to
   */
  @param:JsonProperty(
    "type",
    required = true,
  )
  @get:JsonProperty("type")
  @get:NotNull
  public val type: Int,
  /**
   * The bitwise value of allowed permissions
   */
  @param:JsonProperty("allow")
  @get:JsonProperty("allow")
  @get:NotNull
  @get:Pattern(regexp = "^[0-9]+${'$'}")
  public val allow: String,
  /**
   * The bitwise value of denied permissions
   */
  @param:JsonProperty("deny")
  @get:JsonProperty("deny")
  @get:NotNull
  @get:Pattern(regexp = "^[0-9]+${'$'}")
  public val deny: String,
)
