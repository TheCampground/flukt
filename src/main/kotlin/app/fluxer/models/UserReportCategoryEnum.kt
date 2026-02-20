package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * Category of the user report
 */
public enum class UserReportCategoryEnum(
  @JsonValue
  public val `value`: String,
) {
  HARASSMENT("harassment"),
  HATE_SPEECH("hate_speech"),
  SPAM_ACCOUNT("spam_account"),
  IMPERSONATION("impersonation"),
  UNDERAGE_USER("underage_user"),
  INAPPROPRIATE_PROFILE("inappropriate_profile"),
  OTHER("other"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, UserReportCategoryEnum> =
        entries.associateBy(UserReportCategoryEnum::value)

    public fun fromValue(`value`: String): UserReportCategoryEnum? = mapping[value]
  }
}
