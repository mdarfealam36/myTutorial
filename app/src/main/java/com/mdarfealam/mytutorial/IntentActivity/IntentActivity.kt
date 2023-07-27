package com.mdarfealam.mytutorial.IntentActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mdarfealam.mytutorial.R
import com.mdarfealam.mytutorial.databinding.ActivityExplicitIntentBinding
import com.mdarfealam.mytutorial.databinding.ActivityIntentBinding

class IntentActivity : AppCompatActivity() {

    lateinit var binding : ActivityIntentBinding

    val id =100
    val langauage = "Kotlin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Explicit Intent
        binding.button1.setOnClickListener {

            val btnData = binding.button1.text.toString()
            // 1st Method
            val intent = Intent(this,ExplicitIntent::class.java)
            intent.putExtra("Value0",btnData)
            intent.putExtra("Value1", id);
            intent.putExtra("Value2", langauage);
            startActivity(intent)

            // 2nd Method
//            startActivity(Intent(this,IntentActivity::class.java))
        }

        // Implicit Intent
        binding.button2.setOnClickListener {

            startActivity(Intent(this,ImplicitIntent::class.java))

        }
    }
}