package com.example.myapplication.ui.flora

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FloraViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Flora Fragment"
    }
    val text: LiveData<String> = _text
}