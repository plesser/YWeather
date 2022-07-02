package ru.plesser.yweather.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.plesser.yweather.databinding.FragmentCitiesBinding
import ru.plesser.yweather.databinding.FragmentWeatherBinding

class CityFragment : Fragment() {
    lateinit var binding: FragmentCitiesBinding
    lateinit var viewModel: WeatherViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCitiesBinding.inflate(inflater)
        return binding.root
    }

}