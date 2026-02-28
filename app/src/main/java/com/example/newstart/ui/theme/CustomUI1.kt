package com.example.newstart.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*

@Preview
@Composable
fun CustomUI1Preview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        var value by remember { mutableIntStateOf(0) }

        CircularProgressIndicator(
            progress = { value / 1000f },
            modifier = Modifier
                .size(200.dp),
            color = ProgressIndicatorDefaults.circularColor,
            strokeWidth = ProgressIndicatorDefaults.CircularStrokeWidth,
            trackColor = ProgressIndicatorDefaults.circularIndeterminateTrackColor,
            strokeCap = ProgressIndicatorDefaults.CircularDeterminateStrokeCap,
        )

        Spacer(modifier = Modifier.height(10.dp))
        TextField(
            value = value.toString(),
            onValueChange = {
                value = if (it.isNotEmpty()) {
                    it.toInt()
                } else {
                    0
                }
            }
        )

    }
}


