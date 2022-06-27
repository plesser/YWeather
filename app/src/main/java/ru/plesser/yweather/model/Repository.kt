package com.gb.k_2135_2136_2.model

import ru.plesser.yweather.data.City


interface Repository {
    fun getListWeather():List<City>
    fun getWeather( lat: Double, lon: Double): City
}