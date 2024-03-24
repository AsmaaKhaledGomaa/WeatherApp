package com.asoom.features.datasource

import com.asoom.features.entity.WeatherResponse


interface CurrentWeatherRemoreDataSource {
    suspend fun getCurrentWeather(cityName: String): WeatherResponse
}