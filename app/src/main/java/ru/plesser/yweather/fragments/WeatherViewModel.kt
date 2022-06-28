package ru.plesser.yweather.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gb.k_2135_2136_2.model.Repository
import com.gb.k_2135_2136_2.model.RepositoryLocalImpl
import com.gb.k_2135_2136_2.model.RepositoryRemoteImpl
import com.gb.k_2135_2136_2.viewmodel.AppState

class WeatherViewModel(private val liveData: MutableLiveData<AppState> = MutableLiveData<AppState>()): ViewModel() {

    lateinit var repository: Repository

    fun getLiveData(): MutableLiveData<AppState> {
        choiceRepository()
        return liveData
    }

    private fun choiceRepository(){
        repository = if(isConnection()){
            RepositoryRemoteImpl()
        }else{
            RepositoryLocalImpl()
        }
    }

    fun sentRequest() {
        //choiceRepository()
        liveData.value = AppState.Loading
        if((0..3).random()==2){ //FIXME
            liveData.postValue(AppState.Error("error"))
        }else{
            liveData.postValue(AppState.Success(repository.getWeather(55.755826, 37.617299900000035)))
        }

    }

    private fun isConnection(): Boolean {
        return false
    }

    override fun onCleared() { // TODO HW ***
        super.onCleared()
    }
}