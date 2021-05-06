package com.ComfortSound.project.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ComfortSound.project.R
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.fragment_grid.*


class GridFragment : Fragment()  {
    lateinit var mAdView : AdView
    var firestore : FirebaseFirestore? = null
    var fragmentView : View? = null
    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?):View? {

        fragmentView = LayoutInflater.from(activity).inflate(R.layout.fragment_grid,container,false)
        //firestore = FirebaseFirestore.getInstance()
        //fragmentView?.gridfragment_recyclerview?.adapter = UserFragmentRecyclerViewAdapter()
        //fragmentView?.gridfragment_recyclerview?.layoutManager = GridLayoutManager(activity,3)


        return fragmentView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        enhance_bt.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.main_content,EnhanceFragment())?.commit()
        }
        comfort_bt.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.main_content,ComfortFragment())?.commit()
        }

        mAdView = fragmentView!!.findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

    }
}


