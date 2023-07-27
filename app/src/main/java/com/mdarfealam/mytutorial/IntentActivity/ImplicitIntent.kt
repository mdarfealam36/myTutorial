package com.mdarfealam.mytutorial.IntentActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mdarfealam.mytutorial.databinding.ActivityImplicitIntentBinding

class ImplicitIntent : AppCompatActivity() {

    lateinit var binding: ActivityImplicitIntentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImplicitIntentBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnShare.setOnClickListener {

            val Content1 = binding.txtContent.text.toString()

            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, Content1)
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, "Share with..")
            startActivity(shareIntent)
        }

        binding.btnShare2.setOnClickListener {

            val Content2 = binding.txtContent2.text.toString()

            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, Content2)
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, "Share with..")
            startActivity(shareIntent)
        }

    }
}