package com.asoom.data.repo

import com.asoom.features.datasource.CurrentWeatherRemoreDataSource
import com.asoom.features.repo.CurrentWeatherRemoteRepo
import com.asoom.features.entity.WeatherResponse

class CurrentWeatherRemoteRepoIMP (
    private val currentWeatherRemoreDataSource: CurrentWeatherRemoreDataSource
): CurrentWeatherRemoteRepo {
    override suspend fun getCurrentWeather(cityName: String): WeatherResponse {
        return currentWeatherRemoreDataSource.getCurrentWeather(cityName)
    }

}
