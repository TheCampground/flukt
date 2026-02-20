package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * Category of the guild report
 */
public enum class GuildReportCategoryEnum(
  @JsonValue
  public val `value`: String,
) {
  HARASSMENT("harassment"),
  HATE_SPEECH("hate_speech"),
  EXTREMIST_COMMUNITY("extremist_community"),
  ILLEGAL_ACTIVITY("illegal_activity"),
  CHILD_SAFETY("child_safety"),
  RAID_COORDINATION("raid_coordination"),
  SPAM("spam"),
  MALWARE_DISTRIBUTION("malware_distribution"),
  OTHER("other"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, GuildReportCategoryEnum> =
        entries.associateBy(GuildReportCategoryEnum::value)

    public fun fromValue(`value`: String): GuildReportCategoryEnum? = mapping[value]
  }
}
