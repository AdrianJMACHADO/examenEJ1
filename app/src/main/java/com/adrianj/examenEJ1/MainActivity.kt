package com.adrianj.examenEJ1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.listSaver
import androidx.compose.ui.Modifier
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
                principal()
            }
        }
    }
}

@Preview
@Composable
fun principal() {
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
            productos
        }
    }
}