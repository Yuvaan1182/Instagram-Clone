package com.example.instagramclone.Home

//Fragment is a modular section of activity or sub activity
//inside an activity, jiskikhud ki lifecycle h, khud k input
//events h aur ise hum kabhi bhi apni main activity k ander
//add or remove kar sakte h, aur alag-alag activities mein
//baar baar use bhi kar sakte h

//Lifecycle
//Fragment added in activity function call order
//onAttach() -> onCreate() --->{
//    Ye method keval ek hi baar chalte
//    pure fragment mein
//}
//
//in continuation of above function call after onCreate()
//onCreateView() -> onActivityCreated() ->
//onStart() -> onResume() -> running state of fragment achieved
//
//now user interacting with fragment
//
//if user minimize the application sequentially
//onPause() -> onStop() ----> methods are executed
//
//if replace fragment with another fragment
//onPause() -> onStop() -> onDestroyView() ----> are executed
//
//if we kill the fragment then
//onDestroy() -> onDetach() ----> methods are called


import android.content.Context
import android.os.Bundle
import android.text.TextUtils.replace
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.instagramclone.R


class HomeFragment : Fragment() {

    val TAG = "Home Fragment"
    override fun onAttach(context: Context) {
        Log.d(TAG, "onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //returns a layout through inflater
        //inflater!! --> means inflater cannot be null
        Log.d(TAG, "onCreateView")
//        val camera: ImageView = container!!.findViewById(R.id.camera)
//        val message: ImageView = container!!.findViewById(R.id.message)
//        val cameraFragment: CameraFragment = CameraFragment()
//        val messagesFragment: MessagesFragment = MessagesFragment()
//
//
//        messagesFragment.parentFragmentManager.beginTransaction().apply {
//            replace(R.id.home_fragment, messagesFragment)
//            commit()
//        }

        return inflater!!.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d(TAG, "onActivityCreated")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d(TAG, "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG, "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d(TAG, "onDestroyView")
        super.onDestroyView()
    }

    override fun onDetach() {
        Log.d(TAG, "onDetach")
        super.onDetach()
    }

    override fun onDestroy() {
        Log.d(TAG, "Destroy")
        super.onDestroy()
    }
}