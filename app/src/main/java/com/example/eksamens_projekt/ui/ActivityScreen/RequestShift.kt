
import androidx.compose.material3.Checkbox
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.eksamens_projekt.ui.ActivityScreen.RequestShiftViewModel


@Composable
fun RequestShiftCheckbox(requestShiftViewModel: RequestShiftViewModel = viewModel()) {

    val isRequested = requestShiftViewModel.isRequested.value

    Checkbox(
        checked = isRequested,
        onCheckedChange = {requestShiftViewModel.setRequested(it)},
    )
}
