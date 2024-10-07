package com.teameeats.eeats.utils.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.teameeats.eeats.presentation.home.view.HomeScreen
import com.teameeats.eeats.presentation.login.view.LoginScreen
import com.teameeats.eeats.presentation.splash.view.SplashScreen

@Composable
fun EeatsNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = EeatsRoutes.Splash.route,
    ) {
        composable(EeatsRoutes.Splash.route) {
            SplashScreen(navController = navController)
        }
        composable(EeatsRoutes.Login.route) {
            LoginScreen(navController = navController)
        }
        composable(EeatsRoutes.Home.route) {
            HomeScreen(navController = navController)
        }
    }
}

