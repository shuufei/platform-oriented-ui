package com.example.materialdesign3sandbox

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.materialdesign3sandbox.ui.theme.AppThemeM3

@Composable
fun FloatingActionButtons() {
    Column(modifier = Modifier.padding(12.dp)) {
        FloatingActionButton(onClick = { /*TODO*/ }) {
            Text(text = "action")
        }
        FloatingActionButton(onClick = { /*TODO*/ }) {
            Icon(Icons.Filled.Add, "localized description")
        }
        FloatingActionButton(containerColor = MaterialTheme.colorScheme.primary, onClick = { /*TODO*/ }) {
            Icon(Icons.Filled.Add, "localized description")
        }
        LargeFloatingActionButton(onClick = { /*TODO*/ }) {
            Icon(
                Icons.Filled.Add,
                "localized description",
                modifier = Modifier.size(FloatingActionButtonDefaults.LargeIconSize)
            )
        }
        SmallFloatingActionButton(onClick = { /*TODO*/ }) {
            Icon(Icons.Filled.Add, "localized description")
        }
        ExtendedFloatingActionButton(onClick = { /*TODO*/ }) {
            Icon(Icons.Filled.Add, "description")
            Text(text = "add action")
        }
        ExtendedFloatingActionButton(
            text = { Text("add action") },
            icon = { Icon(Icons.Filled.Add, "description") },
            onClick = { /*TODO*/ }
        )
        ExtendedFloatingActionButton(
            text = { Text("add action") },
            icon = { Icon(Icons.Filled.Add, "description") },
            expanded = false,
            onClick = { /*TODO*/ }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FloatingActionButtonsPreview() {
    AppThemeM3 {
        FloatingActionButtons()
    }
}