package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import kotlin.Int
import kotlin.String

public data class NodeStatsResponse(
  @param:JsonProperty("status")
  @get:JsonProperty("status")
  @get:NotNull
  public val status: String,
  @param:JsonProperty(
    "sessions",
    required = true,
  )
  @get:JsonProperty("sessions")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val sessions: Int,
  @param:JsonProperty(
    "guilds",
    required = true,
  )
  @get:JsonProperty("guilds")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val guilds: Int,
  @param:JsonProperty(
    "presences",
    required = true,
  )
  @get:JsonProperty("presences")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val presences: Int,
  @param:JsonProperty(
    "calls",
    required = true,
  )
  @get:JsonProperty("calls")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val calls: Int,
  @param:JsonProperty("memory")
  @get:JsonProperty("memory")
  @get:NotNull
  @get:Valid
  public val memory: NodeStatsResponseMemory,
  @param:JsonProperty(
    "process_count",
    required = true,
  )
  @get:JsonProperty("process_count")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val processCount: Int,
  @param:JsonProperty(
    "process_limit",
    required = true,
  )
  @get:JsonProperty("process_limit")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val processLimit: Int,
  @param:JsonProperty(
    "uptime_seconds",
    required = true,
  )
  @get:JsonProperty("uptime_seconds")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val uptimeSeconds: Int,
)
