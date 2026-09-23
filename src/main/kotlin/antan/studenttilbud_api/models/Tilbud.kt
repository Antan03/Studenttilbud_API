package antan.studenttilbud_api.models

import java.util.Date

data class Tilbud(
    val id: Int,
    val prosent: Int,
    val beskrivelse: String,
    val butikk_id: Int,
    val kategori: Kategori,
    val utlopsdato: Date,
)
