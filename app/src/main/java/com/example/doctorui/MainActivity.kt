package com.example.doctorui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.doctorui.presentation.screen.HomeScreen
import com.example.doctorui.presentation.screen.MainScreen
import com.example.doctorui.ui.theme.DoctorUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DoctorUITheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) {innerpadding ->
                    MainScreen(modifier = Modifier.padding(paddingValues = innerpadding))
                }
            }
        }
    }
}

