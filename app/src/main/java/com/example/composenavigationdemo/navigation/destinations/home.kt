package com.example.composenavigationdemo.navigation.destinations

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.composenavigationdemo.navigation.Routes

fun NavGraphBuilder.homeDestination(navController: NavController){
    composable(route = Routes.home){
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = CenterHorizontally
        ) {
            Text(text = "Home Screen")
            Button(
                modifier = Modifier.align(CenterHorizontally),
                onClick = { navController.navigate(route = Routes.items) },
            ) {
                Text(text = "Go to Items")
            }

            Button(
                onClick = { navController.navigate(route = Routes.moreNavGraph) },
            ) {
                Text(text = "Go to More")
            }
        }

    }
}