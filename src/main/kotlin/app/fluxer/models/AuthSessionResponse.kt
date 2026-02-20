package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import java.time.OffsetDateTime
import kotlin.Boolean
import kotlin.String

public data class AuthSessionResponse(
  /**
   * The base64url-encoded session id hash
   */
  @param:JsonProperty("id_hash")
  @get:JsonProperty("id_hash")
  @get:NotNull
  public val idHash: String,
  @param:JsonProperty("client_info")
  @get:JsonProperty("client_info")
  @get:Valid
  public val clientInfo: AuthSessionClientInfo? = null,
  @param:JsonProperty("approx_last_used_at")
  @get:JsonProperty("approx_last_used_at")
  public val approxLastUsedAt: OffsetDateTime? = null,
  /**
   * Whether this is the current session making the request
   */
  @param:JsonProperty(
    "current",
    required = true,
  )
  @get:JsonProperty("current")
  @get:NotNull
  public val current: Boolean,
)
