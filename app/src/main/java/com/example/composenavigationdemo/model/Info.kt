package com.example.composenavigationdemo.model
import kotlinx.serialization.Serializable

@Serializable
data class Info(val name:String, val state: State)

