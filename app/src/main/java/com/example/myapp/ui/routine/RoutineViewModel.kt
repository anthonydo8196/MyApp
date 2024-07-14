package com.example.myapp.ui.routine

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RoutineViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Progress Bar WIP"
    }
    val text: LiveData<String> = _text
}