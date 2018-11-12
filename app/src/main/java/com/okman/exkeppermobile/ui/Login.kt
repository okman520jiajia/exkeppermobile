package com.okman.exkeppermobile.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.okman.exkeppermobile.R
import kotlinx.android.synthetic.main.login.*

class Login :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        close.setOnClickListener {
            finish()
        }
    }
}