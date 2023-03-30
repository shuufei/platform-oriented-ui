package com.example.materialdesign3sandbox

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.materialdesign3sandbox.ui.theme.AppThemeM3

@Composable
fun Indicators() {
    Column(modifier = Modifier.padding(12.dp)) {
        CircularProgressIndicator()
        CircularProgressIndicator(
            color = MaterialTheme.colorScheme.tertiary
        )
        val progress: Float = 0.7F
        CircularProgressIndicator(
            progress = progress
        )
        LinearProgressIndicator()
        LinearProgressIndicator(
            progress = progress
        )
    }
}

@Preview(showBackground = true)
@Composable
fun IndicatorsPreview() {
    AppThemeM3 {
        Indicators()
    }
}
