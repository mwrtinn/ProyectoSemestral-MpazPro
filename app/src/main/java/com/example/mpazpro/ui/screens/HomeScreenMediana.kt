package com.example.mpazpro.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.mpazpro.navigation.Screen
import com.example.mpazpro.viewmodel.MainViewModel

@Composable
fun HomeScreenMediana(navController: NavController, viewModel: MainViewModel) {
    Scaffold(
        topBar = {
            @OptIn(ExperimentalMaterial3Api::class)
            TopAppBar(title = { Text(text = "Escuela Marcela Paz (Tablet)") })
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(32.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Bienvenido a MpazPro",
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.headlineMedium
            )
            Spacer(modifier = Modifier.height(30.dp))
            Button(onClick = { viewModel.navigateTo(Screen.Settings) }) {
                Text(text = "Ingresar al Portal")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { viewModel.navigateTo(Screen.Profile) }) {
                Text(text = "Ir a Perfil")
            }
        }
    }
}