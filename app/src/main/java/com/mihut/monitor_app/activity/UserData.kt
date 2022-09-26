package com.mihut.monitor_app.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mihut.monitor_app.R

class UserData : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_data)
    }

    companion object {
        fun open(context: Context) {
            context.startActivity(Intent(context, UserData::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
    }

}