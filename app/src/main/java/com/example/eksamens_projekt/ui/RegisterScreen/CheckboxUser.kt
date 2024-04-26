package com.example.eksamens_projekt.ui.RegisterScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun GenderCheckbox(checkboxViewModel : CheckboxViewModel = viewModel()) {

    val isMaleChecked = checkboxViewModel.isMaleChecked.value
    val isFemaleChecked = checkboxViewModel.isFemaleChecked.value
    val isOtherChecked = checkboxViewModel.isOtherChecked.value

    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {

        Row(
            horizontalArrangement = Arrangement.spacedBy(40.dp),
            modifier = Modifier,

            ) {
            Column {
                Checkbox(
                    checked = isMaleChecked,
                    onCheckedChange = { checkboxViewModel.setMaleChecked(it) }, //Toggle the checkbox
                    modifier = Modifier.graphicsLayer(scaleX = 1.5f, scaleY = 1.5f),
                )
                Text(text = "Mand")
            }
            Column {
                Checkbox(
                    checked = isFemaleChecked,
                    onCheckedChange = { checkboxViewModel.setFemaleChecked(it) },
                    modifier = Modifier.graphicsLayer(scaleX = 1.5f, scaleY = 1.5f)
                )
                Text(text = "Kvinde")
            }
            Column {
                Checkbox(
                    checked = isOtherChecked,
                    onCheckedChange = { checkboxViewModel.setOtherChecked(it) },
                    modifier = Modifier.graphicsLayer(scaleX = 1.5f, scaleY = 1.5f)
                )
                Text(text = "Andet")
            }
        }
    }
}

@Composable
fun TermsAndConditionsCheckbox(checkboxViewModel: CheckboxViewModel = viewModel()) {
    val isTermsAndConditionsChecked = checkboxViewModel.isTermsAndConditionsChecked.value
    Row(
        modifier = Modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(
            checked = isTermsAndConditionsChecked,
            onCheckedChange = { checkboxViewModel.setTermsAndConditionsChecked(it) },
            modifier = Modifier.graphicsLayer(scaleX = 0.5f, scaleY = 0.5f)
        )
        Text(text = "By checking the box you agree to our Terms and Conditions", fontSize = 11.sp)
    }
}