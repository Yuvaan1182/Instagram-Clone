package com.example.instagramclone.Profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.instagramclone.R
import com.example.instagramclone.Utils.BottomNavigation
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProfileActivity : AppCompatActivity() {

    lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        bottomNavigationView = findViewById(R.id.bottom_navigation_bar)
        setBotttomNav()
    }

    private fun setBotttomNav(){
        val bn = BottomNavigation(this, bottomNavigationView)
        bn.setBottomNavigation()
    }
}