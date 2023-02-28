import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.composenavigationdemo.navigation.destinations.MoreNavGraph
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import ksp.destinations.MoreComposableDestination

@MoreNavGraph
@Destination
@Composable
fun ProfileComposable(
    navigator: DestinationsNavigator,
    username: String,
    email: String
){
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Profile Screen")
        Spacer(modifier = Modifier.padding(8.dp))
        Text(text = "hello $username : $email")
        Spacer(modifier = Modifier.padding(8.dp))
        Button(onClick = { navigator.popBackStack(MoreComposableDestination,false) }
        ) {
            Text(text = "Go back")
        }
    }
}