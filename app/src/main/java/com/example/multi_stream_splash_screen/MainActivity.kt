package com.example.multi_stream_splash_screen

import android.graphics.drawable.AnimatedVectorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat

class MainActivity : AppCompatActivity() {
    lateinit var logo: ImageView
    lateinit var startButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logo = findViewById(R.id.logo)
        startButton = findViewById(R.id.start_button)
        startButton.setOnClickListener {  if(logo.drawable is AnimatedVectorDrawable) {
            (logo.drawable as AnimatedVectorDrawable).start()}
        }

    }
}
