package com.example.instagramclone.Home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.instagramclone.R
import com.example.instagramclone.Utils.BottomNavigation
import com.example.instagramclone.Utils.ViewPagerAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout

class HomeActivity : AppCompatActivity() {

    lateinit var bottomNavigationView: BottomNavigationView
    lateinit var tabLayout : TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        bottomNavigationView = findViewById(R.id.bottom_navigation_bar)
        tabLayout = findViewById(R.id.tab_layout)

        setBotttomNav()
        setViewPager()
    }

    private fun setViewPager(){
        val viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        val viewPager : ViewPager = findViewById(R.id.view_pager)

        viewPagerAdapter.addFragment(HomeFragment())
        viewPagerAdapter.addFragment(CameraFragment())
        viewPagerAdapter.addFragment(MessengerFragment())

        viewPager.adapter = viewPagerAdapter

        tabLayout.setupWithViewPager(viewPager)

        tabLayout.getTabAt(0)?.setIcon(R.drawable.camera)
        tabLayout.getTabAt(1)?.text = "Instagram"
        tabLayout.getTabAt(2)?.setIcon(R.drawable.messenger)
    }

    private fun setBotttomNav(){
        val bn = BottomNavigation(this, bottomNavigationView)
        bn.setBottomNavigation()
    }
}