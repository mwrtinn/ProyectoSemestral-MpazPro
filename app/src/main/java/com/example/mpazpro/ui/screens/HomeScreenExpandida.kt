package com.example.mpazpro.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreenExpandida() {
    Scaffold(
        topBar = { TopAppBar(title = { Text(text = "Escuela Marcela Paz - PC") }) }
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding).fillMaxSize().padding(48.dp)
        ) {
            Text(text = "Vista Expandida Activada", style = MaterialTheme.typography.headlineMedium)
        }
    }
}

