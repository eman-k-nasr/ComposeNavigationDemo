package com.example.composenavigationdemo.navigation.destinations

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import ksp.destinations.ItemsComposableDestination
import ksp.destinations.MoreComposableDestination

@HomeNavGraph(start = true)
@RootNavGraph(start = true)
@Destination
@Composable
fun HomeComposable(navigator: DestinationsNavigator){
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = CenterHorizontally
    ) {
        Text(text = "Home Screen")
        Button(
            modifier = Modifier.align(CenterHorizontally),
            onClick = { navigator.navigate(ItemsComposableDestination) },
        ) {
            Text(text = "Go to Items")
        }

        Button(
            onClick = { navigator.navigate(MoreComposableDestination) },
        ) {
            Text(text = "Go to More")
        }
    }
}