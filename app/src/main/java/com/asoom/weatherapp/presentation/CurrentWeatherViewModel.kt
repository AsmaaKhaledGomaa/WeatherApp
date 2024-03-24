package com.asoom.weatherapp.presentation


import androidx.lifecycle.ViewModel
import com.asoom.features.entity.WeatherResponse
import androidx.lifecycle.viewModelScope
import com.asoom.features.usecase.GetCurrentWeather
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class CurrentWeatherViewModel @Inject constructor(
    private val getCurrentWeather: GetCurrentWeather
) : ViewModel() {

    private val _weatherState: MutableStateFlow<WeatherViewState> =
        MutableStateFlow(WeatherViewState())
    val weatherState: StateFlow<WeatherViewState> = _weatherState

    fun getWeather(cityName: String) {
        viewModelScope.launch {
            try {
                val weather = getCurrentWeather(cityName)
                _weatherState.value = WeatherViewState(weather)
            } catch (e: Exception) {
                // Handle error
                _weatherState.value = WeatherViewState(error = "Failed to fetch weather")
            }
        }
    }
}

data class WeatherViewState(
    val weather: WeatherResponse? = null,
    val error: String? = null
)

