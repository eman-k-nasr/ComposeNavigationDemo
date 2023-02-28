package com.example.composenavigationdemo.model

import kotlinx.serialization.Serializable

@Serializable
data class State(val type: String,val data: ArrayList<String>)
