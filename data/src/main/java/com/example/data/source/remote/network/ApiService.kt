package com.example.data.source.remote.network

import com.example.data.COLLECTION_LIST
import com.example.data.COLLECTION_PHOTOS
import com.example.data.ID
import com.example.data.source.remote.response.CollectionResponse
import com.example.data.source.remote.response.PhotoResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET(COLLECTION_LIST)
    fun getListCollection(): Single<CollectionResponse>

    @GET(COLLECTION_PHOTOS)
    fun getCollectionPhotos(@Path(ID) id: String): Single<PhotoResponse>
}
