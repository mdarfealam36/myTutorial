package com.mdarfealam.mytutorial.Toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.mdarfealam.mytutorial.R
import com.mdarfealam.mytutorial.databinding.ActivityToolbarBinding

class ToolbarActivity : AppCompatActivity() {

    lateinit var binding: ActivityToolbarBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityToolbarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolBar.setNavigationOnClickListener {

            Toast.makeText(this, "Navigation icon Clicked", Toast.LENGTH_SHORT).show()
        }

        binding.toolBar.setOnMenuItemClickListener { menuitem ->

            when(menuitem.itemId){
                R.id.search -> {
                    Toast.makeText(this, "${menuitem} Clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.notification -> {
                    Toast.makeText(this, "${menuitem} Clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.files -> {
                    Toast.makeText(this, "${menuitem} Clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.more -> {
                    Toast.makeText(this, "${menuitem} Clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.more1 -> {
                    Toast.makeText(this, "${menuitem} Clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.more2 -> {
                    Toast.makeText(this, "${menuitem} Clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.more3 -> {
                    Toast.makeText(this, "${menuitem} Clicked", Toast.LENGTH_SHORT).show()
                    true
                }

                else -> {
                    false
                }
            }
        }



    }
}