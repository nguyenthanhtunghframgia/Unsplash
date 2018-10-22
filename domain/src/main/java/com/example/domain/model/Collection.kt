package com.example.domain.model

import com.example.domain.base.BaseModel

class Collection(
    val id: String? = null,
    val title: String? = null,
    val totalPhoto: Int? = null,
    val coverPhoto: CoverPhoto? = null
) : BaseModel()
