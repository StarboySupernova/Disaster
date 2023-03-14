package com.supernovaonline.disasterandenvironmentalmanagementtrust

import java.util.*

 data class Programme (
  val title: String,
  val subtitle: String,
  val image: Int,
  var likes: Int = 0,
  var eth: Double = 0.0,
  val id: UUID = UUID.randomUUID()
 )

val nfts = listOf<Programme>(
 Programme("Wave", "wav2 #5672", R.drawable.card_wave2, 5160, 0.018),
 Programme("Abstract Pink", "abstract #2538", R.drawable.card_pink, 1800, 0.906),
 Programme("Wave", "wavepi #5267", R.drawable.card_wave2, 2030, 0.26),
 Programme("Abstract23", "abstract #2038", R.drawable.card_abs23, 2060, 0.246),
 Programme("Music", "mali #7890", R.drawable.card_musicnft, 690, 0.03),
 Programme("Ball", "baalli #4890", R.drawable.card_ball, 1690, 0.46),
 Programme("Ring", "Ring #7288", R.drawable.card_ring, 400, 0.106),
 Programme("Beer", "beer #1238", R.drawable.card_beer, 200, 0.26)
)