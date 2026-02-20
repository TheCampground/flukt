package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.Any
import kotlin.String

public data class AuditLogChangeSchema(
  /**
   * The field that changed
   */
  @param:JsonProperty("key")
  @get:JsonProperty("key")
  @get:NotNull
  public val key: String,
  /**
   * Value before the change
   */
  @param:JsonProperty("old_value")
  @get:JsonProperty("old_value")
  public val oldValue: Any? = null,
  /**
   * Value after the change
   */
  @param:JsonProperty("new_value")
  @get:JsonProperty("new_value")
  public val newValue: Any? = null,
)
