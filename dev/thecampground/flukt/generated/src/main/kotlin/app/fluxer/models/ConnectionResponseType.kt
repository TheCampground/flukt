package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * The type of connection
 */
public enum class ConnectionResponseType(
  @JsonValue
  public val `value`: String,
) {
  BSKY("bsky"),
  DOMAIN("domain"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, ConnectionResponseType> =
        entries.associateBy(ConnectionResponseType::value)

    public fun fromValue(`value`: String): ConnectionResponseType? = mapping[value]
  }
}
