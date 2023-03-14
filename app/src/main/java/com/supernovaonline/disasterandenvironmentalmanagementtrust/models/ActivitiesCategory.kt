package com.supernovaonline.disasterandenvironmentalmanagementtrust

import java.util.*

data class ActivitiesCategory(
    val title: String,
    val image: Int,
    val id: UUID = UUID.randomUUID()
)

val categories = listOf<ActivitiesCategory>(
    ActivitiesCategory("Music", R.drawable.card_music),
    ActivitiesCategory("Art", R.drawable.card_art),
    ActivitiesCategory("Virtual Worlds", R.drawable.card_vw)
)