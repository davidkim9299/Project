package com.ComfortSound.project.navigation

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ComfortSound.project.R
import kotlinx.android.synthetic.main.fragment_comfort.*

class ComfortFragment : Fragment() {
    var raining : MediaPlayer? = null
    var woodburn : MediaPlayer? = null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var fragmentview =LayoutInflater.from(activity).inflate(R.layout.fragment_comfort, container, false)
        return fragmentview
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        raining = MediaPlayer.create(context,R.raw.raining)
        woodburn = MediaPlayer.create(context,R.raw.woodburn)
        super.onActivityCreated(savedInstanceState)
        rain_play.setOnClickListener {
            raining?.isLooping=true
            raining?.start()
        }
        rain_pause.setOnClickListener {
            raining?.pause()
        }
        rain_stop.setOnClickListener {
            raining?.stop()
            raining = MediaPlayer.create(context,R.raw.raining)
        }

        wood_play.setOnClickListener {
            woodburn?.isLooping=true
            woodburn?.start()
        }
        wood_pause.setOnClickListener {
            woodburn?.pause()
        }
        wood_stop.setOnClickListener {
            woodburn?.stop()
            woodburn = MediaPlayer.create(context,R.raw.woodburn)
        }

    }

    override fun onDestroy() {
        raining?.stop()
        raining?.release()
        woodburn?.stop()
        woodburn?.release()

        super.onDestroy()
    }


}
