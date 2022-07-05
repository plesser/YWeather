package ru.plesser.yweather.learnkotlin

import android.os.Build
import androidx.annotation.RequiresApi
import java.io.*
import java.net.HttpURLConnection
import java.net.URI
import java.net.URL
import java.util.stream.Collectors

fun main(args : Array<String>){
    println("Hello world")

    val url = URL("https://rbc.ru")
    var myConnection: HttpURLConnection? = null
    myConnection = url.openConnection() as HttpURLConnection
    myConnection.readTimeout = 5000

    val reader = BufferedReader(InputStreamReader(myConnection.inputStream))


    val result = reader.lines().collect(Collectors.joining("\n"))
    println(result)


    println("Goodbye world")
}