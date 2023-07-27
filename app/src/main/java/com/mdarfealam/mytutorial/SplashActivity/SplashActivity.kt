package com.mdarfealam.mytutorial.SplashActivity

import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.mdarfealam.mytutorial.MainActivity
import com.mdarfealam.mytutorial.R
import com.mdarfealam.mytutorial.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    lateinit var binding : ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

            startHeavyTask()

    }
    private fun startHeavyTask() {
        LongOperation().execute()
    }

    private open inner class LongOperation : AsyncTask<String?, Void?, String>() {

        override fun doInBackground(vararg p0: String?): String {

            // Use While Loop
            for (i in 0..3) {
                try {

                    Thread.sleep(1000)

                } catch (e: Exception) {

                    Thread.interrupted()
                }
            }
            return "result"
        }

        override fun onPostExecute(result: String?) {

            super.onPostExecute(result)

            Toast.makeText(this@SplashActivity, "Executed !", Toast.LENGTH_SHORT).show()

            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)

//        finish() // Commented for test
        }
    }
}