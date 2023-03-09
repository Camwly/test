package com.camven.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.camven.test.databinding.ActivityMainBinding
import com.camven.test.view.requestlayout.TestRequestLayoutActivity

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        binding?.tvRequestLayout?.setOnClickListener {
            val intent = Intent(this, TestRequestLayoutActivity::class.java)
            startActivity(intent)
        }
    }
}