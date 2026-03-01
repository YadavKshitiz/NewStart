package com.example.newstart.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation

fun NavGraphBuilder.authNavGraph(navController: NavHostController) {
    navigation(
        startDestination = Screen.Login.route,
        route = Authentication_Route
    ){
        composable(route = Screen.Login.route) {
            Login(navController = navController)
        }
        composable(route = Screen.SignUp.route) {
            Signup(navController = navController)
        }
    }
}