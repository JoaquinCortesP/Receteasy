package com.example.receteasy


import FormularioInicioDeSesion
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.receteasy.ui.PantallaPrincipal
import com.example.receteasy.ui.theme.ReceteasyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ReceteasyTheme {
                PantallaPrincipal()
            }

        }
    }
}
