package ru.plesser.yweather.data

import java.util.*

data class Weather(val lat: Double = 55.755826, val lon: Double = 37.617299900000035, val url: String = "https://yandex.ru/pogoda/moscow") {
    var now: Int = 0
    var now_dt: Date = Calendar.getInstance().time
    var temp: Float = 0.0F
    var feels_like:Float  = 0.0F
    var icon: String = "ovc"
    var condition: String = "overcast"
    var wind_speed: Int = 0
    var wind_gust: Float = 0.0F
    var wind_dir: String = "n"
    var pressure_mm: Int = 745
    var pressure_pa: Int = 994
    var humidity: Int = 83
    var daytime: String = "d"
    var polar: Boolean = false
    var season: String = "summer"
    var obs_time: Long = 1470214800


}
