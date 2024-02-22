package com.punam.mon.src

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.punam.mon.src.presentation.login.LoginView
import com.punam.mon.src.presentation.onboard.OnboardView
import com.punam.mon.src.presentation.splash.SplashView
import com.punam.mon.util.Routers

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun NavigationGraph(
    navController: NavHostController,
    startDestination: String = Routers.Splash.name,
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(route = Routers.Splash.name) {
            SplashView()
        }
        composable(route = Routers.Onboard.name) {
            OnboardView(navController = navController)
        }
        composable(route = Routers.Login.name) {
            LoginView(navController = navController)
        }
    }
}