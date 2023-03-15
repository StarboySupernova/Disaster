package com.supernovaonline.disasterandenvironmentalmanagementtrust

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.supernovaonline.disasterandenvironmentalmanagementtrust.home.HomeScreen

@Composable
fun RootScreen() {
    Scaffold() { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
        ) {
            HomeScreen()
        }
    }
}