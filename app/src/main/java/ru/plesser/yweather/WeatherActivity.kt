package ru.plesser.yweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import ru.plesser.yweather.databinding.ActivityWeatherBinding
import ru.plesser.yweather.fragments.CityFragment
import ru.plesser.yweather.fragments.WeatherFragment

class WeatherActivity : AppCompatActivity() {

    lateinit var binding: ActivityWeatherBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWeatherBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val currentFragment = supportFragmentManager.findFragmentById(R.id.fragment_container);
        if (currentFragment == null){
            val fragment = CityFragment()
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container, fragment)
                .commit()
        }


    }
}