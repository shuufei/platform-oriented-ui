package com.example.materialdesign3sandbox

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.materialdesign3sandbox.ui.theme.AppThemeM3

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Badges() {
    Column(modifier = Modifier.padding(12.dp)) {
        Badge(
            containerColor = BadgeDefaults.containerColor,
            contentColor = contentColorFor(backgroundColor = BadgeDefaults.containerColor)
        )
        Badge(
            containerColor = BadgeDefaults.containerColor,
            contentColor = contentColorFor(backgroundColor = BadgeDefaults.containerColor)
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