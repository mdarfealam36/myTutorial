package com.mdarfealam.mytutorial.TabLayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.mdarfealam.mytutorial.Adapters.MyViewPagerAdapter
import com.mdarfealam.mytutorial.Fragments.CallsFragment
import com.mdarfealam.mytutorial.R
import com.mdarfealam.mytutorial.databinding.ActivityTabLayoutBinding

class TabLayoutActivity : AppCompatActivity() {

    lateinit var binding: ActivityTabLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTabLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbar = binding.toolBar
        toolbar.setTitle("TabLayout")

        setupViewPagerAdapter()
        setUpTabLayout()
    }

    fun setupViewPagerAdapter(){
        val adapter = MyViewPagerAdapter(supportFragmentManager, lifecycle)
        binding.viewPager2.adapter = adapter
    }
    fun setUpTabLayout(){

        val tabs = binding.tabLayout
        TabLayoutMediator(tabs, binding.viewPager2) { tab, position ->
            when(position){
                0 -> tab.text="Chats"
                1 -> tab.text="Status"
                2 -> tab.text="Calls"
            }
        }.attach()
    }

    override fun onBackPressed() {

        val pager = binding.viewPager2
        if(pager.currentItem > 0){
            pager.currentItem = 0
        }else {
            super.getOnBackPressedDispatcher().onBackPressed()
        }
    }

}

