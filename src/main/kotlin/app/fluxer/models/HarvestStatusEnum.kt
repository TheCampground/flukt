package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * Current status of the harvest request
 */
public enum class HarvestStatusEnum(
  @JsonValue
  public val `value`: String,
) {
  PENDING("pending"),
  PROCESSING("processing"),
  COMPLETED("completed"),
  FAILED("failed"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, HarvestStatusEnum> =
        entries.associateBy(HarvestStatusEnum::value)

    public fun fromValue(`value`: String): HarvestStatusEnum? = mapping[value]
  }
}
