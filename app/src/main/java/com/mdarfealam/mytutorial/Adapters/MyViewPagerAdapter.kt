package com.mdarfealam.mytutorial.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.mdarfealam.mytutorial.Fragments.CallsFragment
import com.mdarfealam.mytutorial.Fragments.ChatsFragment
import com.mdarfealam.mytutorial.Fragments.StatusFragment


class MyViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle):FragmentStateAdapter(fragmentManager, lifecycle){
    override fun getItemCount(): Int {

        return 3
    }

    override fun createFragment(position: Int): Fragment {

      return  when(position){

            0 ->{
                ChatsFragment()
            }
            1 ->{
                StatusFragment()
            }
            2 ->{
                CallsFragment()
            }
            else ->{
                Fragment()
            }
        }

    }


}



























//class MyViewPagerAdapter(fragManager:FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fragManager,lifecycle){
//
//    override fun getItemCount(): Int {
//        return 3
//    }
//
//    override fun createFragment(position: Int): Fragment {
//        when(position){
//            0 -> return ChatsFragment()
//            1 -> return StatusFragment()
//            2 -> return CallsFragment()
//            else -> return ChatsFragment()
//        }
//    }
//
//}