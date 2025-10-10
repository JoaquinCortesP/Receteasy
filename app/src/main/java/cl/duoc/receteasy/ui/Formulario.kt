package cl.duoc.receteasy.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import cl.duoc.receteasy.viewmodel.FormularioViewModel


@Composable
fun Formulario(viewModel: FormularioViewModel) {

    var abrirModal by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = viewModel.formulario.nombre,
            onValueChange = { viewModel.formulario.nombre = it },
            label = { Text("Ingresa nombre") },
            isError = !viewModel.verificarNombre(),
            supportingText = { Text( viewModel.mensajesError.nombre, color = androidx.compose.ui.graphics.Color.Red) }
        )
        OutlinedTextField(
            value = viewModel.formulario.correo,
            onValueChange = { viewModel.formulario.correo = it },
            label = { Text("Ingresa correo") },
            isError = !viewModel.verificarCorreo(),
            supportingText = { Text( viewModel.mensajesError.correo, color = androidx.compose.ui.graphics.Color.Red) }
        )
        OutlinedTextField(
            value = viewModel.formulario.edad,
            onValueChange = { viewModel.formulario.edad = it },
            label = { Text("Ingresa edad") },
            isError = !viewModel.verificarEdad(),
            supportingText = { Text( viewModel.mensajesError.edad, color = androidx.compose.ui.graphics.Color.Red) }
        )
        Checkbox(
            checked = viewModel.formulario.terminos,
            onCheckedChange = { viewModel.formulario.terminos = it },
        )
        Text("Acepta los términos")

        Button(
            enabled = viewModel.verificarFormulario(),
            onClick = {
                if(viewModel.verificarFormulario()) {
                    abrirModal = true
                }
            }
        ) {
            Text("Enviar")
        }

        if (abrirModal) {
            AlertDialog(
                onDismissRequest = { },
                title = { Text("Confirmación") },
                text = { Text("Formulario enviado correctamente") },
                confirmButton = {
                    Button(onClick = { abrirModal = false }) { Text("OK") }
                }
            )
        }

    }
}