package com.example.eksamens_projekt.ui.RegisterScreen

import android.icu.util.Calendar
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TextFieldDefaults.textFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.time.LocalDate
import java.time.format.DateTimeFormatter


@OptIn(ExperimentalMaterial3Api::class) //To import textFieldColors

@Composable
fun InputfieldUser(
    label: String,
    icon: ImageVector,
    isPassword: Boolean = false)
{
    val text = remember { mutableStateOf("") }

    val textFieldColors = textFieldColors(
        containerColor = Color.White,
        unfocusedIndicatorColor = Color.Transparent, // Remove black underline when unfocused
        focusedIndicatorColor = Color.Transparent // Remove underline when focused
    )
    
    TextField(
        value = text.value,
        onValueChange = {newText -> text.value = newText},
        modifier = Modifier
            .width(370.dp)
            .height(50.dp),
        shape = RoundedCornerShape(12.dp),
        label = { Text(text = label) },
        trailingIcon = { Icon(icon, contentDescription = null)},
        colors = textFieldColors,
        visualTransformation =
            if (isPassword) PasswordVisualTransformation()
            else VisualTransformation.None, // Obscure text if it's a password
    )
}

