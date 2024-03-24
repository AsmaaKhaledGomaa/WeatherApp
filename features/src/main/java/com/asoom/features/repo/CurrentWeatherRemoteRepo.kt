package com.asoom.features.repo

import com.asoom.features.entity.WeatherResponse

interface CurrentWeatherRemoteRepo {
    suspend fun getCurrentWeather(cityName: String): WeatherResponse
}
