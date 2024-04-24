import androidx.compose.foundation.Image
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.res.imageResource


@Composable
fun LoginScreen() {
    var rememberMe by remember { mutableStateOf(false) }

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
        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "Email")
        })
        //Adgangskode
        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "Adgangskode")
        })
        //Checkbox & glemt adgangskode
        Row {

            Checkbox(
                checked = rememberMe,
                onCheckedChange = { rememberMe = it }
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
        Button(onClick = { }) {
            Text(text = "Login")

        }

        //Login via noget andet
        Spacer(modifier = Modifier.height(15.dp))
        Text(text = "Eller login med")
    }
}
        /*
        Spacer(modifier = Modifier.height(15.dp))
        Image(
            painter = painterResource(id = R.drawable.fb_logo),
            contentDescription = "Facebook",
            modifier = Modifier.size(60.dp).clickable {
                //Facebook-link
            })
        Image(
            painter = painterResource(id = R.drawable.google_logo),
            contentDescription = "Google",
            modifier = Modifier.size(60.dp).clickable {
                //Google-link
            })
        Image(
            painter = painterResource(id = R.drawable.x_logo),
            contentDescription = "X",
            modifier = Modifier.size(60.dp).clickable {
                //X-link
            })
    }
    }
         */
