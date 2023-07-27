package com.mdarfealam.mytutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mdarfealam.mytutorial.databinding.ActivityIntentBinding
import com.mdarfealam.mytutorial.databinding.ActivityMainBinding

class IntentActivity : AppCompatActivity() {

    lateinit var binding : ActivityIntentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        // Intent
//        binding.intentButton.setOnClickListener {
//
//            // 1st Method
//            val intent = Intent(this@MainActivity,IntentActivity::class.java)
//            startActivity(intent)
//
//            // 2nd Method
////            startActivity(Intent(this,IntentActivity::class.java))
//        }

    }
}