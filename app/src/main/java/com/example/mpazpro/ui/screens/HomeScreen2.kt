package com.example.mpazpro.ui.screens

import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.mpazpro.ui.utils.obtenerWindowSizeClass
import com.example.mpazpro.viewmodel.MainViewModel

@Composable
fun HomeScreen2(
    navController: NavController,
    viewModel: MainViewModel
) {
    val windowSizeClass = obtenerWindowSizeClass()

    when (windowSizeClass.widthSizeClass) {
        WindowWidthSizeClass.Compact -> HomeScreenCompacta(navController, viewModel)
        WindowWidthSizeClass.Medium -> HomeScreenMediana(navController, viewModel)
        WindowWidthSizeClass.Expanded -> HomeScreenExpandida(navController, viewModel)
    }
}

