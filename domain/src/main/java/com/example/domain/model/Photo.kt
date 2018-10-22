package com.example.domain.model

import com.example.domain.base.BaseModel

class Photo(
    val id: String? = null,
    val description: String? = null,
    val user: User? = null,
    val urls: Urls? = null,
    val width: Int? = null,
    val height: Int? = null
) : BaseModel()
