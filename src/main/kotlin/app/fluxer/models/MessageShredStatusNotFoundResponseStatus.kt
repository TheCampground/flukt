package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

public enum class MessageShredStatusNotFoundResponseStatus(
  @JsonValue
  public val `value`: String,
) {
  NOT_FOUND("not_found"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, MessageShredStatusNotFoundResponseStatus> =
        entries.associateBy(MessageShredStatusNotFoundResponseStatus::value)

    public fun fromValue(`value`: String): MessageShredStatusNotFoundResponseStatus? =
        mapping[value]
  }
}
