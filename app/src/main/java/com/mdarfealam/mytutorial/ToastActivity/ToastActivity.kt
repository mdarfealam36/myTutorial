package com.mdarfealam.mytutorial.ToastActivity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import android.widget.Toast
import com.mdarfealam.mytutorial.ClassFile.ToastClass
import com.mdarfealam.mytutorial.R
import com.mdarfealam.mytutorial.databinding.ActivityToastBinding
import com.shashank.sony.fancytoastlib.FancyToast

class ToastActivity : AppCompatActivity() {

    lateinit var binding : ActivityToastBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityToastBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Intent
        binding.btnFancyToast.setOnClickListener {
            startActivity(Intent(this,FancyToastActivity::class.java))
        }

        // ************** Start
// Default toast
        Toast.makeText(this, "Default Toast ", Toast.LENGTH_SHORT).show()

// Deafult Toast from Other Class
        binding.btnDefaultToast.setOnClickListener {
            var obj = ToastClass() //Object Created
            obj.defaultToast(this@ToastActivity)
        }
        //*********** End

        // Custom Toast 2

        val layout = layoutInflater.inflate(R.layout.toast_layout, this.findViewById(R.id.linearLayout))
        binding.btnCustomToast2.setOnClickListener {
            val myToast = Toast(applicationContext)
//            myToast.setText("hiiiiiiiiiiiiiiiiiiiiiiiiiiiiii")    //test
            myToast.duration = Toast.LENGTH_LONG
            myToast.setGravity(Gravity.CENTER, 0, 0)
            myToast.view = layout//setting the view of custom toast layout
            myToast.show()
        }




        // Custom Toast 1
        binding.btnCustomToast.setOnClickListener {
            Toast(this).showCustomToast ("JavaTpoint custom Toast", this)
        }



    }


    // fun Custom Toast 1
    fun Toast.showCustomToast(message: String, activity: Activity) {
        val layout = activity.layoutInflater.inflate(R.layout.toast_layout2,
            activity.findViewById(R.id.linearLayout2)
        )
        // set the text of the TextView of the message
        val textView = layout.findViewById<TextView>(R.id.tv_toast)
        textView.text = message

        // use the application extension function
        this.apply {
            setGravity(Gravity.CENTER, 0, 0)
            duration = Toast.LENGTH_LONG
            view = layout
            show()
        }
    }



}

