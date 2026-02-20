package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * Selected icon for the guild folder
 */
public enum class GuildFoldersIcon(
  @JsonValue
  public val `value`: String,
) {
  FOLDER("folder"),
  STAR("star"),
  HEART("heart"),
  BOOKMARK("bookmark"),
  GAME_CONTROLLER("game_controller"),
  SHIELD("shield"),
  MUSIC_NOTE("music_note"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, GuildFoldersIcon> =
        entries.associateBy(GuildFoldersIcon::value)

    public fun fromValue(`value`: String): GuildFoldersIcon? = mapping[value]
  }
}
