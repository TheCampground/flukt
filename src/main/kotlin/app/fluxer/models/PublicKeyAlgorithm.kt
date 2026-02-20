package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * Key algorithm
 */
public enum class PublicKeyAlgorithm(
  @JsonValue
  public val `value`: String,
) {
  X25519("x25519"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, PublicKeyAlgorithm> =
        entries.associateBy(PublicKeyAlgorithm::value)

    public fun fromValue(`value`: String): PublicKeyAlgorithm? = mapping[value]
  }
}
