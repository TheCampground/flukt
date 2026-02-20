package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class SnowflakeReservationEntry(
  /**
   * Email address the snowflake is reserved for
   */
  @param:JsonProperty("email")
  @get:JsonProperty("email")
  @get:NotNull
  public val email: String,
  /**
   * Reserved snowflake ID
   */
  @param:JsonProperty("snowflake")
  @get:JsonProperty("snowflake")
  @get:NotNull
  public val snowflake: String,
  @param:JsonProperty("updated_at")
  @get:JsonProperty("updated_at")
  public val updatedAt: String?,
)
