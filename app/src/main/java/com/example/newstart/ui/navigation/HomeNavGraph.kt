package com.example.newstart.ui.navigation

import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation

fun NavGraphBuilder.homeNavGraph(navController: NavController) {

    navigation(
        startDestination = Screen.Home.route,
        route = Home_Route
    ) {
        composable(route = Screen.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.Detail.route,
            arguments = listOf(
                navArgument(Detail_Argument_Key) {
                    type = NavType.IntType
                    defaultValue = 0
                },
//                navArgument(Detail_Argument_Key1) {
//                    type = NavType.StringType
//                }
            )

        ) {
            Log.d("Args", it.arguments?.getInt(Detail_Argument_Key).toString())
//            Log.d("Args", it.arguments?.getString(Detail_Argument_Key1).toString())
            DetailScreen(navController = navController)
        }
    }


}