package com.mdarfealam.mytutorial.AlertDialogActivity

import android.app.AlertDialog
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.mdarfealam.mytutorial.R
import com.mdarfealam.mytutorial.databinding.ActivityAlertDialogBinding


class AlertDialogActivity : AppCompatActivity() {

    lateinit var binding: ActivityAlertDialogBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlertDialogBinding.inflate(layoutInflater)
        setContentView(binding.root)

        alertDialog()
        customAlertDialog()

        val fruits = arrayOf("Apple","Banana","Mango","Orange","Papaya")
        binding.button3.setOnClickListener {

            val dialog = AlertDialog.Builder(this)
            dialog.setTitle("Choose Option")
            dialog.setIcon(R.drawable.baseline_face)
            dialog.setCancelable(true)

            dialog.setItems(fruits){dialoginteface,it ->
                when(it){
                    it -> {
                        Toast.makeText(this, fruits[it], Toast.LENGTH_SHORT).show()

                        val data = fruits[it]
                        binding.tvSelected.text = data
                    }
                }

            }
            dialog.setPositiveButton("yes"){dialogInterface,it ->
                finish()
            }
            dialog.setNegativeButton("No"){dialogInterface,it ->
                Toast.makeText(this, "Clicked no", Toast.LENGTH_SHORT).show()
            }
            dialog.setNeutralButton("Cancel"){dialogInterface,it ->
                Toast.makeText(this, "Canceled", Toast.LENGTH_SHORT).show()
            }
            dialog.show()

        }

        }

    private fun customAlertDialog() {

        binding.button2.setOnClickListener {

            val customDialog = Dialog(this)
            customDialog.setContentView(R.layout.cutom_alertdialog_layout)
            customDialog.setCancelable(false)
           val buttonDismiss= customDialog.findViewById<Button>(R.id.btnDismiss)
            buttonDismiss.setOnClickListener {
                customDialog.dismiss()
            }
            customDialog.show()
        }
    }

    private fun alertDialog() {

        binding.button1.setOnClickListener {

            val dialog = AlertDialog.Builder(this)

            dialog.setTitle("Exit?")
            dialog.setMessage("Are you sure you want to exit ?")
            dialog.setCancelable(true)
            dialog.setPositiveButton("yes") { dialogInterface, it ->
                finish()
            }

            dialog.setNegativeButton("No") { _, _ ->
                Toast.makeText(this, "No clicked", Toast.LENGTH_SHORT).show()
            }

            dialog.setNeutralButton("Cancel") { _, _ ->
                Toast.makeText(this, "Canceled", Toast.LENGTH_SHORT).show()
            }
            dialog.show()
        }
    }

}