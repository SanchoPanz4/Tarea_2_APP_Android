package com.example.event_master.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
    import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.event_master.R

@Composable
fun GestionCategoriaScreen(formViewMdole: CategoriaViewMdole,navController: NavHostController){

    Scaffold(

    ) {innerPadding->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            TextField(
                value = formViewMdole.tipo,
                onValueChange = {formViewMdole.tipo = it},
                label = { Text((stringResource(R.string.tipo_label))) },
                isError = formViewMdole.tipo.isBlank() || formViewMdole.tipo.length <5
            )
            Spacer(modifier = Modifier.size(22.dp))
            TextField(
                value = formViewMdole.descripcion,
                onValueChange = {formViewMdole.descripcion = it},
                label = { Text((stringResource(R.string.descripcion_label))) },
                isError = formViewMdole.descripcion.isBlank() || formViewMdole.descripcion.length <5
            )
            Spacer(modifier = Modifier.size(22.dp))
            Button(onClick = {
                formViewMdole.addEvento()
                },
                ) {
                Text(stringResource(R.string.tipo_label))
            }
            Button(onClick = {navController.navigate(Home)},
            ) {
                Text(stringResource(R.string.iralista_label))
            }
        }
    }
}