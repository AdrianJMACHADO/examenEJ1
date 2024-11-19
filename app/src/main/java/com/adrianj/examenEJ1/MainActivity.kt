package com.adrianj.examenEJ1

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.listSaver
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.adrianj.examenEJ1.ui.theme.ExamenEJ1Theme
import com.adrianj.examenEJ1.productos.Productos

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExamenEJ1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    principal(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun prevprin(){
    principal()
}

@Composable
fun principal(modifier: Modifier = Modifier) {
    var productos = listOf(
        Productos(
            "Producto 1",
            15.0,
            "https://loremflickr.com/400/400/seville?lock=1"
        ),
        Productos(
            "Producto 2",
            20.0,
            "https://loremflickr.com/400/400/seville?lock=2"
        ),
        Productos(
            "Producto 3",
            25.0,
            "https://loremflickr.com/400/400/seville?lock=3"
        )
    )
    LazyColumn(modifier = Modifier.padding(all = 13.dp)) {
        item {
            mostrarProductos()
        }
    }
}

@Composable
fun mostrarProductos(nombre: String, precio: Double, image: Image){
    Text(text = nombre)
    Text(text = precio.toString())
    Image(image)
}