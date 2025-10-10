package cl.duoc.receteasy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import cl.duoc.receteasy.ui.Formulario
import cl.duoc.receteasy.ui.theme.ReceteasyTheme
import cl.duoc.receteasy.viewmodel.FormularioViewModel

class MainActivity : ComponentActivity() {

    private val viewModel = FormularioViewModel()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ReceteasyTheme {
                Formulario(viewModel)
            }




        }
    }



}
