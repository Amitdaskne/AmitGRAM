package com.amitgram.app

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.feedBtn).setOnClickListener {
            Toast.makeText(this, "Feed Coming Soon", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.reelsBtn).setOnClickListener {
            Toast.makeText(this, "Reels Coming Soon", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.chatBtn).setOnClickListener {
            Toast.makeText(this, "Chat Coming Soon", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.profileBtn).setOnClickListener {
            Toast.makeText(this, "Profile Coming Soon", Toast.LENGTH_SHORT).show()
        }
    }
}
