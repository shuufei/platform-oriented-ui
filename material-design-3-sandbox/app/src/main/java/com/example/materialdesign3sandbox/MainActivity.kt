package com.example.materialdesign3sandbox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ModalBottomSheetLayout
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.BadgeDefaults.containerColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.materialdesign3sandbox.ui.theme.AppThemeM3
import kotlinx.coroutines.launch

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
                        Indicators()
                        Badges()
                        FloatingActionButtons()
                        Buttons()
                }
            }
        }
    }
}

@Composable
fun Buttons() {
    Column(modifier = Modifier.padding(12.dp)) {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "filled button")
        }
        Button(enabled = false, onClick = { /*TODO*/ }) {
            Text(text = "filled button disabled")
        }
        Button(onClick = { /*TODO*/ }) {
            Icon(Icons.Filled.Add, contentDescription = "add icon")
            Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
            Text(text = "filled button disabled")
        }
        OutlinedButton(onClick = { /*TODO*/ }) {
            Text(text = "outlined button")
        }
        OutlinedButton(enabled = false, onClick = { /*TODO*/ }) {
            Text(text = "outlined button")
        }
        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "text button")
        }
        TextButton(enabled = false, onClick = { /*TODO*/ }) {
            Text(text = "text button")
        }
        FilledTonalButton(onClick = { /*TODO*/ }) {
            Text(text = "tonal button")
        }
        FilledTonalButton(enabled = false, onClick = { /*TODO*/ }) {
            Text(text = "tonal button")
        }
        FilledTonalButton(elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 3.dp
        ), onClick = { /*TODO*/ }) {
            Text(text = "tonal button")
        }
        ElevatedButton(onClick = { /*TODO*/ }) {
            Text(text = "elevated button")
        }
        ElevatedButton(enabled = false, onClick = { /*TODO*/ }) {
            Text(text = "elevated button")
        }
        Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "full width button")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonsPreview() {
    AppThemeM3 {
        Buttons()
    }
}

@Composable
fun FloatingActionButtons() {
    Column(modifier = Modifier.padding(12.dp)) {
        FloatingActionButton(onClick = { /*TODO*/ }) {
            Text(text = "action")
        }
        FloatingActionButton(onClick = { /*TODO*/ }) {
            Icon(Icons.Filled.Add, "localized description")
        }
        FloatingActionButton(containerColor = MaterialTheme.colorScheme.primary, onClick = { /*TODO*/ }) {
            Icon(Icons.Filled.Add, "localized description")
        }
        LargeFloatingActionButton(onClick = { /*TODO*/ }) {
            Icon(
                Icons.Filled.Add,
                "localized description",
                modifier = Modifier.size(FloatingActionButtonDefaults.LargeIconSize)
            )
        }
        SmallFloatingActionButton(onClick = { /*TODO*/ }) {
            Icon(Icons.Filled.Add, "localized description")
        }
        ExtendedFloatingActionButton(onClick = { /*TODO*/ }) {
            Icon(Icons.Filled.Add, "description")
            Text(text = "add action")
        }
        ExtendedFloatingActionButton(
            text = { Text("add action") },
            icon = { Icon(Icons.Filled.Add, "description") },
            onClick = { /*TODO*/ }
        )
        ExtendedFloatingActionButton(
            text = { Text("add action") },
            icon = { Icon(Icons.Filled.Add, "description") },
            expanded = false,
            onClick = { /*TODO*/ }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FloatingActionButtonsPreview() {
    AppThemeM3 {
        FloatingActionButtons()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Badges() {
    Column(modifier = Modifier.padding(12.dp)) {
        Badge(
            containerColor = BadgeDefaults.containerColor,
            contentColor = contentColorFor(backgroundColor = containerColor)
        )
        Badge(
            containerColor = BadgeDefaults.containerColor,
            contentColor = contentColorFor(backgroundColor = containerColor)
        ) {
            Text(text = "100")
        }

        BadgedBox(
            badge = {
                Badge()
            }
        ) {
            Text(text = "box item")
        }

        BadgedBox(
            badge = {
                Badge {
                    Text(text = "1")
                }
            }
        ) {
            Text(text = "box item")
        }
    }
}



@Preview(showBackground = true)
@Composable
fun BadgesPreview() {
    AppThemeM3 {
        Badges()
    }
}

@Composable
fun Indicators() {
    Column(modifier = Modifier.padding(12.dp)) {
        CircularProgressIndicator()
        CircularProgressIndicator(
            color = MaterialTheme.colorScheme.tertiary
        )
        val progress: kotlin.Float = 0.7F
        CircularProgressIndicator(
            progress = progress
        )
        LinearProgressIndicator()
        LinearProgressIndicator(
            progress = progress
        )
    }
}

@Preview(showBackground = true)
@Composable
fun IndicatorsPreview() {
    AppThemeM3 {
        Indicators()
    }
}

