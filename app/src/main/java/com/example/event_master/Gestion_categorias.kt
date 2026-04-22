package com.example.event_master

import androidx.compose.ui.graphics.Color

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

    fun _size() : Int{
        return categorias.size
    }

}

class eventos{
    private val nombres = mutableListOf<String>()
    private val categoria = mutableListOf<String>()
    private  val fecha = mutableListOf<String>()
    private val detalles = mutableListOf<String>()

    fun agregarEvento(nombreEvento : String, categoriaEvento : String, fechaEvento : String, detallesEvento : String) : Unit{
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

    fun getFechaByIndex(index : Int) : String{
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
    fun buscarFechaByNombre(target : String) : String {
        val index : Int = nombres.indexOf(target);
        return fecha[index];
    }
}

val listaDeCategorias = categorias()
val listaDeEventos = eventos()

fun testVars(){
    listaDeCategorias.agregarCategoria("deportes", Color.Red);
    listaDeCategorias.agregarCategoria("musica",Color.Blue);
    listaDeCategorias.agregarCategoria("otros",Color.Green);

    listaDeEventos.agregarEvento("torneo futbol",listaDeCategorias.getNombrebyindex(0), "2012-01-21","lorem ipsum....")
    listaDeEventos.agregarEvento("REC concepcion",listaDeCategorias.getNombrebyindex(1), "2012-01-21","lorem ipsum....")
    listaDeEventos.agregarEvento("torneo cartitas",listaDeCategorias.getNombrebyindex(2), "2012-01-21","lorem ipsum....")
}