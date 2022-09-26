package com.mihut.monitor_app.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mihut.monitor_app.R

class BmiDetailsFragment : Fragment() {

    //2
    companion object {

        fun newInstance(): BmiDetailsFragment {
            return BmiDetailsFragment()
        }
    }

    //3
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_bmi_details, container, false)
    }

}