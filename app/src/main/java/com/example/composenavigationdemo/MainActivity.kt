package com.example.composenavigationdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.composenavigationdemo.navigation.MainScreen
import com.example.composenavigationdemo.ui.theme.ComposeNavigationDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeNavigationDemoTheme {
                MainScreen()
            }
        }
    }
}