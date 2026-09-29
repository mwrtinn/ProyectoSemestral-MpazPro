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
fun HomeScreenExpandida(navController: NavController, viewModel: MainViewModel) {
    Scaffold(
        topBar = {
            @OptIn(ExperimentalMaterial3Api::class)
            TopAppBar(title = { Text(text = "Escuela Marcela Paz (Escritorio)") })
        }
    ) { innerPadding ->
        Row(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(48.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Bienvenido a MpazPro",
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.displaySmall
            )
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
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
}