package com.example.domain.repository

import com.example.domain.model.Photo
import io.reactivex.Single

interface PhotoRepository {
    fun getListPhoto(id: String): Single<List<Photo>>
}
