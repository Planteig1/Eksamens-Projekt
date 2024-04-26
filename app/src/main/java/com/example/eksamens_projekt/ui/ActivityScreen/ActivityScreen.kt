package com.example.eksamens_projekt.ui.ActivityScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ActivityScreen() {

    val viewModel = ActivityScreenViewModel()

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = viewModel.backgroundColor
    ) {
        Column {
            TopBar()
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(6.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                SearchBar()

                ShiftCard(
                    title = "Barvagt",
                    organization = "Roskilde Festival",
                    date = "04-07-2024",
                    time = "11:00-20:00",

                )
                ShiftCard(
                    title = "Barvagt",
                    organization = "Musik i Lejet",
                    date = "12-07-2024",
                    time = "19:30-01:30",

                )
                ShiftCard(
                    title = "Billetscanner",
                    organization = "Roskilde Festival",
                    date = "29-06-2024",
                    time = "15:00-21:00",

                )
            }
        }
    }
}