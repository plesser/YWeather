package ru.plesser.yweather.data

data class City(
    val lat: Double,
    val lon: Double,
){
    val name: String = ""
    val weather: Weather = Weather(lat, lon)
}
