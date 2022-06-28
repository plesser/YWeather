package com.gb.k_2135_2136_2.viewmodel

import ru.plesser.yweather.data.City

open class AppState {
    data class Success(val weatherData: City) : AppState()
    data class Error(val message: String) : AppState()
    object Loading : AppState()
}
