package com.example.data.source.remote

import com.example.data.source.PhotoDataSource
import com.example.data.source.remote.network.ApiService
import com.example.data.source.remote.response.PhotoResponse
import io.reactivex.Single

class PhotoRemoteDataSource(val apiService: ApiService) : PhotoDataSource.Remote {
    override fun getListPhoto(id : String): Single<PhotoResponse> = apiService.getCollectionPhotos(id)
}
