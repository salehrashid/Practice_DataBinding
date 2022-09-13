package com.app.databinding.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.app.databinding.R
import com.app.databinding.databinding.ActivityThirdBinding
import com.app.databinding.viewmodel.ThirdViewModel

class ThirdActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdBinding
    private lateinit var thirdViewModel: ThirdViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_third)

        thirdViewModel = ViewModelProvider(this)[ThirdViewModel::class.java]

        binding.myViewModel = thirdViewModel
        binding.lifecycleOwner = this
    }
}