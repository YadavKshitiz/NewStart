package com.example.newstart.ui.navigation

import android.util.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation

@Composable
fun SetNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Home_Route,
        route = Root_Route
    ) {
        homeNavGraph(navController=navController)

        authNavGraph(navController=navController)

    }
}