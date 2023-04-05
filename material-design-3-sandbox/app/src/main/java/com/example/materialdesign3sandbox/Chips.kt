package com.example.materialdesign3sandbox

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material.icons.outlined.Close
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Chips() {
    Column(modifier = Modifier.padding(12.dp)) {
        AssistChip(
            onClick = { /*TODO*/ },
            label = { Text(text = "Assist")},
            leadingIcon = {
                Icon(Icons.Outlined.ShoppingCart, "card", Modifier.size(AssistChipDefaults.IconSize))
            }
        )
        ElevatedAssistChip(
            onClick = { /*TODO*/ },
            label = { Text(text = "Assist")},
            leadingIcon = {
                Icon(Icons.Outlined.ShoppingCart, "card", Modifier.size(AssistChipDefaults.IconSize))
            },
        )
        FilterChip(
            onClick = { /*TODO*/ },
            label = { Text(text = "Filter")},
            leadingIcon = {
                Icon(Icons.Outlined.Check, "card", Modifier.size(AssistChipDefaults.IconSize))
            },
            selected = true
        )
        InputChip(
            selected = true,
            onClick = { /*TODO*/ },
            label = { Text(text = "Input")},
        )
        InputChip(
            selected = false,
            onClick = { /*TODO*/ },
            label = { Text(text = "Input")},
            trailingIcon = {
                Icon(Icons.Outlined.Close, "card", Modifier.size(AssistChipDefaults.IconSize))
            }
        )
        SuggestionChip(
            onClick = { /*TODO*/ },
            label = { Text(text = "Suggestion")},
        )
    }
}