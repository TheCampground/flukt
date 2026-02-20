package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class UserContactChangeLogEntrySchema(
  @param:JsonProperty("event_id")
  @get:JsonProperty("event_id")
  @get:NotNull
  public val eventId: String,
  @param:JsonProperty("field")
  @get:JsonProperty("field")
  @get:NotNull
  public val `field`: String,
  @param:JsonProperty("old_value")
  @get:JsonProperty("old_value")
  public val oldValue: String?,
  @param:JsonProperty("new_value")
  @get:JsonProperty("new_value")
  public val newValue: String?,
  @param:JsonProperty("reason")
  @get:JsonProperty("reason")
  public val reason: String?,
  @param:JsonProperty("actor_user_id")
  @get:JsonProperty("actor_user_id")
  public val actorUserId: String?,
  @param:JsonProperty("event_at")
  @get:JsonProperty("event_at")
  @get:NotNull
  public val eventAt: String,
)
