package com.example.data.model

import com.example.data.base.EntityMapper
import com.example.data.base.ModelEntity
import com.example.domain.model.CoverPhoto
import com.example.domain.model.Collection
import com.google.gson.annotations.SerializedName

class CollectionEntity(
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("total_photos")
    val totalPhoto: Int? = null,
    @SerializedName("cover_photo")
    val coverPhoto: CoverPhoto? = null
) : ModelEntity()

class CollectionEntityMapper : EntityMapper<Collection, CollectionEntity> {

    override fun mapToDomain(entity: CollectionEntity) = Collection(
        id = entity.id,
        title = entity.title,
        totalPhoto = entity.totalPhoto,
        coverPhoto = entity.coverPhoto
    )

    override fun mapToEntity(model: Collection) = CollectionEntity(
        id = model.id,
        title = model.title,
        totalPhoto = model.totalPhoto,
        coverPhoto = model.coverPhoto
    )
}
