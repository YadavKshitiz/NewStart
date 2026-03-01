package com.example.newstart.ui.navigation

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController

@Composable
fun HomeScreen(
    navController: NavController
) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            modifier = Modifier
                .clickable {
                    navController.navigate(Screen.Detail.route)
                },
            text = "HomeScreen",
            color = Color.Black,
            fontSize = MaterialTheme.typography.headlineMedium.fontSize,
            fontWeight = FontWeight.Bold
        )
    }
}


//@Preview(showBackground = true)
//@Composable
//fun HomeScreenPreview(){
//    HomeScreen(navController=rememberNavController())
//}