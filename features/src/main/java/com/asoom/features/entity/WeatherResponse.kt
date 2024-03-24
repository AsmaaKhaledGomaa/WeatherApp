package com.asoom.features.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "weather")
data class WeatherResponse(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    @field:SerializedName("id")
    val id: Int? = null,

    @field:SerializedName("rain")
    @ColumnInfo
    val rain: Rain? = null,

    @field:SerializedName("visibility")
    @ColumnInfo
    val visibility: Int? = null,

    @field:SerializedName("timezone")
    @ColumnInfo
    val timezone: Int? = null,

    @field:SerializedName("main")
    @ColumnInfo
    val main: Main? = null,

    @field:SerializedName("clouds")
    @ColumnInfo
    val clouds: Clouds? = null,

    @field:SerializedName("sys")
    @ColumnInfo
    val sys: Sys? = null,

    @field:SerializedName("dt")
    @ColumnInfo
    val dt: Int? = null,

    @field:SerializedName("coord")
    @ColumnInfo
    val coord: Coord? = null,

    @field:SerializedName("weather")
    @ColumnInfo
    val weather: List<WeatherItem?>? = null,

    @field:SerializedName("name")
    @ColumnInfo
    val name: String? = null,

    @field:SerializedName("cod")
    @ColumnInfo
    val cod: Int? = null,

    @field:SerializedName("base")
    @ColumnInfo
    val base: String? = null,

    @field:SerializedName("wind")
    @ColumnInfo
    val wind: Wind? = null
)

data class Sys(

    @field:SerializedName("country")
    @ColumnInfo
    val country: String? = null,

    @field:SerializedName("sunrise")
    @ColumnInfo
    val sunrise: Int? = null,

    @field:SerializedName("sunset")
    @ColumnInfo
    val sunset: Int? = null,

    @field:SerializedName("id")
    @ColumnInfo
    val id: Int? = null,

    @field:SerializedName("type")
    @ColumnInfo
    val type: Int? = null
)

data class Rain(

    @field:SerializedName("1h")
    @ColumnInfo
    val jsonMember1h: Any? = null
)

data class Coord(

    @field:SerializedName("lon")
    @ColumnInfo
    val lon: Any? = null,

    @field:SerializedName("lat")
    @ColumnInfo
    val lat: Any? = null
)

data class WeatherItem(

    @field:SerializedName("icon")
    @ColumnInfo
    val icon: String? = null,

    @field:SerializedName("description")
    @ColumnInfo
    val description: String? = null,

    @field:SerializedName("main")
    @ColumnInfo
    val main: String? = null,

    @field:SerializedName("id")
    @ColumnInfo
    val id: Int? = null
)

data class Wind(

    @field:SerializedName("deg")
    @ColumnInfo
    val deg: Int? = null,

    @field:SerializedName("speed")
    @ColumnInfo
    val speed: Any? = null
)

data class Clouds(

    @field:SerializedName("all")
    @ColumnInfo
    val all: Int? = null
)

data class Main(

    @field:SerializedName("temp")
    @ColumnInfo
    val temp: Any? = null,

    @field:SerializedName("temp_min")
    @ColumnInfo
    val tempMin: Any? = null,

    @field:SerializedName("humidity")
    @ColumnInfo
    val humidity: Int? = null,

    @field:SerializedName("pressure")
    @ColumnInfo
    val pressure: Int? = null,

    @field:SerializedName("feels_like")
    @ColumnInfo
    val feelsLike: Any? = null,

    @field:SerializedName("temp_max")
    @ColumnInfo
    val tempMax: Any? = null
)
