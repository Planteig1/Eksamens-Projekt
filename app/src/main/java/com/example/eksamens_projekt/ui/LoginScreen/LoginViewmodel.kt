package com.example.eksamens_projekt.ui.LoginScreen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.eksamens_projekt.services.AccountService
import androidx.lifecycle.ViewModel

class LoginViewModel: ViewModel() {
    var accountService: AccountService = AccountService()

    var rememberMe by mutableStateOf(false)
    var email by   mutableStateOf("")
    var password by  mutableStateOf("")


    fun login(email: String, password: String, onSuccessLogin: () -> Unit, onFailure: () -> Unit) {
        accountService.authenticate(email, password, onSuccessLogin, onFailure)
    }


}
