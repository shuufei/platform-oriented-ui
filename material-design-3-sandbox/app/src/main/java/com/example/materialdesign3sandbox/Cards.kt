package com.example.materialdesign3sandbox

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.materialdesign3sandbox.ui.theme.AppThemeM3

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Cards() {
    Column(modifier = Modifier.padding(12.dp)) {
        Card(modifier = Modifier.size(width = 180.dp, height = 100.dp)) {
            Text(text = "Title")
        }
        Card(
            onClick = {},
            modifier = Modifier.size(width = 180.dp, height = 100.dp)
        ) {
            Text(text = "Clickable")
        }
        Card(
            modifier = Modifier.size(width = 180.dp, height = 100.dp),
            colors = CardDefaults.outlinedCardColors(),
            border = CardDefaults.outlinedCardBorder(),
            elevation = CardDefaults.cardElevation(defaultElevation = 12.dp)
        ) {
            Text(text = "Boarder Card")
        }
    }
}

@Preview
@Composable
fun CardsPreview() {
    AppThemeM3 {
        Cards()
    }
}