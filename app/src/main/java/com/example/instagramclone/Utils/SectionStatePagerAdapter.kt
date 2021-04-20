package com.example.instagramclone.Utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class SectionStatePagerAdapter(val fragmentManager: FragmentManager) :
    FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private var mFragmentlist = ArrayList<Fragment>()
    private var mFragment = HashMap<Fragment, Int>()
    private var mFragmentNumber = HashMap<String, Int>()
    private var mFragmentNames = HashMap<Int, String>()


    override fun getCount(): Int {
        return mFragmentlist.size
    }

    override fun getItem(position: Int): Fragment {
        return mFragmentlist[position]
    }

    public fun addFragment(fragment : Fragment, fragmentName : String){
        mFragmentlist.add(fragment)
        mFragment.put(fragment, mFragmentlist.size - 1)
        mFragmentNumber.put(fragmentName, mFragmentlist.size - 1)
        mFragmentNames.put(mFragmentlist.size - 1, fragmentName)
    }

    /*
    ** return fragment with name of fragment as parameter
    */

    public fun getFragmentNumber(fragmentName : String) : Int? {
        if(mFragmentNumber.containsKey(fragmentName))
            return mFragmentNumber.get(fragmentName)
        else
            return null
    }

    /*
    ** return fragment number with fragment as parameter
    */

    public fun getFragmentNumber(fragment: Fragment) : Int? {
        if(mFragmentNumber.containsKey(fragment))
            return mFragmentNumber.get(fragment)
        else
            return null
    }

    /*
    ** return fragment name with name of fragment Number as parameter
    */

    public fun getFragmentName(fragmentNumber: Int) : String? {
        if(mFragmentNames.containsKey(fragmentNumber))
            return mFragmentNames.get(fragmentNumber)
        else
            return null
    }
}