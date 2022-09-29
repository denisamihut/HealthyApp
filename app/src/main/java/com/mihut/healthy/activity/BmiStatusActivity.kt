package com.mihut.healthy.activity

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.mihut.healthy.R
import com.mihut.healthy.adapter.BmiValuesListAdapter
import com.mihut.healthy.databinding.ActivityBmiStatusBinding
import com.mihut.healthy.viewmodel.BmiStatusActivityViewModelFactory
import com.mihut.healthy.viewmodel.BmiStatusViewModel

class BmiStatusActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBmiStatusBinding
    private lateinit var viewModel: BmiStatusViewModel
    private var computedBmiValue: Double = 0.0
    private lateinit var viewModelFactory: BmiStatusActivityViewModelFactory

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_bmi_status)
        computedBmiValue = intent.getDoubleExtra("BMI_Value", 0.0)
        binding.bmiValue.text = computedBmiValue.toString()
        binding.bmiValuesTable.layoutManager = LinearLayoutManager(this)
        viewModelFactory = BmiStatusActivityViewModelFactory(computedBmiValue)
        viewModel =
            ViewModelProvider(this, viewModelFactory)[BmiStatusViewModel::class.java]
        viewModel.bmiValuesListLiveData.observe(this) { bmiValuesList ->
            binding.bmiValuesTable.adapter =
                BmiValuesListAdapter(applicationContext, bmiValuesList)
            (binding.bmiValuesTable.adapter as BmiValuesListAdapter).notifyDataSetChanged()
        }
    }
}