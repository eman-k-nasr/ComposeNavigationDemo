package com.example.composenavigationdemo.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.composenavigationdemo.navigation.destinations.homeNavGraph
import com.example.composenavigationdemo.navigation.destinations.moreNavGraph

@Composable
fun NavHostHolder(modifier: Modifier){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Routes.homeNavGraph
    ){
        homeNavGraph(navController)
        moreNavGraph(navController)
    }
}