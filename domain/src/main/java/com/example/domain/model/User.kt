package com.example.domain.model

import com.example.domain.base.BaseModel

class User(
    val id: String? = null,
    val name: String? = null,
    val location: String? = null,
    val bio: String? = null
) : BaseModel()
