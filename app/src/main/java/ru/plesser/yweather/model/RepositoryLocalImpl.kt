package com.gb.k_2135_2136_2.model

import ru.plesser.yweather.data.City
import ru.plesser.yweather.data.Weather

class RepositoryLocalImpl:Repository {
    override fun getListWeather(): List<City> {
        return listOf(City(123.0, 123.0))
    }

    override fun getWeather(lat: Double, lon: Double): City {
        return City(123.0, 123.0)
    }
}