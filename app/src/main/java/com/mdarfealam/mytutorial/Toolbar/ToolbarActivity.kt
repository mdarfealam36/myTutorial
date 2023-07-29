package com.mdarfealam.mytutorial.Toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mdarfealam.mytutorial.R
import com.mdarfealam.mytutorial.databinding.ActivityCheckInternetConnectionBinding
import com.mdarfealam.mytutorial.databinding.ActivityToolbarBinding

class ToolbarActivity : AppCompatActivity() {

    lateinit var binding: ActivityToolbarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityToolbarBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}