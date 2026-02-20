package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.collections.List

public data class GlobalSearchMessagesRequest(
  /**
   * Number of results per page (1-25)
   */
  @param:JsonProperty("hits_per_page")
  @get:JsonProperty("hits_per_page")
  @get:DecimalMin(
    value = "1",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "25",
    inclusive = true,
  )
  public val hitsPerPage: Int? = null,
  /**
   * Page number for pagination
   */
  @param:JsonProperty("page")
  @get:JsonProperty("page")
  @get:DecimalMin(
    value = "1",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "9007199254740991",
    inclusive = true,
  )
  public val page: Long? = null,
  @param:JsonProperty("max_id")
  @get:JsonProperty("max_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val maxId: String? = null,
  @param:JsonProperty("min_id")
  @get:JsonProperty("min_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val minId: String? = null,
  /**
   * Text content to search for
   */
  @param:JsonProperty("content")
  @get:JsonProperty("content")
  public val content: String? = null,
  /**
   * Multiple content queries to search for
   */
  @param:JsonProperty("contents")
  @get:JsonProperty("contents")
  @get:Size(max = 100)
  public val contents: List<String>? = null,
  /**
   * Exact phrases that must appear contiguously in message content
   */
  @param:JsonProperty("exact_phrases")
  @get:JsonProperty("exact_phrases")
  @get:Size(max = 10)
  public val exactPhrases: List<String>? = null,
  /**
   * Channel IDs to search in
   */
  @param:JsonProperty("channel_id")
  @get:JsonProperty("channel_id")
  @get:Size(max = 500)
  public val channelId: List<String>? = null,
  /**
   * Channel IDs to exclude from search
   */
  @param:JsonProperty("exclude_channel_id")
  @get:JsonProperty("exclude_channel_id")
  @get:Size(max = 500)
  public val excludeChannelId: List<String>? = null,
  /**
   * Author types to filter by
   */
  @param:JsonProperty("author_type")
  @get:JsonProperty("author_type")
  public val authorType: List<MessageAuthorType>? = null,
  /**
   * Author types to exclude
   */
  @param:JsonProperty("exclude_author_type")
  @get:JsonProperty("exclude_author_type")
  public val excludeAuthorType: List<MessageAuthorType>? = null,
  /**
   * Author user IDs to filter by
   */
  @param:JsonProperty("author_id")
  @get:JsonProperty("author_id")
  public val authorId: List<String>? = null,
  /**
   * Author user IDs to exclude
   */
  @param:JsonProperty("exclude_author_id")
  @get:JsonProperty("exclude_author_id")
  public val excludeAuthorId: List<String>? = null,
  /**
   * User IDs that must be mentioned
   */
  @param:JsonProperty("mentions")
  @get:JsonProperty("mentions")
  public val mentions: List<String>? = null,
  /**
   * User IDs that must not be mentioned
   */
  @param:JsonProperty("exclude_mentions")
  @get:JsonProperty("exclude_mentions")
  public val excludeMentions: List<String>? = null,
  /**
   * Filter by whether message mentions everyone
   */
  @param:JsonProperty("mention_everyone")
  @get:JsonProperty("mention_everyone")
  public val mentionEveryone: Boolean? = null,
  /**
   * Filter by pinned status
   */
  @param:JsonProperty("pinned")
  @get:JsonProperty("pinned")
  public val pinned: Boolean? = null,
  /**
   * Content types the message must have
   */
  @param:JsonProperty("has")
  @get:JsonProperty("has")
  public val has: List<MessageContentType>? = null,
  /**
   * Content types the message must not have
   */
  @param:JsonProperty("exclude_has")
  @get:JsonProperty("exclude_has")
  public val excludeHas: List<MessageContentType>? = null,
  /**
   * Embed types to filter by
   */
  @param:JsonProperty("embed_type")
  @get:JsonProperty("embed_type")
  public val embedType: List<MessageEmbedType>? = null,
  /**
   * Embed types to exclude
   */
  @param:JsonProperty("exclude_embed_type")
  @get:JsonProperty("exclude_embed_type")
  public val excludeEmbedType: List<MessageEmbedType>? = null,
  /**
   * Embed providers to filter by
   */
  @param:JsonProperty("embed_provider")
  @get:JsonProperty("embed_provider")
  public val embedProvider: List<String>? = null,
  /**
   * Embed providers to exclude
   */
  @param:JsonProperty("exclude_embed_provider")
  @get:JsonProperty("exclude_embed_provider")
  public val excludeEmbedProvider: List<String>? = null,
  /**
   * Link hostnames to filter by
   */
  @param:JsonProperty("link_hostname")
  @get:JsonProperty("link_hostname")
  public val linkHostname: List<String>? = null,
  /**
   * Link hostnames to exclude
   */
  @param:JsonProperty("exclude_link_hostname")
  @get:JsonProperty("exclude_link_hostname")
  public val excludeLinkHostname: List<String>? = null,
  /**
   * Attachment filenames to filter by
   */
  @param:JsonProperty("attachment_filename")
  @get:JsonProperty("attachment_filename")
  public val attachmentFilename: List<String>? = null,
  /**
   * Attachment filenames to exclude
   */
  @param:JsonProperty("exclude_attachment_filename")
  @get:JsonProperty("exclude_attachment_filename")
  public val excludeAttachmentFilename: List<String>? = null,
  /**
   * File extensions to filter by
   */
  @param:JsonProperty("attachment_extension")
  @get:JsonProperty("attachment_extension")
  public val attachmentExtension: List<String>? = null,
  /**
   * File extensions to exclude
   */
  @param:JsonProperty("exclude_attachment_extension")
  @get:JsonProperty("exclude_attachment_extension")
  public val excludeAttachmentExtension: List<String>? = null,
  /**
   * The field to sort search results by
   */
  @param:JsonProperty("sort_by")
  @get:JsonProperty("sort_by")
  public val sortBy: MessageSortField? = null,
  /**
   * The order to sort search results
   */
  @param:JsonProperty("sort_order")
  @get:JsonProperty("sort_order")
  public val sortOrder: MessageSortOrder? = null,
  /**
   * Whether to include NSFW channel results
   */
  @param:JsonProperty("include_nsfw")
  @get:JsonProperty("include_nsfw")
  public val includeNsfw: Boolean? = null,
  /**
   * Search scope for message searches
   */
  @param:JsonProperty("scope")
  @get:JsonProperty("scope")
  public val scope: MessageSearchScope? = null,
  @param:JsonProperty("context_channel_id")
  @get:JsonProperty("context_channel_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val contextChannelId: String? = null,
  @param:JsonProperty("context_guild_id")
  @get:JsonProperty("context_guild_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val contextGuildId: String? = null,
  /**
   * Specific channel IDs to search in
   */
  @param:JsonProperty("channel_ids")
  @get:JsonProperty("channel_ids")
  @get:Size(max = 500)
  public val channelIds: List<String>? = null,
)
