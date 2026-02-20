package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * The type of content contained in a message
 */
public enum class MessageContentType(
  @JsonValue
  public val `value`: String,
) {
  IMAGE("image"),
  SOUND("sound"),
  VIDEO("video"),
  FILE("file"),
  STICKER("sticker"),
  EMBED("embed"),
  LINK("link"),
  POLL("poll"),
  SNAPSHOT("snapshot"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, MessageContentType> =
        entries.associateBy(MessageContentType::value)

    public fun fromValue(`value`: String): MessageContentType? = mapping[value]
  }
}
