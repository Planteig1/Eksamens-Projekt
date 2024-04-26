package com.example.eksamens_projekt.services

import com.google.firebase.Firebase
import com.google.firebase.auth.auth

class AccountService {
    fun authenticate(email: String, password: String, onResult: () -> Unit, onFail: () -> Unit) {
        Firebase.auth.createUserWithEmailAndPassword(email, password)
            .addOnSuccessListener {

                //Give it the function of what to do
                onResult()
            }
            .addOnFailureListener {
                //Give it the function of what to do
                onFail()
            }
    }

    fun login(email: String, password: String, onSuccessLogin: () -> Unit) {
        Firebase.auth.signInWithEmailAndPassword(email, password)
            .addOnSuccessListener {
                //Give it the function of what to do
                onSuccessLogin()
            }

    }
}
