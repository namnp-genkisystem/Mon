package com.punam.mon.src.presentation.login

import com.punam.mon.util.UiText


data class LoginState(
    val emailInput: String = "",
    val passwordInput: String = "",
    val isHidePassword: Boolean = true,
    val emailError: UiText? = null,
    val passwordError: UiText? = null,
)