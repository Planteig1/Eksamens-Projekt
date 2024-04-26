package com.example.eksamens_projekt.ui.NavigationBar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BottomNavigationBar(
    onSearchClick: () -> Unit,
    onCalenderClick: () -> Unit,
    onHomePageClick: () -> Unit,
    onEmailClick: () -> Unit,
    onAccountClick: () -> Unit

) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            NavigationButton(iconType = Icons.Default.Search, description = "Search", onClick = onSearchClick)
            NavigationButton(iconType = Icons.Default.DateRange, description = "Calender", onClick = onCalenderClick)
            NavigationButton(iconType = Icons.Default.Home, description = "Home", onClick = onHomePageClick)
            NavigationButton(iconType = Icons.Default.Email, description = "Home", onClick = onEmailClick)
            NavigationButton(iconType = Icons.Default.AccountCircle, description = "Home", onClick = onAccountClick)

        }

    }

}

@Preview (showBackground = true )
@Composable
fun Preview() {
    BottomNavigationBar({},{},{},{},{})

}
// LIST OF ICON NAME TO USE
// Use Icons.Default.<Name> as parameter

// Search
// DateRange
// Home
// Email
// AccountCircle