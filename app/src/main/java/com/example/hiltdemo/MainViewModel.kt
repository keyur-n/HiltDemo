package com.example.hiltdemo

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class MainViewModel @Inject constructor(
    //Repository
@Named("String2") testString2:String
) : ViewModel() {
    init {
        Log.e("Checking","Viewmodel Check = $testString2")
    }
}