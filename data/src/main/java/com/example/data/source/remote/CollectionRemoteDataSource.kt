package com.example.data.source.remote

import com.example.data.source.CollectionDataSource
import com.example.data.source.remote.network.ApiService
import com.example.data.source.remote.response.CollectionResponse
import io.reactivex.Single

class CollectionRemoteDataSource(val apiService: ApiService) : CollectionDataSource.Remote {
    override fun getListCollection(): Single<CollectionResponse> = apiService.getListCollection()
}
