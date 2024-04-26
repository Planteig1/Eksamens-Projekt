package com.example.eksamens_projekt.ui.RegisterScreen

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CheckboxViewModel: ViewModel() {
    private val _isMaleChecked = mutableStateOf(false)
    val isMaleChecked: State<Boolean> get() = _isMaleChecked

    private val _isFemaleChecked = mutableStateOf(false)
    val isFemaleChecked: State<Boolean> get() = _isFemaleChecked

    private val _isOtherChecked = mutableStateOf(false)
    val isOtherChecked: State<Boolean> get() = _isOtherChecked

    private val _isTermsAndConditionsChecked = mutableStateOf(false)
    val isTermsAndConditionsChecked: State<Boolean> get() = _isTermsAndConditionsChecked

    // Update functions to toggle the checkbox states
    fun setMaleChecked(checked: Boolean) {
        _isMaleChecked.value = checked
    }
    fun setFemaleChecked(checked: Boolean) {
        _isFemaleChecked.value = checked
    }
    fun setOtherChecked(checked: Boolean) {
        _isOtherChecked.value = checked
    }
    fun setTermsAndConditionsChecked(checked: Boolean) {
        _isTermsAndConditionsChecked.value = checked
    }
}