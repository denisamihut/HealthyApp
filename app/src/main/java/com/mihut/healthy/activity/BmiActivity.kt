package com.mihut.healthy.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.mihut.healthy.R
import com.mihut.healthy.databinding.ActivityMainBinding
import com.mihut.healthy.viewmodel.MainViewModel

class BmiActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_main
        )
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        binding.computeBmiButton.setOnClickListener {
            viewModel.computeBmi(
                binding.weightEditText.text.toString(),
                binding.heightEditText.text.toString()
            )
        }
        viewModel.validationMessageLiveData.observe(this) { errorMessage ->
            showToastMessage(errorMessage)
        }
        viewModel.bmiLiveData.observe(this) { bmiValue ->
            launchChartActivity(bmiValue)
        }
    }
    private fun showToastMessage(message: String?) {
        Toast.makeText(
            applicationContext,
            message,
            LENGTH_LONG
        ).show()
    }
    private fun launchChartActivity(bmiValue: Double) {
        val intent = Intent(this@BmiActivity, BmiStatusActivity::class.java)
        intent.putExtra("BMI_Value", bmiValue)
        startActivity(intent)
    }

    companion object {
        fun open(context: Context) {
            context.startActivity(Intent(context, BmiActivity::class.java))
        }
    }
    override fun onResume() {
        super.onResume()
    }
}