package com.example.mpazpro.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mpazpro.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreenCompacta() {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Escuela Marcela Paz") })
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(paddingValues = innerPadding)
                .fillMaxSize()
                .padding(all = 16.dp),
            verticalArrangement = Arrangement.spacedBy(space = 28.dp)
        ) {
            Text(
                text = "¡Bienvenido a MpazPro!",
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.titleLarge
            )
            Button(onClick = { /* accion futura */ }) {
                Text(text = "Ingresar al Portal")
            }
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo Escuela Marcela Paz",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(height = 150.dp),
                contentScale = ContentScale.Fit
            )
        }
    }
}