package com.example.data.model

import com.example.data.base.EntityMapper
import com.example.data.base.ModelEntity
import com.example.domain.model.Photo
import com.example.domain.model.Urls
import com.example.domain.model.User
import com.google.gson.annotations.SerializedName

class PhotoEntity(
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("description")
    val description: String? = null,
    @SerializedName("user")
    val user: User? = null,
    @SerializedName("urls")
    val urls: Urls? = null,
    @SerializedName("width")
    val width: Int? = null,
    @SerializedName("height")
    val height: Int? = null
) : ModelEntity()

class PhotoEntityMapper : EntityMapper<Photo, PhotoEntity> {

    override fun mapToDomain(entity: PhotoEntity) = Photo(
        id = entity.id,
        description = entity.description,
        user = entity.user,
        urls = entity.urls,
        width = entity.width,
        height = entity.height
    )

    override fun mapToEntity(model: Photo) = PhotoEntity(
        id = model.id,
        description = model.description,
        user = model.user,
        urls = model.urls,
        width = model.width,
        height = model.height
    )
}
