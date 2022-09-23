package com.mihut.monitorapp.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mihut.monitorapp.R

class OnBoarding : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)
    }

    companion object {
        fun open(context: Context) {
            context.startActivity(Intent(context, OnBoarding::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
    }


}