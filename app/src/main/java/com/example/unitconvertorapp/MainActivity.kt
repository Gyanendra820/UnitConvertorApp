package com.example.unitconvertorapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.unitconvertorapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.convertBtn.setOnClickListener {
            var edtItem = binding.unitEdt.text.toString().toDouble()
            binding.unitTv.text = convertToPounds(edtItem).toString()
        }
    }

    fun convertToPounds(killos: Double): Double {
        var pounds = killos * 2.20462
        return pounds
    }
}