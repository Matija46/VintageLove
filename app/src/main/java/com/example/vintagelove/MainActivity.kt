package com.example.vintagelove

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.vintagelove.ui.theme.VintageLoveTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        println("start")
        setContent {
            VintageLoveTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainScreen(
                        modifier = Modifier.padding(innerPadding),
                        onLoginClick = {
                            println("on login");
                            // Navigate to LoginActivity
                            val intent = Intent(this, LoginActivity::class.java)
                            startActivity(intent)
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun MainScreen(modifier: Modifier = Modifier, onLoginClick: () -> Unit) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Welcome to Vintage Love!",
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Button(onClick = onLoginClick, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Go to Login")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    VintageLoveTheme {
        MainScreen(onLoginClick = {})
    }
}
