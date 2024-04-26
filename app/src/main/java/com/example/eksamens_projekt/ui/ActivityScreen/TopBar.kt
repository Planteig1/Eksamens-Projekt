package com.example.eksamens_projekt.ui.ActivityScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TopBar() {
    Surface(
        modifier = Modifier.padding(10.dp),
        color = Color.White,
        shape = RoundedCornerShape(8.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            contentAlignment = Alignment.Center
        )
        {
            Row(
                modifier = Modifier,
                horizontalArrangement = Arrangement.spacedBy(100.dp)
            ) {
                Text(text = "Ledige vagter", fontSize = 28.sp, color = Color(0xFF364830))
                Icon(
                    imageVector = Icons.Outlined.Notifications,
                    contentDescription = "Notification Icon",
                    modifier = Modifier.size(40.dp),
                    tint = Color(0xFF364830)
                )

            }
        }
    }
}