package com.example.composenavigationdemo.navigation.destinations

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import com.example.composenavigationdemo.navigation.Routes
import profileDestination


fun NavGraphBuilder.homeNavGraph(
    navController: NavController
) {
    navigation(
        route = Routes.homeNavGraph,
        startDestination = Routes.home
    ){
        homeDestination(navController)
        itemsDestination(navController)
        detailsDestination(navController)
    }
}

fun NavGraphBuilder.moreNavGraph(
    navController: NavController
) {
    navigation(
        route = Routes.moreNavGraph,
        startDestination = Routes.more
    ){
        moreDestination(navController)
        profileDestination(navController)
        settingsDestination(navController)
    }
}