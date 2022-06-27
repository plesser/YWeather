package com.gb.k_2135_2136_2.model

import ru.plesser.yweather.data.City
import ru.plesser.yweather.data.Weather


class RepositoryRemoteImpl:Repository {
    override fun getListWeather(): List<City> {
        Thread{
            Thread.sleep(200L)
        }.start()
        return listOf(City(123.0, 123.0))
    }

    override fun getWeather(lat: Double, lon: Double): City {
        Thread{
            Thread.sleep(300L)
        }.start()
        return City(123.0, 123.0)
    }
}