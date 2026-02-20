package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import java.math.BigDecimal
import kotlin.collections.List

public data class SearchUsersResponse(
  @param:JsonProperty("users")
  @get:JsonProperty("users")
  @get:NotNull
  @get:Valid
  public val users: List<UserAdminResponseSchema>,
  @param:JsonProperty("total")
  @get:JsonProperty("total")
  @get:NotNull
  public val total: BigDecimal,
)
