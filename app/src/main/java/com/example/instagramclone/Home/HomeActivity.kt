package com.example.instagramclone.Home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.instagramclone.Favourite.FavouritesActivity
import com.example.instagramclone.Profile.UserProfileActivity
import com.example.instagramclone.R
import com.example.instagramclone.Search.SearchActivity
import com.example.instagramclone.Share.ShareActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        bottomNavigationView = findViewById(R.id.bottom_navigation_bar)
        setBotttomNav()
    }

    private fun setBotttomNav(){
        lateinit var intent: Intent
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home->{
                    intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.search ->{
                    intent = Intent(this, SearchActivity:: class.java)
                    startActivity(intent)
                    true
                }
                R.id.add -> {
                    intent = Intent(this, ShareActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.favourite ->{
                    intent = Intent(this, FavouritesActivity:: class.java)
                    startActivity(intent)
                    true
                }
                R.id.user -> {
                    intent = Intent(this, UserProfileActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> {
                    false
                }
            }

        }
    }
}