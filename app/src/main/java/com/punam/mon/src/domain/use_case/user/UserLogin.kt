package com.punam.mon.src.domain.use_case.user

import com.punam.mon.src.domain.model.response.LoginResponse
import com.punam.mon.src.domain.repository.UserRepository
import com.punam.mon.util.ViewState


class UserLogin(
    private val repository: UserRepository,
) {

    suspend operator fun invoke(
        email: String,
        password: String,
    ): ViewState<LoginResponse> {
        val res = repository.login(email = email, password = password)
        return res.fold(
            { ViewState.Error(it) },
            { ViewState.Success(it) }
        )
    }
}
