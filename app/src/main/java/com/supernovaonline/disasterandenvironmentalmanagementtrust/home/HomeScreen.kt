package com.supernovaonline.disasterandenvironmentalmanagementtrust.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.supernovaonline.disasterandenvironmentalmanagementtrust.ui.theme.DisasterAndEnvironmentalManagementTrustTheme

@Composable
fun HomeScreen() {
    Scaffold(
        backgroundColor = Color(33, 17, 52)
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            CategoryList()
        }
    }
}

@Preview
@Composable
fun PreviewHomeScreen() {
    DisasterAndEnvironmentalManagementTrustTheme {
        HomeScreen()
    }
}