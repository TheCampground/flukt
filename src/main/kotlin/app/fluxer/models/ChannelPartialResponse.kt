package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public data class ChannelPartialResponse(
  /**
   * The unique identifier (snowflake) for this channel
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  public val name: String? = null,
  /**
   * The type of the channel
   */
  @param:JsonProperty(
    "type",
    required = true,
  )
  @get:JsonProperty("type")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val type: Int,
  /**
   * The recipients of the DM channel
   */
  @param:JsonProperty("recipients")
  @get:JsonProperty("recipients")
  @get:Size(max = 25)
  @get:Valid
  public val recipients: List<ChannelPartialRecipientResponse>? = null,
)
