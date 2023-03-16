package com.supernovaonline.disasterandenvironmentalmanagementtrust.stats

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.supernovaonline.disasterandenvironmentalmanagementtrust.rankings
import com.supernovaonline.disasterandenvironmentalmanagementtrust.ui.theme.DisasterAndEnvironmentalManagementTrustTheme

@Composable
fun StatsScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                content = {
                    Column {
                        Text(
                            "Stats",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }
                },
                backgroundColor = Color.Transparent,
                elevation = 0.dp
            )
        },
        backgroundColor = Color(33, 17, 52)
    ) { padding ->
        Column(
            Modifier.padding(bottom = 30.dp)
        ) {
            Card(
                backgroundColor = Color.White.copy(0.15f),
                elevation = 0.dp,
                border = BorderStroke(1.5.dp, Color.White.copy(0.5f)),
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier.padding(16.dp, 20.dp)
            ) {
                RankingTable(rankings)
            }
        }
    }
}

@Preview
@Composable
fun StatScreenPreview() {
    DisasterAndEnvironmentalManagementTrustTheme {
        StatsScreen()
    }
}