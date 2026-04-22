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
    var listEvento = mutableListOf<Actividad>(
        Actividad("Musica","Concierto","Banda local"),
        Actividad("Deporte","Partido Futbol","5pm, San Pedro de la paz"),
        Actividad("Cultura","Feria del libro","Biblioteca UCSC, 20:30 horas")
    )
    fun addEvento(){
        listEvento.add(Actividad(tipo,nombre,descripcion))
    }

}

class Actividad(val tipo: String,val nombre: String,val descripcion: String)


// Consultar al profe viavilidad, Crear una clase Actividad que sea de tipo lista e id(automatica),
// en la cual se guarden las actividades (Id, Nombre, Descripcion).
// Los tipos de eventos se mostraran en el inicio como tarjetas, con una lista (tarjetas) de las
// actividades, al clickear o seleccionar una de las actividades desplegara informacion o se
// avanzara a la pagina descriptiva