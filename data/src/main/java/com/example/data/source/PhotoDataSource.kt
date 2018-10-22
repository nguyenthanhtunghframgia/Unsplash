package com.example.data.source

import com.example.data.source.remote.response.PhotoResponse
import io.reactivex.Single

interface PhotoDataSource {
    interface Remote {
        fun getListPhoto(id : String): Single<PhotoResponse>
    }

    interface Local {
        //todo
    }
}
