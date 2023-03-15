package com.swayy.core_network.model.collections.nft

data class Result(
    val cached_images: CachedImages,
    val cached_videos: Any,
    val contract_address: String,
    val current_owners: List<CurrentOwner>,
    val id: String,
    val metadata: Metadata,
    val metadata_updated_at: String,
    val minted_at: String,
    val recent_price: Any,
    val token_description: String,
    val token_name: String,
    val token_type: String,
    val total_current_owners: Int,
    val total_transfers: Int,
    val uri: String
)