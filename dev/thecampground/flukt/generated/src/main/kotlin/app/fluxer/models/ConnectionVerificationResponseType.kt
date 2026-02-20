package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * The type of connection being verified
 */
public enum class ConnectionVerificationResponseType(
  @JsonValue
  public val `value`: String,
) {
  BSKY("bsky"),
  DOMAIN("domain"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, ConnectionVerificationResponseType> =
        entries.associateBy(ConnectionVerificationResponseType::value)

    public fun fromValue(`value`: String): ConnectionVerificationResponseType? = mapping[value]
  }
}
