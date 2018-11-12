package com.okman.exkeppermobile

import android.content.Context
import android.content.SharedPreferences

object PreferencesMannager {
    lateinit var sharedPreferences:SharedPreferences

    fun init(context: Context)
    {
        sharedPreferences = context.getSharedPreferences("exkepper",Context.MODE_PRIVATE)
    }

    fun getInt(name:String,def:Int) = sharedPreferences.getInt(name,def)

    fun putInt(name:String,value:Int) = sharedPreferences.edit().putInt(name,value).commit()


}