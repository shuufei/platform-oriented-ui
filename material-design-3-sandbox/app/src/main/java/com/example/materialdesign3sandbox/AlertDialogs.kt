package com.example.materialdesign3sandbox

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun AlertDialogs() {
    val openDialog = remember {
        mutableStateOf(false)
    }
    Column() {
        Button(onClick = { openDialog.value = true }) {
            Text(text = "show dialog")
        }
    }
    if (openDialog.value) {
        AlertDialog(
            onDismissRequest = { openDialog.value = false },
            confirmButton = { Button(onClick = { openDialog.value = false }) {
                Text(text = "confirm")
            }},
            title = {
                Text(text = "Dialog Title")
            },
            text = {
                Text(text = "dialog description")
            }
        )
    }
}