package com.example.decomposemre

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
import com.arkivanov.decompose.retainedComponent
import com.example.decomposemre.root.RootComponent
import com.example.decomposemre.root.RootUI
import com.example.decomposemre.ui.theme.DecomposeMRETheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DecomposeMRETheme {
                val rootComponent = retainedComponent { componentContext ->
                    RootComponent(componentContext)
                }

                RootUI(rootComponent)
            }
        }
    }
}
