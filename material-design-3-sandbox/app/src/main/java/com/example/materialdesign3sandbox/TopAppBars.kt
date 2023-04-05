package com.example.materialdesign3sandbox

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBars() {
    TopAppBar(
        title = { Text(text = "Title") }
    )
    TopAppBar(
        title = { Text(text = "Title") },
        navigationIcon = { Icon(Icons.Outlined.ArrowBack, "back") },
        scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
    )
    LargeTopAppBar(
        title = { Text(text = "Title") },
    )
    LargeTopAppBar(
        title = { Text(text = "Title") },
        navigationIcon = { Icon(Icons.Outlined.ArrowBack, "back") },
    )
}