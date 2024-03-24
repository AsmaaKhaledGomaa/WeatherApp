package com.asoom.features.usecase

import com.asoom.features.entity.WeatherResponse
import com.asoom.features.repo.CurrentWeatherRemoteRepo


class GetCurrentWeather (private val currentWeatherRemoteRepo: CurrentWeatherRemoteRepo) {
    suspend operator fun invoke(cityName: String): WeatherResponse {
        return currentWeatherRemoteRepo.getCurrentWeather(cityName)
    }
}
