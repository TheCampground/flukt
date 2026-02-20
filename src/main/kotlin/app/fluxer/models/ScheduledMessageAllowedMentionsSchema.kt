package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

public data class ScheduledMessageAllowedMentionsSchema(
  /**
   * Types of mentions to parse from content
   */
  @param:JsonProperty("parse")
  @get:JsonProperty("parse")
  public val parse: List<ScheduledMessageAllowedMentionsSchemaParse>? = null,
  /**
   * Array of user IDs to mention
   */
  @param:JsonProperty("users")
  @get:JsonProperty("users")
  public val users: List<String>? = null,
  /**
   * Array of role IDs to mention
   */
  @param:JsonProperty("roles")
  @get:JsonProperty("roles")
  public val roles: List<String>? = null,
  /**
   * Whether to mention the author of the replied message
   */
  @param:JsonProperty("replied_user")
  @get:JsonProperty("replied_user")
  public val repliedUser: Boolean? = null,
)
