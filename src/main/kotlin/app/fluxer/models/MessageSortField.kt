package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * The field to sort search results by
 */
public enum class MessageSortField(
  @JsonValue
  public val `value`: String,
) {
  TIMESTAMP("timestamp"),
  RELEVANCE("relevance"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, MessageSortField> =
        entries.associateBy(MessageSortField::value)

    public fun fromValue(`value`: String): MessageSortField? = mapping[value]
  }
}
