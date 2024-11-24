package com.example.vintagelove

import LoginScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.vintagelove.ui.theme.VintageLoveTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VintageLoveTheme {
                LoginScreen { email, password ->
                    // Handle login action
                    finish() // Close LoginActivity and return to MainActivity
                }
            }
        }
    }
}