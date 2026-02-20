package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * Category of the message report
 */
public enum class MessageReportCategoryEnum(
  @JsonValue
  public val `value`: String,
) {
  HARASSMENT("harassment"),
  HATE_SPEECH("hate_speech"),
  VIOLENT_CONTENT("violent_content"),
  SPAM("spam"),
  NSFW_VIOLATION("nsfw_violation"),
  ILLEGAL_ACTIVITY("illegal_activity"),
  DOXXING("doxxing"),
  SELF_HARM("self_harm"),
  CHILD_SAFETY("child_safety"),
  MALICIOUS_LINKS("malicious_links"),
  IMPERSONATION("impersonation"),
  OTHER("other"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, MessageReportCategoryEnum> =
        entries.associateBy(MessageReportCategoryEnum::value)

    public fun fromValue(`value`: String): MessageReportCategoryEnum? = mapping[value]
  }
}
