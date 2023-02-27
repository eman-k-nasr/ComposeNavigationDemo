import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.composenavigationdemo.navigation.Routes

fun NavGraphBuilder.profileDestination(navController: NavController){
    composable(
        route = Routes.profile
    ){
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Profile Screen")
            Button(onClick = { navController.popBackStack(Routes.more,false) }
            ) {
                Text(text = "Go back")
            }
        }

    }
}