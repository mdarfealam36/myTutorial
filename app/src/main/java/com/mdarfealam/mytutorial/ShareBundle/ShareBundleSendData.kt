package com.mdarfealam.mytutorial.ShareBundle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mdarfealam.mytutorial.R
import com.mdarfealam.mytutorial.databinding.ActivityExplicitIntentBinding
import com.mdarfealam.mytutorial.databinding.ActivityShareBundleSendDataBinding

class ShareBundleSendData : AppCompatActivity() {

    lateinit var binding: ActivityShareBundleSendDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShareBundleSendDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {

            val Name=binding.edtName.text.toString()
            val Email=binding.edtEmail.text.toString()

            val bundle = Bundle()
            bundle.putString("name",Name)
            bundle.putString("email",Email)

            val intent = Intent(this,ShareBundleReceiveData::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

    }
}