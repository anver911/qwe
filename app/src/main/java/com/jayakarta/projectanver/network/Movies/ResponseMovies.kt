package com.jayakarta.projectanver.network.Movies

data class ResponseMovies(
    val success : Boolean,
    val data : List<Movies>
)