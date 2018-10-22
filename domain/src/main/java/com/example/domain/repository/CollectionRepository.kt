package com.example.domain.repository

import com.example.domain.model.Collection
import io.reactivex.Single

interface CollectionRepository {
    fun getListCollection(): Single<List<Collection>>
}
