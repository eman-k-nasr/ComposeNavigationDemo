package com.example.composenavigationdemo.navigation.destinations

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.composenavigationdemo.model.Info
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import ksp.destinations.MoreComposableDestination

@MoreNavGraph
@Destination
@Composable
fun SettingsComposable(
    info: Info,
    navigator: DestinationsNavigator
){
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Settings Screen")
        Spacer(modifier = Modifier.padding(8.dp))
        Text(text = "Extracting Serializable object ..")
        Text(text = "${info.name},${info.state.type},${info.state.data}")
        Button(onClick = { navigator.popBackStack(MoreComposableDestination,false) }
        ) {
            Text(text = "Go back")
        }
    }
}