package com.example.event_master


import android.widget.Space
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.event_master.listaDeCategorias
import com.example.event_master.listaDeEventos
import java.util.Date


@Composable
fun agregarCategoria(navController: NavHostController) {

    var nombre by remember { mutableStateOf(value = "") }
    var color by remember { mutableStateOf(value = "") }

    Column(Modifier.padding(16.dp)){
        Text("agregar nueva categoria") //rehacer tirando los strings a string.xml
        Spacer(Modifier.height(16.dp))
        OutlinedTextField(value = nombre, onValueChange = {nombre = it}, label = { Text("nombre de la categoria") }, isError = nombre.isBlank())
        Spacer(Modifier.height(24.dp))
        OutlinedTextField(value = color, onValueChange = {color = it}, label = { Text("seleccionar color") }, isError = color.length != 6 && color.isBlank())

        Spacer(Modifier.height(36.dp))

        Button(
            onClick = {
                    if(nombre.isNotBlank() && color.isNotBlank() && color.length == 6){
                        listaDeCategorias.agregarCategoria(nombre, Color.Red);
                        //cambio de navegacion aqui
                    }
        }){Text("crear")}

    }
}

@Composable
fun agregarEvento(navController: NavHostController){
    var nombre by remember { mutableStateOf(value = "") }
    var categoria by remember { mutableStateOf(value = "") }
    var fecha by remember { mutableStateOf(value = "") }
    var detalle by remember { mutableStateOf(value = "") }

    Text("agregue los detalles de su evento")
    Spacer(Modifier.height(16.dp))
    OutlinedTextField(value = nombre, onValueChange = {nombre = it}, label = { Text("nombre del evento") }, isError = nombre.isBlank())
    Spacer(Modifier.height(10.dp))
    OutlinedTextField(value = categoria, onValueChange = {categoria = it}, label = { Text("ingrese la categoria del evento") }, isError = categoria.isBlank())
    Spacer(Modifier.height(10.dp))
    OutlinedTextField(value = fecha, onValueChange = {fecha = it}, label = { Text("ingrese la categoria del evento") }, isError = fecha.isBlank())
    Spacer(Modifier.height(10.dp))
    OutlinedTextField(value = detalle, onValueChange = {detalle = it}, label = { Text("ingrese la categoria del evento") }, isError = detalle.isBlank())

    Spacer(Modifier.height(40.dp))

    Button(
        onClick = {
            if(nombre.isNotBlank() && categoria.isNotBlank() && fecha.isNotBlank() && detalle.isNotBlank()){
                listaDeEventos.agregarEvento(nombre,categoria,fecha,detalle)
            }
    }){Text(("crear evento"))}



}