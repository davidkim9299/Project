package com.example.project.navigation

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.project.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_comfort.*
import kotlinx.android.synthetic.main.fragment_enhance.*
import kotlinx.android.synthetic.main.fragment_grid.*
import kotlinx.android.synthetic.main.fragment_grid.enhance_bt

class EnhanceFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = LayoutInflater.from(activity).inflate(R.layout.fragment_enhance,container,false)
        return view

    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        var concentration = MediaPlayer.create(context,R.raw.concentrationo)
        var creative = MediaPlayer.create(context,R.raw.creative)
        var lts = MediaPlayer.create(context,R.raw.longstudy)
        var memorize = MediaPlayer.create(context,R.raw.memorize)
        var solving = MediaPlayer.create(context,R.raw.solving)
        var warmup = MediaPlayer.create(context,R.raw.warmingup)
        super.onActivityCreated(savedInstanceState)


        //concentration
        con_play.setOnClickListener {
            concentration.isLooping=true
            concentration.start()
        }
        con_pause.setOnClickListener {
            concentration.pause()
        }
        con_stop.setOnClickListener {
            concentration.stop()
            concentration = MediaPlayer.create(context,R.raw.concentrationo)
        }

        //creative
        cre_play.setOnClickListener {
            creative.isLooping=true
            creative.start()
        }
        cre_pause.setOnClickListener {
            creative.pause()
        }
        cre_stop.setOnClickListener {
            creative.stop()
            creative = MediaPlayer.create(context,R.raw.creative)
        }

        //long time study
        lts_play.setOnClickListener {
            lts.isLooping=true
            lts.start()
        }
        lts_pause.setOnClickListener {
            lts.pause()
        }
        lts_stop.setOnClickListener {
            lts.stop()
            lts = MediaPlayer.create(context,R.raw.longstudy)
        }

        //memorize
        mem_play.setOnClickListener {
            memorize.isLooping=true
            memorize.start()
        }
        mem_pause.setOnClickListener {
            memorize.pause()
        }
        mem_stop.setOnClickListener {
            memorize.stop()
            memorize = MediaPlayer.create(context,R.raw.memorize)
        }

        //solving
        sol_play.setOnClickListener {
            solving.isLooping=true
            solving.start()
        }
        sol_pause.setOnClickListener {
            solving.pause()
        }
        sol_stop.setOnClickListener {
            solving.stop()
            solving = MediaPlayer.create(context,R.raw.solving)
        }

        //warming-up
        wau_play.setOnClickListener {
            warmup.isLooping=true
            warmup.start()
        }
        wau_pause.setOnClickListener {
            warmup.pause()
        }
        wau_stop.setOnClickListener {
            warmup.stop()
            warmup = MediaPlayer.create(context,R.raw.warmingup)
        }


    }



}