package com.example.eksamens_projekt.ui.ActivityScreen

import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class RequestShiftViewModel: ViewModel() {
    private val _isRequested = mutableStateOf(false)
    val isRequested: State<Boolean>  get() = _isRequested

    // Update functions to toggle the checkbox states
    fun setRequested (checked: Boolean) {
        _isRequested.value = checked
    }

    var isExpanded by mutableStateOf(false)
}