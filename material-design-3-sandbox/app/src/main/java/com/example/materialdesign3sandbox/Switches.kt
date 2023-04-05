package com.example.materialdesign3sandbox

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Switch
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Switches() {
    var checked by remember {
        mutableStateOf(true)
    }
    Column(modifier = Modifier.padding(12.dp)) {
        Switch(checked = checked, onCheckedChange = { checked = it })
    }
}