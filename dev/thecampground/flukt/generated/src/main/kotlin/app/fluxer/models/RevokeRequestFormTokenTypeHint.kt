package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * A hint about the type of token being revoked
 */
public enum class RevokeRequestFormTokenTypeHint(
  @JsonValue
  public val `value`: String,
) {
  ACCESS_TOKEN("access_token"),
  REFRESH_TOKEN("refresh_token"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, RevokeRequestFormTokenTypeHint> =
        entries.associateBy(RevokeRequestFormTokenTypeHint::value)

    public fun fromValue(`value`: String): RevokeRequestFormTokenTypeHint? = mapping[value]
  }
}
