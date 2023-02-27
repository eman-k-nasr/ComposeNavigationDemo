package com.example.composenavigationdemo.navigation.destinations

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

fun NavGraphBuilder.moreDestination(navController: NavController){
    composable(
        route = Routes.more
    ){
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("More Screen")

            Button(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                onClick = { navController.navigate(route = Routes.settings) },
            ) {
                Text(text = "Go to Settings")
            }

            Button(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                onClick = { navController.navigate(route = Routes.profile) },
            ) {
                Text(text = "Go to Profile")
            }

            Button(onClick = { navController.popBackStack(Routes.home,false) }
            ) {
                Text(text = "Go back")
            }
        }

    }

}