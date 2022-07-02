package ru.plesser.yweather.learnkotlin

import java.util.*

class Data{
    private var datas = ArrayList<Note>()

    fun getDatas() = datas

    fun addNote(note: String, description: String){
        datas.add(Note(note, description))
    }

    fun getNotes() = datas

    companion object{
        private var datas: Data

        init {
            datas = Data()
        }

        fun newInstance() : Data{
            return datas
        }
    }
}


data class Note(var note: String, var description: String){
    var date: Date = Calendar.getInstance().time
}
