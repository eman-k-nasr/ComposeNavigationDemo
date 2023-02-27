package com.example.composenavigationdemo.navigation.destinations

import com.ramcosta.composedestinations.annotation.NavGraph
import com.ramcosta.composedestinations.annotation.RootNavGraph

@RootNavGraph(start = true)
@NavGraph(default = true)
annotation class HomeNavGraph(
    val start: Boolean = false
)

@RootNavGraph
@NavGraph
annotation class MoreNavGraph(
    val start: Boolean = false
)