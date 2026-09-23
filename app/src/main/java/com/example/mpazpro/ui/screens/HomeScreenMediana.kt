package com.example.mpazpro.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreenMediana() {
    Scaffold(
        topBar = { TopAppBar(title = { Text(text = "Escuela Marcela Paz - Tablet") }) }
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding).fillMaxSize().padding(32.dp)
        ) {
            Text(text = "Vista Mediana Activada", style = MaterialTheme.typography.titleLarge)
        }
    }
}