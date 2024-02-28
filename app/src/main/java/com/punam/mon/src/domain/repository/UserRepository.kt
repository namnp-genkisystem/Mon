package com.punam.mon.src.domain.repository

import arrow.core.Either
import com.punam.mon.src.domain.model.response.ErrorResponse
import com.punam.mon.src.domain.model.response.LoginResponse

interface UserRepository {
    suspend fun login(email: String, password: String): Either<ErrorResponse, LoginResponse>

}