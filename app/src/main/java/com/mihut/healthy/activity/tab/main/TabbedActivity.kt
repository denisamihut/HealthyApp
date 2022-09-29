package com.mihut.healthy.activity.tab.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mihut.healthy.databinding.ActivityTabbedBinding

class TabbedActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTabbedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTabbedBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}