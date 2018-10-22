package com.example.data.source.repository

import com.example.data.model.CollectionEntityMapper
import com.example.data.source.CollectionDataSource
import com.example.domain.model.Collection
import com.example.domain.repository.CollectionRepository
import io.reactivex.Single

class CollectionRepositoryImpl(
    val remote: CollectionDataSource.Remote,
    val local: CollectionDataSource.Local,
    private val collectionEntityMapper: CollectionEntityMapper
) : CollectionRepository {

    override fun getListCollection(): Single<List<Collection>> {
        return remote.getListCollection().map {
            it.collections.map { collectionEntityMapper.mapToDomain(it) }
        }
    }
}
