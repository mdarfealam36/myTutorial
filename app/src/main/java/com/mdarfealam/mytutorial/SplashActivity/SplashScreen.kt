package com.mdarfealam.mytutorial.SplashActivity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.postDelayed
import com.mdarfealam.mytutorial.MainActivity
import com.mdarfealam.mytutorial.R


class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        Handler(Looper.getMainLooper()).postDelayed(2000){
            startActivity(Intent(this, MainActivity::class.java))

        finish()
        }

    }
}