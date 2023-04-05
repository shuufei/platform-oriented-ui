package com.example.materialdesign3sandbox

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.*

@Composable
fun Sliders() {
    var sliderPosition by remember {
        mutableStateOf(0f)
    }
    Column() {
        Text(text = sliderPosition.toString())
    }
    Slider(
        value = sliderPosition,
        onValueChange = { sliderPosition = it },
        steps = 4
    )
}