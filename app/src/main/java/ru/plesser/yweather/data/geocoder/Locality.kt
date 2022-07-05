package ru.plesser.yweather.data.geocoder

data class Locality(
    val DependentLocality: DependentLocality,
    val LocalityName: String,
    val Premise: Premise,
    val Thoroughfare: Thoroughfare
)