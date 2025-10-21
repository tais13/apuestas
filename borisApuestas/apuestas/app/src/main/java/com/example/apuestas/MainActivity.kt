package com.example.apuestas


import RegistroScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import com.example.apuestas.ui.MenuPrincipalScreen
import com.example.apuestas.ui.theme.ApuestasTheme

@ExperimentalMaterial3Api
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ApuestasTheme {
                MenuPrincipalScreen()

            }
        }
    }
}
