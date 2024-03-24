package com.asoom.data.datasource

import com.asoom.data.remote.WeatherApiServices
import com.asoom.features.datasource.CurrentWeatherRemoreDataSource
import com.asoom.features.entity.WeatherResponse

class CurrentWeatherRemoteDataSourceIMP
    (
    private val weatherApiService: WeatherApiServices
) : CurrentWeatherRemoreDataSource {
    override suspend fun getCurrentWeather(cityName: String): WeatherResponse {
        return weatherApiService.getCurrentWeather(cityName).body()!!
    }
}