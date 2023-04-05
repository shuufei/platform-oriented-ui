package com.example.materialdesign3sandbox

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material.RadioButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun RadioButtons() {
    Row(Modifier.selectableGroup()) {
        RadioButton(selected = true, onClick = { /*TODO*/ })
        RadioButton(selected = false, onClick = { /*TODO*/ })
    }
}