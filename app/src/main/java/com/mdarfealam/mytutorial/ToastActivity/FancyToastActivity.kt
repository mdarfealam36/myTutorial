package com.mdarfealam.mytutorial.ToastActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mdarfealam.mytutorial.R
import com.mdarfealam.mytutorial.databinding.ActivityFancyToastBinding
import com.mdarfealam.mytutorial.databinding.ActivityToastBinding
import com.shashank.sony.fancytoastlib.FancyToast

class FancyToastActivity : AppCompatActivity() {

    lateinit var binding : ActivityFancyToastBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFancyToastBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFancyDefault.setOnClickListener {

            //Default
            FancyToast.makeText(this,"Hello World !",
                FancyToast.LENGTH_LONG,FancyToast.DEFAULT,false).show()
        }

        binding.btnFancySuccess.setOnClickListener {

            // Success
            FancyToast.makeText(this,"Hello World !",
                FancyToast.LENGTH_LONG,FancyToast.SUCCESS,false).show()
        }

        binding.btnFancyError.setOnClickListener {

            // Error
            FancyToast.makeText(this,"Hello World !",
                FancyToast.LENGTH_LONG,FancyToast.ERROR,false).show()
        }
        binding.btnFancyWarning.setOnClickListener {

            // Warning
            FancyToast.makeText(this,"Hello World !",
                FancyToast.LENGTH_LONG,FancyToast.WARNING,false).show()
        }

        binding.btnFancyInfo.setOnClickListener {

            // Info
            FancyToast.makeText(this,"Hello World !",
                FancyToast.LENGTH_LONG,FancyToast.INFO,false).show()
        }

        binding.btnFancyConfuse.setOnClickListener {

            // Confusing
            FancyToast.makeText(this,"Hello World !",
                FancyToast.LENGTH_LONG,FancyToast.CONFUSING,false).show()
        }

        //  Fancy Custom Image
        binding.btnOwnCustomize.setOnClickListener {

//        FancyToast.makeText(yourContext, "I'm a custom Toast", duration, type, yourimage, boolean value).show();

            FancyToast.makeText(this, "I'm a custom Toast", FancyToast.LENGTH_SHORT, FancyToast.SUCCESS,
                R.drawable.my_tutorial_logo, false).show()
        }


    }
}