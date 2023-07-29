package com.mdarfealam.mytutorial.BottomSheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.mdarfealam.mytutorial.R
import com.mdarfealam.mytutorial.databinding.ActivityBottomSheetBinding
import com.mdarfealam.mytutorial.databinding.BottomSheetLayoutBinding

class BottomSheetActivity : AppCompatActivity() {

    lateinit var binding: ActivityBottomSheetBinding
    lateinit var sheetBinding: BottomSheetLayoutBinding
    lateinit var dialog: BottomSheetDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBottomSheetBinding.inflate(layoutInflater)
        setContentView(binding.root)


        sheetBinding = BottomSheetLayoutBinding.inflate(layoutInflater)
        dialog = BottomSheetDialog(this,R.style.BottomSheetTheme)
        dialog.setContentView(sheetBinding.root)
        dialog.window?.attributes?.windowAnimations = R.style.DialogAnimation

        binding.btnClickMe.setOnClickListener {

            dialog.show()
        }

        sheetBinding.btnSendText.setOnClickListener {

            val data = sheetBinding.edtSendText.text.toString()
            binding.tvReceivedtext.text = data
            dialog.dismiss()

        }


    }
}