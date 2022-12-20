package org.codepath.prework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.helloButton)

        button.setOnClickListener {
            changeMeme()
            Log.v("Hello World", "Button clicked!")
            val emoji = when ((0..5).random()) {
                1 -> "\uD83E\uDD23"
                2 -> "\uD83D\uDE0B"
                3 -> "\uD83E\uDD73"
                4 -> "\uD83E\uDD2A"
                else -> "\uD83E\uDD29"
            }
            Toast.makeText(this, emoji, Toast.LENGTH_SHORT).show()
        }
    }

    private fun changeMeme() {

        val meme = when ((0..11).random()) {
            1 -> R.drawable.chatgpt
            2 -> R.drawable.decade
            3 -> R.drawable.resource_null
            4 -> R.drawable.deprecated
            5 -> R.drawable.emoji
            6 -> R.drawable.googlechat
            7 -> R.drawable.developer
            8 -> R.drawable.market
            9 -> R.drawable.over
            10 -> R.drawable.ram
            else -> R.drawable.sleep
        }

        val imageView = findViewById<ImageView>(R.id.aboutMeImageView)
        imageView.setImageResource(meme)
    }
}