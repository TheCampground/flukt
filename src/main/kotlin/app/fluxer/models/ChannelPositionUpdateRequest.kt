package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Boolean
import kotlin.Long
import kotlin.String

public data class ChannelPositionUpdateRequest(
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  /**
   * New position for the channel
   */
  @param:JsonProperty("position")
  @get:JsonProperty("position")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "9007199254740991",
    inclusive = true,
  )
  public val position: Long? = null,
  @param:JsonProperty("parent_id")
  @get:JsonProperty("parent_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val parentId: String? = null,
  /**
   * Whether to sync permissions with the new parent
   */
  @param:JsonProperty("lock_permissions")
  @get:JsonProperty("lock_permissions")
  public val lockPermissions: Boolean? = null,
)
