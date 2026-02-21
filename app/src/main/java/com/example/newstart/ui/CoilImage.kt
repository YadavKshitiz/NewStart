package com.example.newstart.ui

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage


@Preview
@Composable
fun CoilImage() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .height(150.dp)
                .width(150.dp),
            contentAlignment = Alignment.Center
        ) {
            AsyncImage(
                model = "https://images.hdqwalls.com/download/uzumaki-naruto-4k-1t-1920x1080.jpg",
                contentDescription = "Naruto Image",

                )
        }
    }
}

//    implementation("io.coil-kt:coil-compose:2.7.0")