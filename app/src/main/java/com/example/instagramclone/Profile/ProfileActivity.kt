package com.example.instagramclone.Profile

import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.instagramclone.R
import com.example.instagramclone.Utils.BottomNavigation
import com.google.android.material.bottomnavigation.BottomNavigationView


class ProfileActivity : AppCompatActivity() {

    private val TAG = "Profile Activity"

    lateinit var bottomNavigationView: BottomNavigationView
    lateinit var toolbar : Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        bottomNavigationView = findViewById(R.id.bottom_navigation_bar)
        toolbar = findViewById(R.id.profile_toolbar)

        setProfileToolbar()
        setBotttomNav()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.profile_toolbar_menu, menu)
        return true
    }

    private fun setProfileToolbar() {
        setSupportActionBar(toolbar)

        toolbar.setOnMenuItemClickListener(Toolbar.OnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.profile_menu -> {
                    Log.d(TAG, "profile menu option clicked")
                }
            }
            true
        })
    }

    private fun setBotttomNav(){
        val bn = BottomNavigation(this, bottomNavigationView)
        bn.setBottomNavigation()
    }
}