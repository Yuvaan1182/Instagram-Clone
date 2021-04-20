package com.example.instagramclone.Profile

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.View.GONE
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.instagramclone.R
import com.example.instagramclone.Utils.BottomNavigation
import com.google.android.material.bottomnavigation.BottomNavigationView


class ProfileActivity : AppCompatActivity() {

    private val TAG = "Profile Activity"

    lateinit var bottomNavigationView : BottomNavigationView
    lateinit var toolbar : Toolbar
    lateinit var mProgressBar : ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        bottomNavigationView = findViewById(R.id.bottom_navigation_bar)
        toolbar = findViewById(R.id.profile_toolbar)
        mProgressBar = findViewById(R.id.profile_progress_bar)
        mProgressBar.visibility = GONE

        setProfileToolbar()
        setBotttomNav()
    }

    private fun setProfileToolbar() {
        setSupportActionBar(toolbar)
        val accountSettings : ImageView = findViewById(R.id.profile_settings)
        accountSettings.setOnClickListener{
            val intent : Intent = Intent(this, AccountActivity :: class.java)
            startActivity(intent)
        }
    }

    private fun setBotttomNav(){
        val bn = BottomNavigation(this, bottomNavigationView)
        bn.setBottomNavigation()
    }
}