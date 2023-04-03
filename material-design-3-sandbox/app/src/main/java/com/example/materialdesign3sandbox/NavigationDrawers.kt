package com.example.materialdesign3sandbox

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationDrawers() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet() {
                NavigationDrawerItem(
                    label = { Text(text = "Home") },
                    selected = true,
                    onClick = { /*TODO*/ },
                    icon = { Icon(Icons.Filled.Home, "home")}
                )
                NavigationDrawerItem(
                    label = { Text(text = "Favorite") },
                    selected = false,
                    onClick = { /*TODO*/ },
                    icon = { Icon(Icons.Outlined.Favorite, "favorite")}
                )
                NavigationDrawerItem(
                    label = { Text(text = "Profile") },
                    selected = false,
                    onClick = { /*TODO*/ },
                    icon = { Icon(Icons.Outlined.Person, "person")}
                )
            }
        },
        content = {
            Column(modifier = Modifier.padding(12.dp)) {
                Button(onClick = {
                    scope.launch { drawerState.open() }
                }) {
                    Text(text = "open drawer")
                }
            }
        }
    )
}