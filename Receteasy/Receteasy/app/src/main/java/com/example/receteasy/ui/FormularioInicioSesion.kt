import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp




///////////////////////////////////FUNCION FORMULARIO///////////////////////////////////
@Composable
fun FormularioInicioDeSesion() {
    var nombre by remember { mutableStateOf("") }
    var contrasena by remember { mutableStateOf("") }
    var ma by remember { mutableStateOf(false) }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Nombre")
        ///////////////////
        TextField(
            value = nombre,
            onValueChange = { nombre = it },
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
            placeholder = { Text(text = "Escribe tu nombre") }
        )
        /////////////////////////////////
        Spacer(modifier = Modifier.height(16.dp))
        ///////////////////////////////////
        Text(text = "Contraseña")
        ///////////////////////////////////
        TextField(
            value = contrasena,
            onValueChange = { contrasena = it },
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
            placeholder = { Text(text = "Escribe tu contraseña") }
        )
        ///////////////////////////////////
        Spacer(modifier = Modifier.height(16.dp))
        ///////////////////////////////////
        Button(onClick = {ma=true}) {
            Text(text = "Enviar")
        }
        ///////////////////////////////////
        if(ma) {
            //alertdialog
            AlertDialog(
                onDismissRequest = { },
                title = { Text("Bienvenido") },
                text = { Text("Iniciaste sesion con éxito") },
                confirmButton = {
                    TextButton(onClick = {ma=false}) {
                        Text("OK")
                    }

                }
            )
        }

    }//ultimo corchete de la funcion formulario

}



