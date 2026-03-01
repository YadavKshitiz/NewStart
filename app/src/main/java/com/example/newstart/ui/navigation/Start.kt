package com.example.newstart.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun StartNavigation() {
    lateinit var navController: NavHostController
    navController = rememberNavController()
    SetNavGraph(navController = navController)

}