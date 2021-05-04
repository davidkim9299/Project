package com.example.project.navigation

import android.media.MediaPlayer
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.project.R
import kotlinx.android.synthetic.main.fragment_comfort.*
import kotlinx.android.synthetic.main.fragment_grid.*

class ComfortFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = LayoutInflater.from(activity).inflate(R.layout.fragment_comfort,container,false)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        var raining = MediaPlayer.create(context,R.raw.raining)
        var woodburn = MediaPlayer.create(context,R.raw.woodburn)
        super.onActivityCreated(savedInstanceState)
        rain_play.setOnClickListener {
            raining.isLooping=true
            raining.start()
        }
        rain_pause.setOnClickListener {
            raining.pause()
        }
        rain_stop.setOnClickListener {
            raining.stop()
            raining = MediaPlayer.create(context,R.raw.raining)
        }

        wood_play.setOnClickListener {
            woodburn.isLooping=true
            woodburn.start()
        }
        wood_pause.setOnClickListener {
            woodburn.pause()
        }
        wood_stop.setOnClickListener {
            woodburn.stop()
            woodburn = MediaPlayer.create(context,R.raw.woodburn)
        }
    }


}
