package com.mdarfealam.mytutorial.TabLayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.mdarfealam.mytutorial.Adapters.MyViewPagerAdapter
import com.mdarfealam.mytutorial.R

class TabLayoutActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_layout)

        val Pager = findViewById<ViewPager2>(R.id.view_pager2)
        val tabs = findViewById<TabLayout>(R.id.tab_layout)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)

        toolbar.setTitle("TabLayout")

        val adapter = MyViewPagerAdapter(supportFragmentManager, lifecycle)

        Pager.adapter = adapter

        TabLayoutMediator(tabs, Pager) { tab, position ->

            when(position){
                0 ->{
                    tab.text="Chats"
                }
                1 ->{
                    tab.text="Status"
                }
                2 ->{
                    tab.text="Calls"
                }
            }
        }.attach()

        }
    }


//private var tabTitle = arrayOf("Chats","Status","Calls")
//val Pager = findViewById<ViewPager2>(R.id.viewPager)
//val tabs = findViewById<TabLayout>(R.id.tabs)
//
//Pager.adapter = MyViewPagerAdapter(supportFragmentManager, lifecycle)
//
//TabLayoutMediator(tabs,Pager){tab,position ->
//    tab.text = tabTitle[position]
//}