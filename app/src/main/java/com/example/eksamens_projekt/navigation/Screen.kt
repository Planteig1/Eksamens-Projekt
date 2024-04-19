package com.example.eksamens_projekt.navigation

sealed class Screen (val route: String) {
    object Home: Screen(route = "home_screen")

    object Start: Screen(route = "start_screen")

    // Authentication Aspect
    object Login: Screen(route = "login_screen")

    object Register: Screen(route = "register_screen")

}