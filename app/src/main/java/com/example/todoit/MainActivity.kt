package com.example.todoit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.todoit.ui.theme.ToDOITTheme
import io.appwrite.Client
import io.appwrite.services.Account


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val client = Client(this)
            .setEndpoint("https://8080-appwrite-integrationfor-qvqaxm92pur.ws-us82.gitpod.io/v1")
            .setProject("63bed3fc198a51666ec4")
            .setSelfSigned(true) // For self signed certificates, only use for development

        setContent {
            ToDOITTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}