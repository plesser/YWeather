package ru.plesser.yweather.data.geocoder

data class Address(
    val Components: List<Component>,
    val country_code: String,
    val formatted: String
)