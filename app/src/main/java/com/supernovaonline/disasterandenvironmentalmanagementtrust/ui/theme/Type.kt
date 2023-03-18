package com.supernovaonline.disasterandenvironmentalmanagementtrust.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val DEMTTypography = Typography(
    h1 = TextStyle(
        color = Color.White,
        fontSize = 36.sp,
        fontWeight = FontWeight.Black
    ),
    h2 = TextStyle(
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp,
        color = Color.White
    ),
    h3 = TextStyle(
        fontSize = 24.sp,
        fontWeight = FontWeight.SemiBold,
        color = Color.White,
        textAlign = TextAlign.Center
    ),
    h4 = TextStyle(
        color = Color.White,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp,
        textAlign = TextAlign.Center
    ),
    h5 = TextStyle(
        color = Color.White,
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold
    ),
    h6 = TextStyle(
        fontSize = 17.sp,
        color = Color.White,
        fontWeight = FontWeight.SemiBold
    ),
    body1 = TextStyle(
        color = Color(235, 235, 245),
        textAlign = TextAlign.Center
    ),
    body2 = TextStyle(
        color = Color.White,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        textAlign = TextAlign.Center
    ),
    subtitle1 = TextStyle(
        color = Color.White,
        fontWeight = FontWeight.SemiBold,
        fontSize = 13.sp,
        textAlign = TextAlign.Left
    ),
    subtitle2 = TextStyle(
        color = Color(235, 235, 245).copy(0.6f),
        fontSize = 13.sp,
        textAlign = TextAlign.Right
    ),
    button = TextStyle(
        fontSize = 15.sp,
        fontWeight = FontWeight.SemiBold
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)