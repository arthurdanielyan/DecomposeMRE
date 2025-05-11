package com.example.decomposemre.screenA

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.decomposemre.root.RootComponent
import com.example.decomposemre.screenB.ScreenBComponent

@Composable
fun ScreenAUI(
    component: ScreenAComponent
) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(
            alignment = Alignment.CenterVertically,
            space = 16.dp
        )
    ) {
        Text(
            text = "Screen A",
            fontSize = 28.sp,
            color = Color.Red
        )
        Button(
            onClick = component::onClick
        ) {
            Text(
                text = "Navigate to Screen B"
            )
        }
    }
}