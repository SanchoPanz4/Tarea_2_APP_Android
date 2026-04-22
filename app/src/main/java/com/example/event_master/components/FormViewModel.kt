package com.example.event_master.components

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.lifecycle.ViewModel

class CategoriaViewMdole: ViewModel(){
    var tipo by mutableStateOf("")
    var nombre by mutableStateOf("")
    var descripcion by mutableStateOf("")
    // var color by mutableStateOf("")  Preguntar profesor como tomar color para las cards
    var listEvento = mutableListOf<Actividad>()
    fun addEvento(){
        listEvento.add(Actividad(tipo,nombre,descripcion))
    }

}

class Actividad(val tipo: String,val nombre: String,val descripcion: String)