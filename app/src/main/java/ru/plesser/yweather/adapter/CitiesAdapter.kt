package ru.plesser.yweather.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import ru.plesser.yweather.R
import ru.plesser.yweather.data.CityItem
import ru.plesser.yweather.databinding.ItemCityBinding

class CitiesAdapter(var cities: List<CityItem>, val activity: FragmentActivity?): RecyclerView.Adapter<CitiesAdapter.CityHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityHolder {
        val layoutInflater = LayoutInflater.from(activity)
        val view = layoutInflater.inflate(R.layout.item_city, parent, false)
        return CityHolder(view)
    }

    override fun onBindViewHolder(holder: CityHolder, position: Int) {
        holder.bind(cities.get(position))
    }

    override fun getItemCount(): Int {
        return cities.size
    }


    class CityHolder(view: View):RecyclerView.ViewHolder(view){
        private val binding = ItemCityBinding.bind(view)
        private lateinit var city: CityItem

        fun bind(cityItem: CityItem){
            binding.cityTextview.text = city.name
            binding.latTextView.text = city.lat.toString()
            binding.lonTextview.text = city.lon.toString()
        }

    }

}
