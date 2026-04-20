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

    fun getNombrebyindex(index : Int) : String{
        return categorias[index];
    }

    fun getColorByIndex(index : Int) : Color{
        return color[index];
    }

    fun buscarColorByCategorias(target : String) : Color{
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

    fun getNombresByIndex(index : Int) : String{
    return nombres[index];
    }

    fun getCategoriaByIndex(index : Int) : String{
        return categoria[index];
    }

    fun getFechaByIndex(index : Int) : Date{
        return fecha[index];
    }

    fun getDetallesByIndex(index : Int) : String{
        return detalles[index];
    }

    fun buscarCategoriaByNombre(target : String) : String {
        val index : Int = nombres.indexOf(target);
        return categoria[index];
    }

    fun buscarDetallesByNombre(target : String) : String {
        val index : Int = nombres.indexOf(target);
        return detalles[index];
    }
    fun buscarFechaByNombre(target : String) : Date {
        val index : Int = nombres.indexOf(target);
        return fecha[index];
    }
}