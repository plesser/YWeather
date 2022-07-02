package ru.plesser.yweather.learnkotlin

fun main(args : Array<String>){
    println("Hello world!")

    val datasBase = Data.newInstance()
    datasBase.addNote("Первая запись", "Описание первой записи")
    datasBase.addNote("Вторая запись", "Описание второй записи")
    datasBase.addNote("Третья запись", "Описание третьей записи")

    for (nc in datasBase.getDatas()){
        println("${nc.note}  |${nc.description}  |${nc.date.toString()}")
    }

    println("------------------------------------------------------------")
    // проверяем что мы работаем с одним и тем же объектом
    val datasAdditional = Data.newInstance()
    for (nc in datasAdditional.getDatas()){
        println("${nc.note}  |${nc.description}  |${nc.date.toString()}")
    }

    println("------------------------------------------------------------")
    // делаем копию объекта
    for (nc in datasAdditional.getDatas()){
        val ncCopy = nc.copy()
        println("${ncCopy.note}  |${ncCopy.description}  |${ncCopy.date.toString()}")
    }

    println("------------------------------------------------------------")
    datasBase.getDatas().forEach {
        println("${it.note}  |${it.description}  |${it.date} ")
    }

    println("------------------------------------------------------------")
    repeat(datasBase.getDatas().size) {
        println("${datasBase.getDatas()[it]}")
    }

    println("------------------------------------------------------------")
    for(i in datasBase.getDatas().indices){
        println("${datasBase.getDatas()[i]}")
    }

    println("------------------------------------------------------------")
    for(i in 0 until datasBase.getDatas().size){
        println("${datasBase.getDatas()[i]}")
    }

    println("------------------------------------------------------------")
    for(i in datasBase.getDatas().size-1 downTo 0){
        println("${datasBase.getDatas()[i]}")
    }

    println("------------------------------------------------------------")
    var counter = datasBase.getDatas().size-1
    while (counter >= 0){
        println("${datasBase.getDatas()[counter]}")
        counter--
    }

    println("------------------------------------------------------------")
   counter = datasBase.getDatas().size-1
    do{
        println("${datasBase.getDatas()[counter]}")
        counter--
    }while (counter >= 0)

    counter = datasBase.getDatas().size
    val cntString = when (counter){
        0 -> "Нет записей"
        1 -> "Одна запись"
        2 -> "Две запись"
        3 -> "Три запись"
        else -> "А фиг его знает сколько записей"
    }



    println("Goodbye cry world")
}