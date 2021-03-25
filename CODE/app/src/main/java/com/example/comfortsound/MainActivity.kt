package com.example.comfortsound

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val go_intent = findViewById<Button>(R.id.main_btn)
            go_intent.setOnClickListener{
                val intent = Intent(this@MainActivity,MainActivity2::class.java)
                startActivity(intent)
            }
    }
}