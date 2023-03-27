package com.example.materialdesign3sandbox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.materialdesign3sandbox.card.Card
import com.example.materialdesign3sandbox.ui.theme.AppThemeM3
import com.example.materialdesign3sandbox.ui.theme.MaterialDesign3SandboxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            MaterialDesign3SandboxTheme {
            AppThemeM3 {
                Surface(
                    color = MaterialTheme.colorScheme.surface
                ) {
                    Column() {
                        Greeting("Android")
                        Button(onClick = { /*TODO*/ }) {
                            Text(text = "Filled Button", style = MaterialTheme.typography.labelSmall)
                        }
                        Card(title = "title", description = "descritpion", cardLabel = "click")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MaterialDesign3SandboxTheme {
        Greeting("Android")
    }
}