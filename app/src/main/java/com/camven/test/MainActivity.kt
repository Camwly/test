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
    Log.i("camvenli","This is commit 1")
    Log.i("camvenli","This is commit 2")
    Log.i("camvenli","This is commit 3")
}