package com.asoom.data.remote

import com.asoom.features.entity.WeatherResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiServices {
    @GET("weather")
    suspend fun getCurrentWeather(
        @Query("q") city: String,
        @Query("appid") apiKey: String = "292c9de7aca02008651352377e4bf480"
    ): Response<WeatherResponse>
}
