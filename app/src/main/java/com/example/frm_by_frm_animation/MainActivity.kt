package com.example.frm_by_frm_animation

import android.graphics.drawable.AnimationDrawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var img:ImageView
    lateinit var btnstart:Button
    lateinit var btnstop:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        img=findViewById(R.id.imageView)
        btnstart=findViewById(R.id.btnStart)
        btnstop=findViewById(R.id.btnStop)

        btnstart.setOnClickListener {
            val bgImg=img.background as AnimationDrawable
            bgImg.start()

        }

        btnstop.setOnClickListener {
            val bgImg=img.background as AnimationDrawable
            bgImg.stop()

        }

    }
}