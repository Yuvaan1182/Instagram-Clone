package com.example.instagramclone.Utils

import android.content.Context
import android.content.Intent
import com.example.instagramclone.Favourite.FavouriteActivity
import com.example.instagramclone.Home.HomeActivity
import com.example.instagramclone.Profile.ProfileActivity
import com.example.instagramclone.R
import com.example.instagramclone.Search.SearchActivity
import com.example.instagramclone.Share.ShareActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavigation(var context: Context, val bottomNavigation: BottomNavigationView) {

    val TAG = "Bottom Navigation View"

    fun setBottomNavigation(){
        var intent : Intent
        bottomNavigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home->{
                    intent = Intent(context, HomeActivity::class.java)
                    context.startActivity( intent )
                    true
                }
                R.id.search ->{
                    intent = Intent(context, SearchActivity::class.java)
                    context.startActivity( intent )
                    true
                }
                R.id.add -> {
                    intent = Intent(context, ShareActivity::class.java)
                    context.startActivity( intent )
                    true
                }
                R.id.favourite ->{
                    intent = Intent(context, FavouriteActivity:: class.java)
                    context.startActivity( intent )
                    true
                }
                R.id.user -> {
                    intent = Intent(context, ProfileActivity::class.java)
                    context.startActivity( intent )
                    true
                }
                else -> {
                    false
                }
            }

        }
    }


}