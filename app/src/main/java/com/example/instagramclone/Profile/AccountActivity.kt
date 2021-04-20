package com.example.instagramclone.Profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.RelativeLayout
import androidx.appcompat.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.example.instagramclone.R
import com.example.instagramclone.Utils.BottomNavigation
import com.example.instagramclone.Utils.SectionStatePagerAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView

class AccountActivity : AppCompatActivity() {

    val TAG = "ProfileAccountActivity"
    lateinit var toolbar : Toolbar
    lateinit var bottomNavigationView : BottomNavigationView

    lateinit var pagerAdapter: SectionStatePagerAdapter
    lateinit var viewPager : ViewPager
    lateinit var relativeLayout: RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        viewPager = findViewById(R.id.view_pager)
        relativeLayout = findViewById(R.id.out_rel_lay)


        Log.d(TAG, "account acitvity started")
        populateList()
        setProfileToolbar()
        setBotttomNav()
        setUpFragments()

        // set up back arrow click listener to navigate back to profile activity
        val backArrow : ImageView = findViewById(R.id.back_arrow)
        backArrow.setOnClickListener{
            Log.d(TAG, "Navigating back to profile activity")
            finish()
        }
    }

    private fun setProfileToolbar() {
        toolbar = findViewById(R.id.account_settings_toolbar)
        setSupportActionBar(toolbar)
    }

    private fun setBotttomNav(){
        bottomNavigationView = findViewById(R.id.bottom_navigation_bar)
        val bn = BottomNavigation(this, bottomNavigationView)
        bn.setBottomNavigation()
    }

    private fun populateList(){
        var listView : ListView = findViewById(R.id.account_list_view)
        var list = ArrayList<String>()
        list.add("Edit Profile")
        list.add("Sign Out")

        val listAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, list)
        listView.adapter = listAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            Log.d(TAG, "chosen fragment option : " + position)
            setViewPager(position)
        }

    }

    private fun setUpFragments(){
        pagerAdapter = SectionStatePagerAdapter(supportFragmentManager)
        pagerAdapter.addFragment(EditProfileFragment(), "Edit Profile")
        pagerAdapter.addFragment(SignOutFragment(), "Sign OUT")
    }

    private fun setViewPager(fragmentNumber : Int){
        relativeLayout.visibility = View.GONE
        Log.d(TAG, "set View pager : frag no = " + fragmentNumber)

        viewPager.adapter = pagerAdapter
        viewPager.setCurrentItem(fragmentNumber)
    }

}