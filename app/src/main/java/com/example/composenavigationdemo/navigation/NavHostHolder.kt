package com.example.composenavigationdemo.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ramcosta.composedestinations.DestinationsNavHost
import ksp.NavGraphs


@Composable
fun NavHostHolder(modifier: Modifier){
    DestinationsNavHost(navGraph = NavGraphs.root)
}