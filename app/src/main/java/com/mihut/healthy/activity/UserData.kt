package com.mihut.healthy.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mihut.healthy.R

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