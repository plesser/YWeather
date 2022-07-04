package ru.plesser.yweather.fragments

import android.app.Application
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import ru.plesser.yweather.adapter.CitiesAdapter
import ru.plesser.yweather.data.CityItem
import ru.plesser.yweather.databinding.FragmentCitiesBinding
import ru.plesser.yweather.databinding.FragmentWeatherBinding
import ru.plesser.yweather.utils.Assets
import java.io.InputStream

private val TAG = "CityFragment"

class CityFragment : Fragment() {
    private lateinit var binding: FragmentCitiesBinding
    private lateinit var viewModel: WeatherViewModel

    private lateinit var adapter: CitiesAdapter
    private var citiesItem: List<CityItem> = ArrayList<CityItem>()

    private lateinit var geocoder: String

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCitiesBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        geocoder = Assets.getKeyGeocoder(requireActivity().getApplicationContext() as Application)
        Log.d(TAG, geocoder)

        binding.citiesRecyclerview.layoutManager = LinearLayoutManager(activity)
        adapter = CitiesAdapter(citiesItem, activity)
        binding.citiesRecyclerview.adapter = adapter
    }


}