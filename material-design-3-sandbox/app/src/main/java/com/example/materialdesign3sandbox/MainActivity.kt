package com.example.materialdesign3sandbox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.Modifier
import com.example.materialdesign3sandbox.ui.theme.AppThemeM3

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppThemeM3 {
                Column(
                    modifier = Modifier
                        .verticalScroll(rememberScrollState())
                ) {
//                        Card(title = "title", description = "descritpion", cardLabel = "click")
                    Cards()
                    Indicators()
                    Badges()
                    FloatingActionButtons()
                    Buttons()
                }
            }
        }
    }
}


