package com.example.hiltdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    @Named("String2")
    lateinit var testString:String
    @Inject
    @Named("String1")
    lateinit var test1String:String
    @Inject
    @Named("StringFromResource")
    lateinit var testStringFromContext:String


    private val viewModel:MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("Checking:","Check2=${testString}")
        Log.e("Checking:","Check1=${test1String}")
        Log.e("Checking:","CheckFro=${testStringFromContext}")
        viewModel
    }
}