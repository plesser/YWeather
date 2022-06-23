package ru.plesser.yweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class WeatherActivity : AppCompatActivity() {

    private val TAG = "YW_MainActivity"
    private lateinit var testButton: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)

        testButton = findViewById(R.id.test_button)
        testButton.setOnClickListener(View.OnClickListener {
                Log.d(TAG, "Нажали на тестовую кнопку")
                Toast.makeText(this, "Нажали на тестовую кнопку", Toast.LENGTH_SHORT).show()
            }
        )
    }
}