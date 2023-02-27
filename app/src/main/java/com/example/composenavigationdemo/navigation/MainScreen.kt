package com.example.composenavigationdemo.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MainScreen(){
    Scaffold {
        NavHostHolder(modifier = Modifier.padding(it))
    }
}