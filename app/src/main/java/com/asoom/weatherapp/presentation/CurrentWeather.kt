@file:OptIn(ExperimentalMaterial3Api::class)

package com.asoom.weatherapp.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun WeatherApp(weatherViewModel: CurrentWeatherViewModel = hiltViewModel()) {
    val cityName = remember { mutableStateOf("") }

    val weatherState by remember { weatherViewModel.weatherState }.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = cityName.value,
            onValueChange = { cityName.value = it },
            label = { Text("Enter city name") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { weatherViewModel.getWeather(cityName.value) }) {
            Text("Get Weather")
        }

        Spacer(modifier = Modifier.height(16.dp))

        weatherState.weather?.let { weather ->
            Text(
                text = "Temperature: ${weather.main!!.temp}°C\nCondition: ${weather.rain}",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        }

        weatherState.error?.let { error ->
            Text(
                text = "Error: $error",
                color = Color.Red,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        }
    }
}

