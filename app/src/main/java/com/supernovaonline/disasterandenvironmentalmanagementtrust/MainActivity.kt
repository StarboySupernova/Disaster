package com.supernovaonline.disasterandenvironmentalmanagementtrust

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.supernovaonline.disasterandenvironmentalmanagementtrust.ui.theme.DisasterAndEnvironmentalManagementTrustTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DisasterAndEnvironmentalManagementTrustTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Text("Hello Jetpack Compose")
                }
            }
        }
    }
}

@Composable
fun OnBoardingCard() {
    Card {
        Image(
            painter = painterResource(id = R.drawable.cardblur),
            contentDescription = "Card background",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(27.dp)
        ) {
            Text(
                "Disaster and Environmental Management Trust",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                textAlign = TextAlign.Center
            )
            Text(
                "Promoting environmental preservation strategies, awareness and sustainability actions at a grassroots level",
                color = Color.White.copy(0.8f),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.padding(bottom = 27.dp))
            Button(onClick = { /*TODO*/ }, shape = RoundedCornerShape(percent = 50), modifier = Modifier.border(
                width = 1.dp,
                color = Color.White.copy(0.5f),
                shape = RoundedCornerShape(percent = 50)
            )) {
                Text(
                    "Get Started Now",
                    modifier = Modifier.padding(horizontal = 40.dp, vertical = 4.dp),
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }

}

@Preview
@Composable
fun CardPreview () {
    DisasterAndEnvironmentalManagementTrustTheme {
        OnBoardingCard()
    }
}

