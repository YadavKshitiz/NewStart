package com.example.newstart.ui.navigation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController


@Composable
fun Signup(
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
                    navController.navigate(Screen.Login.route) {
                        popUpTo(Screen.Login.route) {
                            inclusive = true
                        }
                    }
                },
            text = "Signup",
            color = Color.Green,
            fontSize = MaterialTheme.typography.headlineMedium.fontSize,
            fontWeight = FontWeight.Bold
        )
    }
}


//@Preview(showBackground = true)
//@Composable
//fun DetailScreenPreview(){
//    DetailScreen()
//}