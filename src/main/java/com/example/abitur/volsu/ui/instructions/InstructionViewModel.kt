package com.example.abitur.volsu.ui.instructions

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InstructionViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is instructions Fragment"
    }
    val text: LiveData<String> = _text
}