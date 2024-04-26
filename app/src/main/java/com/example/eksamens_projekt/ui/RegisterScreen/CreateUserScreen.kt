package com.example.eksamens_projekt.ui.RegisterScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material.icons.outlined.Place
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CreateUserScreen(){

    val viewModel = CreateUserViewModel()

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = viewModel.backgroundColor
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            Spacer(modifier = Modifier.height(50.dp))
            Text(text = "Kom i gang", fontSize = 36.sp, color = Color(0xFF364830))
            Text(text = "Opret en bruger", fontSize = 17.sp, color = Color(0xFF364830))
            
            Spacer(modifier = Modifier.height(20.dp))

            Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                InputfieldUser ("Fulde navn", icon = Icons.Outlined.Person)
                InputfieldUser("E-mail", icon = Icons.Outlined.Email)
                InputfieldUser("Telefonnummer", icon = Icons.Outlined.Phone)
                InputfieldUser("Postnummer", icon = Icons.Outlined.Place)
                InputfieldUser("Fødselsdag", icon = Icons.Outlined.DateRange )
                InputfieldUser("Adgangskode", icon = Icons.Outlined.Lock, isPassword = true)

                Text(text = "Køn", fontSize = 16.sp, color = Color(0xFF364830))
                GenderCheckbox()

                Box {
                    TermsAndConditionsCheckbox()
                }

                Box(modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center) {
                    CustomButton(text = "Tilmeld")

                }
                Box(modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center) {
                    Text(text = "Har du allerede en bruger? Login her", fontSize = 12.sp)
                }

            }
        }
    }
}