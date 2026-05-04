package com.example.myvitamindtracker.ui.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MainScreen(modifier: Modifier = Modifier){
    Column(modifier = modifier.fillMaxSize()) {
        Text(text = "Pantalla principal")
    }
}