package com.example.eksamens_projekt.ui.LoginScreen

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.eksamens_projekt.ui.LoginScreen.LoginViewModel


@Composable
fun LoginScreen(
    onSuccessLogin: () -> Unit,
) {
    val loginViewModel = LoginViewModel()
    val context = LocalContext.current


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        //Titel & undertitel
        Text(text = "Velkommen til Volunify", fontSize = 28.sp)
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = "Log ind på din konto")


        //Email
        Spacer(modifier = Modifier.height(40.dp))
        OutlinedTextField(
            value = loginViewModel.email,
            onValueChange = { loginViewModel.email = it },
            label = {
            Text(text = "Email")
        })


        //Adgangskode
        OutlinedTextField(
            value = loginViewModel.password,
            onValueChange = { loginViewModel.password = it },
            label = {
            Text(text = "Adgangskode")
        })


        //Checkbox & glemt adgangskode
        Row {
            Checkbox(
                checked = loginViewModel.rememberMe,
                onCheckedChange = { loginViewModel.rememberMe = it }
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                text = "Husk mig",
                fontSize = 10.sp
            )
            Spacer(modifier = Modifier.weight(10f))
            Text(text = "Glemt adgangskode?", fontSize = 10.sp, modifier = Modifier.clickable {

            })
        }

        //Login
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            loginViewModel.login(loginViewModel.email, loginViewModel.password, onSuccessLogin, onFailure = {})
        }) {
            Text(text = "Login")

        }

        //Login via noget andet
        Spacer(modifier = Modifier.height(15.dp))
        Text(text = "Eller login med")
    }
}
