package com.supernovaonline.disasterandenvironmentalmanagementtrust.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.supernovaonline.disasterandenvironmentalmanagementtrust.R
import com.supernovaonline.disasterandenvironmentalmanagementtrust.ui.theme.DisasterAndEnvironmentalManagementTrustTheme

@Composable
fun OnBoardingScreen() {
    Scaffold { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
        ) {
            Box {
                Image (
                    painter = painterResource(id = R.drawable.bg1),
                    contentDescription = "Background Image",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
                Column(
                    Modifier
                        .padding(horizontal = 32.dp, vertical = 80.dp) /*TODO - Remember that Button text does not display on some devices dependent on the value of the vertical dp */
                        .fillMaxSize()
                ) {
                    Text(
                        "Welcome to D.E.M.T.",
                        color = Color.White,
                        fontSize = 36.sp,
                        fontWeight = FontWeight.Black
                    )
                    Spacer(modifier = Modifier.fillMaxSize(0.65f))
                    Card (
                        elevation = 4.dp,
                        modifier = Modifier
                            .border(
                                width = 1.dp,
                                color = Color.White.copy(0.1f),
                                shape = RoundedCornerShape(27.dp)
                            )
                            .clip(RoundedCornerShape(27.dp))
                    ) {
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
                                "Promoting environmental preservation strategies",
                                color = Color.White.copy(0.8f),
                                textAlign = TextAlign.Center
                            )
                            Spacer(modifier = Modifier.padding(bottom = 27.dp))
                            Button(onClick = { /*TODO*/ }, shape = RoundedCornerShape(percent = 50), modifier = Modifier.border(
                                width = 1.dp,
                                color = Color.White.copy(0.5f),
                                shape = RoundedCornerShape(percent = 50)
                            )
                                , colors = ButtonDefaults.buttonColors(
                                    backgroundColor = Color(151, 169, 246, alpha = 0x32),
                                    contentColor = Color.White
                                )
                            ) {
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
            }
        }
    }
}

@Preview
@Composable
fun CardPreview () {
    DisasterAndEnvironmentalManagementTrustTheme {
        OnBoardingScreen()
    }
}