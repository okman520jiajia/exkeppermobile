package com.okman.exkeppermobile

import android.app.Application

class ExKepperApp :Application() {

    override fun onCreate() {
        super.onCreate()
        PreferencesMannager.init(this)
    }
}