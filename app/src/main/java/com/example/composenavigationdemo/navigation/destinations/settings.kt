package com.example.composenavigationdemo.navigation.destinations

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import ksp.destinations.MoreComposableDestination

@MoreNavGraph
@Destination
@Composable
fun SettingsComposable(navigator: DestinationsNavigator){
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Settings Screen")
        Button(onClick = { navigator.popBackStack(MoreComposableDestination,false) }
        ) {
            Text(text = "Go back")
        }
    }
}