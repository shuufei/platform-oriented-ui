package com.example.materialdesign3sandbox

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material3.Text
import androidx.compose.material3.Checkbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp

@Composable
fun Checkboxs() {
    val (checkedState, onStateChange) = remember {
        mutableStateOf(true)
    }
    Column(modifier = Modifier.padding(12.dp)) {
        Checkbox(checked = true, onCheckedChange = {})
        Row(
            modifier = Modifier.toggleable(
                value = checkedState,
                onValueChange = {onStateChange(!checkedState)},
                role = Role.Checkbox
            ),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(checked = checkedState, onCheckedChange = null)
            Text(text = "option selection", modifier = Modifier.padding(start = 16.dp))
        }
    }
}