package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import kotlin.Boolean
import kotlin.Int
import kotlin.String

public data class ConnectionResponse(
  /**
   * The unique identifier for this connection
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  public val id: String,
  /**
   * The type of connection
   */
  @param:JsonProperty("type")
  @get:JsonProperty("type")
  @get:NotNull
  public val type: ConnectionResponseType,
  /**
   * The display name of the connection (handle or domain)
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
  /**
   * Whether the connection has been verified
   */
  @param:JsonProperty(
    "verified",
    required = true,
  )
  @get:JsonProperty("verified")
  @get:NotNull
  public val verified: Boolean,
  /**
   * Bitfield controlling who can see this connection
   */
  @param:JsonProperty(
    "visibility_flags",
    required = true,
  )
  @get:JsonProperty("visibility_flags")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val visibilityFlags: Int,
  /**
   * The display order of this connection
   */
  @param:JsonProperty(
    "sort_order",
    required = true,
  )
  @get:JsonProperty("sort_order")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val sortOrder: Int,
)
