package com.example.materialdesign3sandbox

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListItems() {
    Column(modifier = Modifier.padding(12.dp)) {
        ListItem(
            headlineText = { Text(text = "Headline") },
            leadingContent = {
                Icon(Icons.Filled.Favorite, contentDescription = "favorite")
            },
            trailingContent = {
                Icon(Icons.Outlined.Person, contentDescription = "person")
            },
            supportingText = {
                Text(text = "support text")
            }
        )
    }
}