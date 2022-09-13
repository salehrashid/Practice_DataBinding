package com.app.databinding.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.app.databinding.R
import com.app.databinding.Student
import com.app.databinding.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_second)

        binding.student = getStudent()
    }

    private fun getStudent(): Student {
        return Student(1, "ucok", "ucok@gmail.com")
    }
}