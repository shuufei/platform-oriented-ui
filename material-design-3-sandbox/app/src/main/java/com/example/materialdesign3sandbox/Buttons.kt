package com.example.materialdesign3sandbox

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.materialdesign3sandbox.ui.theme.AppThemeM3

@Composable
fun Buttons() {
    Column(modifier = Modifier.padding(12.dp)) {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "filled button")
        }
        Button(enabled = false, onClick = { /*TODO*/ }) {
            Text(text = "filled button disabled")
        }
        Button(onClick = { /*TODO*/ }) {
            Icon(Icons.Filled.Add, contentDescription = "add icon")
            Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
            Text(text = "filled button disabled")
        }
        OutlinedButton(onClick = { /*TODO*/ }) {
            Text(text = "outlined button")
        }
        OutlinedButton(enabled = false, onClick = { /*TODO*/ }) {
            Text(text = "outlined button")
        }
        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "text button")
        }
        TextButton(enabled = false, onClick = { /*TODO*/ }) {
            Text(text = "text button")
        }
        FilledTonalButton(onClick = { /*TODO*/ }) {
            Text(text = "tonal button")
        }
        FilledTonalButton(enabled = false, onClick = { /*TODO*/ }) {
            Text(text = "tonal button")
        }
        FilledTonalButton(elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 3.dp
        ), onClick = { /*TODO*/ }) {
            Text(text = "tonal button")
        }
        ElevatedButton(onClick = { /*TODO*/ }) {
            Text(text = "elevated button")
        }
        ElevatedButton(enabled = false, onClick = { /*TODO*/ }) {
            Text(text = "elevated button")
        }
        Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "full width button")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonsPreview() {
    AppThemeM3 {
        Buttons()
    }
}