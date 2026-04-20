package com.example.event_master

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import kotlinx.serialization.Serializable

@Serializable
object Home

@Serializable
object Detalle
@Serializable
object Gestion

@Serializable
object Registro


@Composable
fun Navigation() {
    val navController = rememberNavController() //controlador principal del navegator, a traves de el se pasan estados y cambios entre las distintas pestañas

    NavHost(navController = navController, startDestination = Home)
    {
        composable<Home>
        {
            HomeScreen(navController = navController)
        }
        composable<Detalle>
        {backStackEntry ->
            val args = backStackEntry.toRoute<Detalle>()
            DetalleScreen(navController = navController)
        }
    }
}