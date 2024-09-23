package com.teameeats.eeats.utils.navigation

sealed class EeatsRoutes(val route: String) {
    data object Splash : EeatsRoutes("splash")
    data object Login : EeatsRoutes("login")
    data object Home : EeatsRoutes("home")
    data object Suggestion : EeatsRoutes("suggestion")
    data object Vote : EeatsRoutes("vote")
    data object Profile : EeatsRoutes("profile")
    data object Alarm : EeatsRoutes("alarm")
}
