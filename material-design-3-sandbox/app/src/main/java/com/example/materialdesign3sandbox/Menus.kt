package com.example.materialdesign3sandbox

import androidx.compose.foundation.layout.Box
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.*
import androidx.compose.runtime.*

@Composable
fun Menus() {
    var expanded by remember {
        mutableStateOf(false)
    }
    Box() {
        IconButton(onClick = { expanded = true }) {
            Icon(Icons.Default.MoreVert, "menu")
        }
        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            DropdownMenuItem(text = { Text(text = "Menu1") }, onClick = { /*TODO*/ })
            DropdownMenuItem(text = { Text(text = "Menu2") }, onClick = { /*TODO*/ })
            Divider()
            var expandedNestMenu by remember {
                mutableStateOf(false)
            }
            DropdownMenuItem(
                text = { Text(text = "expand next menu") },
                onClick = { expandedNestMenu = true },
                trailingIcon = {
                    Icon(Icons.Default.ArrowDropDown, "expand")
                }
            )
            DropdownMenu(expanded = expandedNestMenu, onDismissRequest = { expandedNestMenu = false }) {
                DropdownMenuItem(text = { Text(text = "Nest Menu1") }, onClick = { /*TODO*/ })
            }
        }
    }
}