package com.supernovaonline.disasterandenvironmentalmanagementtrust

data class ProgrammesCollection (
    val title: String,
    val image: Int,
    var likes: Int
)

val collections = listOf<ProgrammesCollection>(
    ProgrammesCollection("3D Art", R.drawable.card_3d, 123),
    ProgrammesCollection("Abstract Art", R.drawable.card_abstract, 200),
    ProgrammesCollection("Portrait Art", R.drawable.card_portrait, 242),
    ProgrammesCollection("Metaverse", R.drawable.card_metaverse, 420)
)