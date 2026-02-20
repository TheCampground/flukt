package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.Int
import kotlin.collections.List

public data class ListGuildMembersResponse(
  @param:JsonProperty("members")
  @get:JsonProperty("members")
  @get:NotNull
  @get:Size(max = 200)
  @get:Valid
  public val members: List<GuildMemberResponse>,
  @param:JsonProperty(
    "total",
    required = true,
  )
  @get:JsonProperty("total")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val total: Int,
  @param:JsonProperty(
    "limit",
    required = true,
  )
  @get:JsonProperty("limit")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val limit: Int,
  @param:JsonProperty(
    "offset",
    required = true,
  )
  @get:JsonProperty("offset")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val offset: Int,
)
