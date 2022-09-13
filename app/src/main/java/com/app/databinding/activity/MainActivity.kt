package com.app.databinding.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.app.databinding.R
import com.app.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding as ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.btnSubmit.setOnClickListener {
            displayGreeting()
        }
    }

    private fun displayGreeting() {
        binding.tvResult.text = "Hola " + binding.edtText.text
    }
}