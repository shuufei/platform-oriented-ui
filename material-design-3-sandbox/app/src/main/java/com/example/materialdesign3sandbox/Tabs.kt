package com.example.materialdesign3sandbox

import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun Tabs() {
    TabRow(selectedTabIndex = 0) {
        Tab(selected = true, onClick = { /*TODO*/ }) {
            Text(text = "Home")
        }
        Tab(selected = false, onClick = { /*TODO*/ }) {
            Text(text = "Favorite")
        }
        Tab(selected = false, onClick = { /*TODO*/ }) {
            Text(text = "Profile")
        }
    }
}