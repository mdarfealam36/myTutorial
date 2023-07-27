package com.mdarfealam.mytutorial.ClassFile

import android.content.Context
import android.widget.Toast

class ToastClass {

    fun defaultToast(context:Context){

        Toast.makeText(context, "Other Class Toast", Toast.LENGTH_SHORT).show()
    }
}


// fun main(){
//    fun tryAgain(){
//        println("Try Again...")
//    }
//
//    var noSuccess = true
//
//    var dead = true
//
//    while (noSuccess){
//
//        tryAgain()
//
//        if(dead)
//            break
//
//    }
// }