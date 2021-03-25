package com.example.comfortsound

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val go_intent1 = findViewById<Button>(R.id.Lobby_btn1)
        go_intent1.setOnClickListener{
            val intent = Intent(this@MainActivity2,wave::class.java)
            startActivity(intent)
        }

        val go_intent2 = findViewById<Button>(R.id.Lobby_btn2)
        go_intent2.setOnClickListener{
            val intent = Intent(this@MainActivity2,nature::class.java)
            startActivity(intent)
        }
    }

}