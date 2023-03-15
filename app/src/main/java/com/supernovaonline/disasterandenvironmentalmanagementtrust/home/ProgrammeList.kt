package com.supernovaonline.disasterandenvironmentalmanagementtrust.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.supernovaonline.disasterandenvironmentalmanagementtrust.programmes
import com.supernovaonline.disasterandenvironmentalmanagementtrust.ui.theme.DisasterAndEnvironmentalManagementTrustTheme

@Composable
fun ProgrammeList() {
    LazyRow(
        modifier = Modifier.padding(bottom = 30.dp, top = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(programmes) { programme ->
            ProgrammeCard(
                title = programme.title,
                subtitle = programme.subtitle,
                image = painterResource(id = programme.image),
                likes = programme.likes,
                eth = programme.eth
            )
        }
    }
}

@Preview
@Composable
fun PreviewNFTList() {
    DisasterAndEnvironmentalManagementTrustTheme {
        ProgrammeList()
    }
}