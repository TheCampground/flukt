package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import kotlin.Boolean
import kotlin.Int

public data class PackInviteCreateRequest(
  @param:JsonProperty("max_uses")
  @get:JsonProperty("max_uses")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "100",
    inclusive = true,
  )
  public val maxUses: Int? = null,
  @param:JsonProperty("max_age")
  @get:JsonProperty("max_age")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "604800",
    inclusive = true,
  )
  public val maxAge: Int? = null,
  @param:JsonProperty("unique")
  @get:JsonProperty("unique")
  public val unique: Boolean? = null,
)
