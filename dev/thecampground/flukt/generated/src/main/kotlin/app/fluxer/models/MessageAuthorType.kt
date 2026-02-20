package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * The type of author who sent the message
 */
public enum class MessageAuthorType(
  @JsonValue
  public val `value`: String,
) {
  USER("user"),
  BOT("bot"),
  WEBHOOK("webhook"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, MessageAuthorType> =
        entries.associateBy(MessageAuthorType::value)

    public fun fromValue(`value`: String): MessageAuthorType? = mapping[value]
  }
}
