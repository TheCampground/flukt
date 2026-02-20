package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import kotlin.String
import kotlin.collections.List

public data class SlackWebhookRequest(
  /**
   * Main text content of the message
   */
  @param:JsonProperty("text")
  @get:JsonProperty("text")
  public val text: String? = null,
  /**
   * Override the default username of the webhook
   */
  @param:JsonProperty("username")
  @get:JsonProperty("username")
  public val username: String? = null,
  /**
   * Override the default icon of the webhook
   */
  @param:JsonProperty("icon_url")
  @get:JsonProperty("icon_url")
  public val iconUrl: String? = null,
  /**
   * Array of attachment objects
   */
  @param:JsonProperty("attachments")
  @get:JsonProperty("attachments")
  @get:Valid
  public val attachments: List<SlackWebhookRequestAttachments>? = null,
)
