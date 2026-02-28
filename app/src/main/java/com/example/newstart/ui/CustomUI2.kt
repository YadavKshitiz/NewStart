package com.example.newstart.ui

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.ui.geometry.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.*
import androidx.compose.ui.unit.*

@Composable
fun CustomUI2(
    canvasSize: Dp = 300.dp,
    indicatorValue: Int = 0,
    maxIndicatorValue: Int = 100,
//    backGroundIndicatorColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.38f),
    backGroundIndicatorColor: Color = Color.Gray, // Temporary color
    foreGroundIndicatorColor: Color = Color.Blue, // Temporary color
    backgroundIndicatorStrokeWidth: Float = 100f,

    bigTextFontSize: TextUnit = MaterialTheme.typography.headlineMedium.fontSize,
    bigTextSuffix: String = "GB",
    bigTextColor: Color = MaterialTheme.colorScheme.onSurface,
    smallText: String = "Remaining",
    smallTextFontSize: TextUnit = MaterialTheme.typography.headlineSmall.fontSize,
    smallTextColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.3f)
) {
    var allowedIndicatorValue by remember {
        mutableIntStateOf(maxIndicatorValue)
    }
    allowedIndicatorValue = if (indicatorValue <= maxIndicatorValue) {
        indicatorValue
    } else {
        maxIndicatorValue
    }

    var animatedIndicatorValue by remember {
        mutableFloatStateOf(0f)
    }
    LaunchedEffect(key1 = allowedIndicatorValue) {
        animatedIndicatorValue = allowedIndicatorValue.toFloat()
    }
    val percentage = (animatedIndicatorValue / maxIndicatorValue) * 100
    val sweepAngle by animateFloatAsState(
        targetValue = (2.4 * percentage).toFloat(),
        animationSpec = ProgressIndicatorDefaults.ProgressAnimationSpec
    )

    val receivedValue by animateFloatAsState(
        targetValue = animatedIndicatorValue,
        animationSpec = ProgressIndicatorDefaults.ProgressAnimationSpec
    )
    Column(
        modifier = Modifier
            .size(canvasSize)
            .drawBehind {
                val componentSize = size / 1.25f
                backgroundIndicator(
                    indicatorColor = backGroundIndicatorColor,
                    componentSize = componentSize,
                    indicatorStrokeWidth = backgroundIndicatorStrokeWidth
                )
                foregroundIndicator(
                    sweepAngle = sweepAngle,
                    indicatorColor = foreGroundIndicatorColor,
                    componentSize = componentSize,
                    indicatorStrokeWidth = backgroundIndicatorStrokeWidth
                )
            },
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        EmbeddedElements(
            bigText = receivedValue.toInt(),
            bigTextFontSize = bigTextFontSize,
            bigTextColor = bigTextColor,
            bigTextSuffix = bigTextSuffix,
            smallText = smallText,
            smallTextColor = smallTextColor,
            smallTextFontSize = smallTextFontSize
        )
    }
}


fun DrawScope.backgroundIndicator(
    indicatorColor: Color,
    componentSize: Size,
    indicatorStrokeWidth: Float
) {
    drawArc(
        size = componentSize,
        color = indicatorColor,
        startAngle = 150f,
        sweepAngle = 240f,
        useCenter = false,
        style = Stroke(
            width = indicatorStrokeWidth,
            cap = StrokeCap.Round
        ),
        topLeft = Offset(
            x = (size.width - componentSize.width) / 2f,
            y = (size.height - componentSize.height) / 2f
        )

    )
}

fun DrawScope.foregroundIndicator(
    sweepAngle: Float,
    indicatorColor: Color,
    componentSize: Size,
    indicatorStrokeWidth: Float
) {
    drawArc(
        size = componentSize,
        color = indicatorColor,
        startAngle = 150f,
        sweepAngle = sweepAngle,
        useCenter = false,
        style = Stroke(
            width = indicatorStrokeWidth,
            cap = StrokeCap.Round
        ),
        topLeft = Offset(
            x = (size.width - componentSize.width) / 2f,
            y = (size.height - componentSize.height) / 2f
        )

    )
}

@Composable
fun EmbeddedElements(
    bigText: Int,
    bigTextFontSize: TextUnit,
    bigTextColor: Color,
    bigTextSuffix: String,
    smallText: String,
    smallTextColor: Color,
    smallTextFontSize: TextUnit
) {
    Text(
        text = smallText,
        color = smallTextColor,
        fontSize = smallTextFontSize,
        textAlign = TextAlign.Center
    )
    Text(
        text = "$bigText ${bigTextSuffix.take(2)}",
        color = bigTextColor,
        fontSize = bigTextFontSize,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold

    )
}

//@Preview
@Composable
fun CustomUI2Preview() {
    MaterialTheme {
//        CustomUI2()
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            var value by remember { mutableIntStateOf(0) }
            CustomUI2(indicatorValue = value)
            TextField(
                value = value.toString(),
                onValueChange = {
                    value = it.toIntOrNull() ?: 0
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number
                )
            )
        }

    }
}