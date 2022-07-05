package ru.plesser.yweather.data.geocoder

data class Country(
    val AddressLine: String,
    val AdministrativeArea: AdministrativeArea,
    val Country: CountryX,
    val CountryName: String,
    val CountryNameCode: String
)