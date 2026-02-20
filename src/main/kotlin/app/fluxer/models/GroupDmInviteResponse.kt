package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import java.time.OffsetDateTime
import kotlin.Boolean
import kotlin.Int
import kotlin.String

public data class GroupDmInviteResponse(
  /**
   * The unique invite code
   */
  @param:JsonProperty("code")
  @get:JsonProperty("code")
  @get:NotNull
  public val code: String,
  /**
   * The type of invite (group DM)
   */
  @param:JsonProperty(
    "type",
    required = true,
  )
  @get:JsonProperty("type")
  @get:NotNull
  public val type: Int,
  @param:JsonProperty("channel")
  @get:JsonProperty("channel")
  @get:NotNull
  @get:Valid
  public val channel: ChannelPartialResponse,
  @param:JsonProperty("inviter")
  @get:JsonProperty("inviter")
  @get:Valid
  public val inviter: UserPartialResponse? = null,
  /**
   * The current member count of the group DM
   */
  @param:JsonProperty(
    "member_count",
    required = true,
  )
  @get:JsonProperty("member_count")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val memberCount: Int,
  @param:JsonProperty("expires_at")
  @get:JsonProperty("expires_at")
  public val expiresAt: OffsetDateTime? = null,
  /**
   * Whether the invite grants temporary membership
   */
  @param:JsonProperty(
    "temporary",
    required = true,
  )
  @get:JsonProperty("temporary")
  @get:NotNull
  public val temporary: Boolean,
)
