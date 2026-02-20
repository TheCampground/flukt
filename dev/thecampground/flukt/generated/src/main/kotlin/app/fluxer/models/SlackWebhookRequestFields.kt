package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.Boolean
import kotlin.String

/**
 * Array of field objects
 */
public data class SlackWebhookRequestFields(
  /**
   * Title of the field
   */
  @param:JsonProperty("title")
  @get:JsonProperty("title")
  public val title: String? = null,
  /**
   * Value of the field
   */
  @param:JsonProperty("value")
  @get:JsonProperty("value")
  public val `value`: String? = null,
  /**
   * Whether the field should be displayed as a short column
   */
  @param:JsonProperty("short")
  @get:JsonProperty("short")
  public val short: Boolean? = null,
)
