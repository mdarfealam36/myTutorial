package com.mdarfealam.mytutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mdarfealam.mytutorial.AlertDialogActivity.AlertDialogActivity
import com.mdarfealam.mytutorial.BottomSheet.BottomSheetActivity
import com.mdarfealam.mytutorial.CheckInternetConnection.CheckInternetConnection
import com.mdarfealam.mytutorial.IntentActivity.ExplicitIntent
import com.mdarfealam.mytutorial.IntentActivity.IntentActivity
import com.mdarfealam.mytutorial.ShareBundle.ShareBundleSendData
import com.mdarfealam.mytutorial.SplashActivity.SplashActivity
import com.mdarfealam.mytutorial.ToastActivity.ToastActivity
import com.mdarfealam.mytutorial.Toolbar.ToolbarActivity
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
// Share Bundle
        binding.button4.setOnClickListener {
            startActivity(Intent(this, ShareBundleSendData::class.java))
        }

// Alert Dialog
        binding.button5.setOnClickListener {
            startActivity(Intent(this, AlertDialogActivity::class.java))
        }


// Bottom Sheet
        binding.button6.setOnClickListener {
            startActivity(Intent(this, BottomSheetActivity::class.java))
        }

// Check Internet Connection
        binding.button7.setOnClickListener {
            startActivity(Intent(this, CheckInternetConnection::class.java))
        }

// Toolbar
        binding.button8.setOnClickListener {
            startActivity(Intent(this, ToolbarActivity::class.java))
        }


    }
}