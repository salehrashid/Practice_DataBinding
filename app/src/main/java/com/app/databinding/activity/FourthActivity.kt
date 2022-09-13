package com.app.databinding.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.app.databinding.R
import com.app.databinding.databinding.ActivityFourthBinding
import com.app.databinding.viewmodel.FourthViewModel
import com.app.databinding.viewmodel.FourthViewModelFactory

class FourthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFourthBinding
    private lateinit var fourthViewModel: FourthViewModel
    private lateinit var fourthViewModelFactory: FourthViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_fourth)

        fourthViewModelFactory = FourthViewModelFactory(122222222222)

        fourthViewModel =
            ViewModelProvider(this, fourthViewModelFactory)[FourthViewModel::class.java]

        binding.fourthViewModel = fourthViewModel
        binding.lifecycleOwner = this
        
    }
}