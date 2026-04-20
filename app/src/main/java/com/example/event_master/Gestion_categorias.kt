package com.example.event_master

import androidx.compose.ui.graphics.Color
import java.util.Date

class categorias {
    private val categorias = mutableListOf<String>()
    private val color = mutableListOf<Color>()

    fun agregarCategoria(nombreCategoria : String, colorCategoria : Color) : Unit{
        categorias.add(nombreCategoria);
        color.add(colorCategoria);
    }

    fun nombreCategorias(index : Int) : String{
        return categorias[index];
    }

    fun colorCategorias(index : Int) : Color{
        return color[index];
    }

    fun buscarColorCategorias(target : String) : Color{
        val index : Int = categorias.indexOf(target);
        return color[index];
    }

}

class eventos{
    private val nombres = mutableListOf<String>()
    private val categoria = mutableListOf<String>()
    private  val fecha = mutableListOf<Date>()
    private val detalles = mutableListOf<String>()

    fun agregarEvento(nombreEvento : String, categoriaEvento : String, fechaEvento : Date, detallesEvento : String) : Unit{
        nombres.add(nombreEvento);
        categoria.add(categoriaEvento);
        fecha.add(fechaEvento);
        detalles.add(detallesEvento);
    }


}