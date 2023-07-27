package com.mdarfealam.mytutorial.IntentActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mdarfealam.mytutorial.databinding.ActivityExplicitIntentBinding


class ExplicitIntent : AppCompatActivity() {

    lateinit var binding : ActivityExplicitIntentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExplicitIntentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnName = intent.getStringExtra("Value0")
        val id = intent.getIntExtra("Value1",0)
        val language = intent.getStringExtra("Value2")

        binding.tvText.text= btnName
        binding.tvId.text= id.toString()
        binding.tvLanguage.text=language






    }
}