package com.example.data.source

import com.example.data.source.remote.response.CollectionResponse
import io.reactivex.Single

interface CollectionDataSource {
    interface Remote {
        fun getListCollection(): Single<CollectionResponse>
    }

    interface Local {
        //todo
    }
}
