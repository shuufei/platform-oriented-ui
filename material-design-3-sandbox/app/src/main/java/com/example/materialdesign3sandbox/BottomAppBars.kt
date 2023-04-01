package com.example.materialdesign3sandbox

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BottomAppBars() {
    Column(modifier = Modifier.padding(12.dp)) {
        BottomAppBar() {
            Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
                Row() {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Outlined.Phone, "phone")
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Outlined.Check, "check")
                    }
                }
                FloatingActionButton(
                    onClick = { /*TODO*/ },
                    elevation = FloatingActionButtonDefaults.elevation(0.dp),
                    modifier = Modifier.padding(horizontal = 12.dp)
                ) {
                    Icon(Icons.Outlined.Add, "add")
                }
            }
        }
    }
}