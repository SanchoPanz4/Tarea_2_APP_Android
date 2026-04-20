package com.example.event_master


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.event_master.listaDeCategorias
import com.example.event_master.listaDeEventos
import java.util.Date



fun testVars(){
    listaDeCategorias.agregarCategoria("deportes", Color.Red);
    listaDeCategorias.agregarCategoria("musica",Color.Blue);
    listaDeCategorias.agregarCategoria("otros",Color.Green);

    listaDeEventos.agregarEvento("torneo regional",listaDeCategorias.getNombrebyindex(0), "2012-01-21","lorem ipsum....")
    listaDeEventos.agregarEvento("REC concepcion",listaDeCategorias.getNombrebyindex(1), "2012-01-21","lorem ipsum....")
    listaDeEventos.agregarEvento("torneo cartitas",listaDeCategorias.getNombrebyindex(2), "2012-01-21","lorem ipsum....")


}



@Composable
fun AgregarCategoria(navController: NavHostController){
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Row(modifier = Modifier
                .fillMaxSize()
                .padding(1.dp)
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            LazyVerticalGrid(columns = GridCells.Adaptive(minSize = 30.dp)) {
                item(span = {
                    // LazyGridItemSpanScope:
                    // maxLineSpan
                    GridItemSpan(maxLineSpan)
                }) {
                    Text("1")
                }
                // ...
            }
        }


        Button(onClick = {navController.navigate(Detalle)}) { }
    }
}