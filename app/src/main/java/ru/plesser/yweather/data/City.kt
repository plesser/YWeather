package ru.plesser.yweather.data

data class City(
    val lat: Double,
    val lon: Double,
){
    val name: String = ""
    val weather: Weather = Weather(lat, lon)

    companion object{
        private var city: City
        init {
            city = City(123.0, 123.0)
        }

        fun newInstance(): City{
            return city
        }

    }
}
