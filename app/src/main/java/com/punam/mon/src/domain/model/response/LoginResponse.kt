package com.punam.mon.src.domain.model.response

data class LoginResponse(
    val token: String?,
    val user: UserResponse?,
)