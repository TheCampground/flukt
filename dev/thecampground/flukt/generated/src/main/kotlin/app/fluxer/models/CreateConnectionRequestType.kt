package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * The type of connection to create
 */
public enum class CreateConnectionRequestType(
  @JsonValue
  public val `value`: String,
) {
  BSKY("bsky"),
  DOMAIN("domain"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, CreateConnectionRequestType> =
        entries.associateBy(CreateConnectionRequestType::value)

    public fun fromValue(`value`: String): CreateConnectionRequestType? = mapping[value]
  }
}
