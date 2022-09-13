package com.app.databinding.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FourthViewModel(startNum: Long): ViewModel() {
    private var _total = MutableLiveData<Long>()
    val total: LiveData<Long>
        get() = _total

    var inputText = MutableLiveData<String>()

    init {
        _total.value = startNum
    }

    fun setTotal(){
        val intInput: Long = inputText.value!!.toLong()
        _total.value = (_total.value)?.plus(intInput)
    }
}