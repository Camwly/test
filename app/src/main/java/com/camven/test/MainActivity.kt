package com.camven.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test()
    }
}

fun test(){
    Log.i("camvenli","This is ")
    Log.i("camvenli","commit 2")
}

fun test1(){
    Log.i("camvenli","This is commit 4")
}