package com.example.instagramclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import com.example.instagramclone.Home.HomeFragment
import com.example.instagramclone.Like.FavouriteFragment
import com.example.instagramclone.Profile.ProfileFragment
import com.example.instagramclone.Search.SearchFragment
import com.example.instagramclone.Share.ShareFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var bottomNavBar: BottomNavigationView

    val manager = supportFragmentManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavBar = findViewById(R.id.bottom_navigation_bar)

        setBottomNav()
        val homeFragment = HomeFragment()
        manager.beginTransaction().apply {
            replace(R.id.fragment, homeFragment)
            commit()
        }



    }

    // setting up bottom navigation bar
    private fun setBottomNav(){

        val homeFragment = HomeFragment()
        val favouriteFragment = FavouriteFragment()
        val searchFragment = SearchFragment()
        val shareFragment = ShareFragment()
        val profileFragment = ProfileFragment()

        bottomNavBar.setOnNavigationItemSelectedListener { item->
            when(item.itemId){
                R.id.home->{
                    manager.beginTransaction().apply {
                        replace(R.id.fragment, homeFragment)
                        commit()
                    }
                    true
                }
                R.id.search->{
                    manager.beginTransaction().apply {
                        replace(R.id.fragment, searchFragment)
                        commit()
                    }
                    true
                }

                R.id.add->{
                    manager.beginTransaction().apply {
                        replace(R.id.fragment, shareFragment)
                        commit()
                    }
                    true
                }

                R.id.favourite->{
                    manager.beginTransaction().apply {
                        replace(R.id.fragment, favouriteFragment)
                        commit()
                    }
                    true
                }

                R.id.user->{
                    bottomNavBar.menu.findItem(R.id.home).setChecked(true)
                    manager.beginTransaction().apply {
                        replace(R.id.fragment, profileFragment)
                        commit()
                    }
                    true
                }
                else -> {
                    false
                }
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.bottom_navigation_menu, menu)
        return true
    }

}