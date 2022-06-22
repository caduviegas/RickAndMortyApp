package com.innaval.domain.model

data class Episode(
    var air_date: String,
    val characters: List<Int>,
    val episode: String,
    val id: Int,
    val name: String,
)