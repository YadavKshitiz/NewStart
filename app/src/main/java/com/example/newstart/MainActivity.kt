package com.example.newstart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.example.newstart.ui.appbar.MainScreen
import com.example.newstart.ui.theme.NewStartTheme
import com.example.newstart.ui.appbar.MainViewModel

class MainActivity : ComponentActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NewStartTheme {

            }
        }
    }
}

