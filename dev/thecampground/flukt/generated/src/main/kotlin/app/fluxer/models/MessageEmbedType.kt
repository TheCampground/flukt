package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * The type of embed content
 */
public enum class MessageEmbedType(
  @JsonValue
  public val `value`: String,
) {
  IMAGE("image"),
  VIDEO("video"),
  SOUND("sound"),
  ARTICLE("article"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, MessageEmbedType> =
        entries.associateBy(MessageEmbedType::value)

    public fun fromValue(`value`: String): MessageEmbedType? = mapping[value]
  }
}
