package com.punam.mon.src.data.remote

import com.punam.mon.src.domain.model.request.LoginRequest
import com.punam.mon.src.domain.model.response.BaseResponse
import com.punam.mon.src.domain.model.response.LoginResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthenticationApi {
    @POST("auth/login")
    suspend fun login(@Body request: LoginRequest): BaseResponse<LoginResponse>

}