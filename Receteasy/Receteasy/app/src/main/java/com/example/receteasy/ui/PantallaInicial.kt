package com.example.receteasy.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PantallaPrincipal() {




    // Layout de columna centrado
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize() // Ocupa todo el espacio disponible
    ) {

        Text(
            text = "RECETEASY",
            style = TextStyle(
                color = Color.Red, // Color de texto
                fontSize = 45.sp,    // Tamaño de la fuente
                fontWeight = FontWeight.Bold, // Negrita
                fontFamily = FontFamily.Serif // Tipografía
            )
        )
        Spacer(modifier = Modifier.height(16.dp))

        //
        Button(onClick = { }) {
            Text(text = "Iniciar sesión")
        }

        Spacer(modifier = Modifier.height(16.dp))


        Button(onClick = { }) {
            Text("Registrate")
        }
    }///fin del layout en columna



}
