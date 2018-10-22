package com.example.domain.usecase.collection

import com.example.domain.model.Collection
import com.example.domain.repository.CollectionRepository
import com.example.domain.usecase.UseCase
import io.reactivex.Single

class CollectionUseCase(private val collectionRepository: CollectionRepository) :
    UseCase<CollectionUseCase.Param, Single<List<Collection>>>() {

    override fun createObservable(param: Param?): Single<List<Collection>> {
        param?.let { return collectionRepository.getListCollection() }
        return Single.error(Throwable(""))
    }

    override fun onCleared() {
    }

    class Param()
}
