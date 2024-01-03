package com.jayakarta.projectanver.network.Movies

import retrofit2.http.GET


interface MoviesAPI {

    @GET("api/movies")
    suspend fun getMovies(): ResponseMovies
}
