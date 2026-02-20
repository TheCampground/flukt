package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class PushSubscribeRequestKeys(
  /**
   * The P-256 ECDH public key
   */
  @param:JsonProperty("p256dh")
  @get:JsonProperty("p256dh")
  @get:NotNull
  public val p256dh: String,
  /**
   * The authentication secret
   */
  @param:JsonProperty("auth")
  @get:JsonProperty("auth")
  @get:NotNull
  public val auth: String,
)
