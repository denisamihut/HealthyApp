package com.mihut.monitorapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mihut.monitorapp.R
import com.mihut.monitorapp.activity.ui.main.UserDataFragment

class UserData : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_data)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, UserDataFragment.newInstance())
                .commitNow()
        }
    }
}