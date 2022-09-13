package com.app.databinding.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ThirdViewModel: ViewModel() {
    val name = MutableLiveData<String>()

    init {
        name.value = "Bang Toyyib"
    }
}