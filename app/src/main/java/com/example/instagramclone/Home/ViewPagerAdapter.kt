package com.example.instagramclone.Home

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kotlin.collections.ArrayList

class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(
    fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {

    val TAG = "ViewPagerAdapter"
    private val mFragmentList = ArrayList<Fragment>()

    override fun getCount(): Int {
        return mFragmentList.size
    }

    override fun getItem(position: Int): Fragment {
        return mFragmentList[position]
    }

    fun addFragment(fragment : Fragment){
        mFragmentList.add(fragment)
    }
}