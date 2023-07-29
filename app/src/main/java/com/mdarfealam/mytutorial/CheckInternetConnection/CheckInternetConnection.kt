package com.mdarfealam.mytutorial.CheckInternetConnection

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.widget.Toast
import androidx.core.app.ActivityCompat
import com.mdarfealam.mytutorial.databinding.ActivityCheckInternetConnectionBinding
import com.mdarfealam.mytutorial.utils.ConnectionManager

class CheckInternetConnection : AppCompatActivity() {

    lateinit var binding: ActivityCheckInternetConnectionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCheckInternetConnectionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCheckConnection.setOnClickListener {

            val alertDialog = androidx.appcompat.app.AlertDialog.Builder(this)

            if (!ConnectionManager().checkConnectivity(this)) {

                alertDialog.setTitle("No Internet")
                alertDialog.setMessage("Check Internet Connection!")
                alertDialog.setPositiveButton("Open Settings") { _, _ ->
                    val settingsIntent = Intent(Settings.ACTION_SETTINGS)
                    startActivity(settingsIntent)
                }
                alertDialog.setNegativeButton("Exit") { _, _ ->
                    ActivityCompat.finishAffinity(this)
                }
                alertDialog.setCancelable(false)
                alertDialog.create()
                alertDialog.show()
            }
            else if (ConnectionManager().checkConnectivity(this)){

                alertDialog.setTitle("Success")
                alertDialog.setMessage("Internet Connection Found")
                alertDialog.setPositiveButton("Ok") { _, _ ->
                    Toast.makeText(this, "Clicked Ok", Toast.LENGTH_SHORT).show()
                }
                alertDialog.setNegativeButton("No") { _, _ ->
                    Toast.makeText(this, "Clicked No", Toast.LENGTH_SHORT).show()
                }
                alertDialog.create()
                alertDialog.show()

            }
        }
    }
}