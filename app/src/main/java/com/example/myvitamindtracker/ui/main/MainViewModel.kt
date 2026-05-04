package com.example.myvitamindtracker.ui.main

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel : ViewModel() {
    private val _text = MutableStateFlow("Hola desde ViewModel")
    val text : StateFlow<String> = _text

    fun changeText() {
        _text.value = "Texto cambiado"
    }
}