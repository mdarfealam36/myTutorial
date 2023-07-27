package com.mdarfealam.mytutorial.ShareBundle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mdarfealam.mytutorial.R
import com.mdarfealam.mytutorial.databinding.ActivityShareBundleReceiveDataBinding
import com.mdarfealam.mytutorial.databinding.ActivityShareBundleSendDataBinding

class ShareBundleReceiveData : AppCompatActivity() {

    lateinit var binding: ActivityShareBundleReceiveDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShareBundleReceiveDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 1st Method
//        val name= binding.tvName
//        val email= binding.tvEmail
//
//        val bundle=intent.extras
//        name.setText(bundle!!.getString("name","name"))
//        email.setText(bundle!!.getString("email","email"))

        // 2nd Method
        val bundle=intent.extras

        binding.tvName.text = bundle!!.getString("name","name")
        binding.tvEmail.text = bundle!!.getString("email","email")


    }
}