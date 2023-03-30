package com.example.materialdesign3sandbox

import android.graphics.Outline
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
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
        Card(
            onClick = {},
            modifier = Modifier
                .size(width = 240.dp, height = 100.dp)
        ) {
            Column(modifier = Modifier.padding(12.dp)) {
                Text(text = "Clickable")
                Divider()
                Row(modifier = Modifier.padding(4.dp)) {
                    OutlinedButton(onClick = { /*TODO*/ }) {
                        Text(text = "Cancel", style = MaterialTheme.typography.labelSmall)
                    }
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "Get tickets", style = MaterialTheme.typography.labelSmall)
                    }
                }
            }
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