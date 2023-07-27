package com.mdarfealam.mytutorial.IntentActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mdarfealam.mytutorial.databinding.ActivityExplicitIntentBinding


class ExplicitIntent : AppCompatActivity() {

    lateinit var binding : ActivityExplicitIntentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExplicitIntentBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        // Intent
//        binding.intentButton.setOnClickListener {
//
//            // 1st Method
//            val intent = Intent(this@ExplicitIntent,IntentActivity::class.java)
//            startActivity(intent)
//
//            // 2nd Method
////            startActivity(Intent(this,IntentActivity::class.java))
//        }

    }
}