package com.asoom.weatherapp.di

import com.asoom.data.datasource.CurrentWeatherRemoteDataSourceIMP
import com.asoom.data.remote.WeatherApiServices
import com.asoom.data.repo.CurrentWeatherRemoteRepoIMP
import com.asoom.features.datasource.CurrentWeatherRemoreDataSource
import com.asoom.features.repo.CurrentWeatherRemoteRepo
import com.asoom.features.usecase.GetCurrentWeather
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    fun provideWeatherDataSource(apiService: WeatherApiServices): CurrentWeatherRemoreDataSource {
        return CurrentWeatherRemoteDataSourceIMP(apiService)
    }

    @Provides
    fun provideWeatherRepository(dataSource: CurrentWeatherRemoreDataSource): CurrentWeatherRemoteRepo {
        return CurrentWeatherRemoteRepoIMP(dataSource)
    }

    @Provides
    fun provideGetWeatherUseCase(repository: CurrentWeatherRemoteRepo): GetCurrentWeather {
        return GetCurrentWeather(repository)
    }
}
