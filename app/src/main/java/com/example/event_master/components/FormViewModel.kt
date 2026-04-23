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
    var listEvento = mutableListOf<Evento>(

    )
    var listActividad = mutableListOf<Actividad>(
        Actividad("Musica", listEvento)
    )

    fun addActividad(){
        listActividad.add(Actividad(tipo,listEvento))
    }
    /*fun addEvento( idEvento: Int){
        listActividad[idEvento].eventoLista.add(id, nombre, descripcion)
    }*/

}

class Actividad(val tipo: String,val eventoLista: MutableList<Evento> = mutableListOf<Evento>())
class Evento(val id: Int, val nombre: String, val detalle: String)


// Consultar al profe viavilidad, Crear una clase Actividad que sea de tipo lista e id(automatica),
// en la cual se guarden las actividades (Id, Nombre, Descripcion).
// Los tipos de eventos se mostraran en el inicio como tarjetas, con una lista (tarjetas) de las
// actividades, al clickear o seleccionar una de las actividades desplegara informacion o se
// avanzara a la pagina descriptiva