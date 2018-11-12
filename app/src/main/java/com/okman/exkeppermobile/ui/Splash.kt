package com.okman.exkeppermobile.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import com.okman.exkeppermobile.R

class Splash :AppCompatActivity() {
    val handler = Handler()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)
        handler.postDelayed({
            startActivity(Intent(Splash@this, MainActivity::class.java))
            finish()
        },3000)
    }
}