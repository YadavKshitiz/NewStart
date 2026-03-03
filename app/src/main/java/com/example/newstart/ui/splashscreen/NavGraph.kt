package com.example.newstart.ui.splashscreen

import androidx.compose.runtime.*
import androidx.navigation.*
import androidx.navigation.compose.*

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController=navController,
        startDestination = Screen.Splash.route
    ){
        composable(route=Screen.Splash.route){
            AnimatedSplashScreen(navController)
        }
        composable(route = Screen.Home.route){

        }

    }
}