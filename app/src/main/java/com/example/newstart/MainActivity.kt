package com.example.newstart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.newstart.ui.navigation.StartNavigation
import com.example.newstart.ui.theme.NewStartTheme


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NewStartTheme {
                StartNavigation()

            }
        }
    }
}

