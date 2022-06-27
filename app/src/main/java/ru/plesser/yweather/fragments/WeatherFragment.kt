package ru.plesser.yweather.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.gb.k_2135_2136_2.viewmodel.AppState
import ru.plesser.yweather.databinding.FragmentWeatherBinding

class WeatherFragment : Fragment(){

    lateinit var binding: FragmentWeatherBinding
    lateinit var viewModel: WeatherViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWeatherBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(WeatherViewModel::class.java)
        viewModel.getLiveData().observe(viewLifecycleOwner,object : Observer<AppState> {
            override fun onChanged(t: AppState) {
                renderData(t)
            }
        })
        viewModel.sentRequest()
    }

    companion object {
        fun newInstance() = WeatherFragment()
    }



    private fun renderData(appState: AppState){
        when (appState){
            is AppState.Error -> {/*TODO HW*/ }
            AppState.Loading -> {/*TODO HW*/}
            is AppState.Success -> {
                val result = appState.weatherData
                binding.cityTextview.text = result.name
                binding.tempTextview.text = result.weather.temp.toString()
            }
        }
    }

}