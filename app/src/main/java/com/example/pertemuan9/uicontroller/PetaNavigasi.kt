package com.example.pertemuan9.uicontroller

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun SiswaApp(navController: NavHostController = rememberNavController()){
    HostNavigasi(navController = navController)
}
