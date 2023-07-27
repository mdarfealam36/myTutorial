package com.mdarfealam.mytutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mdarfealam.mytutorial.SplashActivity.SplashActivity
import com.mdarfealam.mytutorial.ToastActivity.ToastActivity
import com.mdarfealam.mytutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

//    lateinit var binding : ActivityMainBinding
//    binding = ActivityMainBinding.inflate(layoutInflater)
//    setContentView(binding.root)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

// Splash Activity
        binding.button1.setOnClickListener {
            startActivity(Intent(this, SplashActivity::class.java))
        }

// Intent
        binding.button2.setOnClickListener {
            startActivity(Intent(this, IntentActivity::class.java))
        }

// Toast
        binding.button3.setOnClickListener {
            startActivity(Intent(this, ToastActivity::class.java))
        }

    }
}