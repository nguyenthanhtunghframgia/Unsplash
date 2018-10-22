package com.example.data.source.repository

import com.example.data.model.PhotoEntityMapper
import com.example.data.source.PhotoDataSource
import com.example.domain.model.Photo
import com.example.domain.repository.PhotoRepository
import io.reactivex.Single

class PhotoRepositoryImpl(
    val remote: PhotoDataSource.Remote,
    val local: PhotoDataSource.Local,
    private val photoEntityMapper: PhotoEntityMapper
) : PhotoRepository {
    override fun getListPhoto(id: String): Single<List<Photo>> {
        return remote.getListPhoto(id).map {
            it.photos.map { photoEntityMapper.mapToDomain(it) }
        }
    }
}
