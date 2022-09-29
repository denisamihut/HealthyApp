package com.mihut.healthy.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mihut.healthy.R

import kotlinx.android.synthetic.main.bmi_list.view.*
class BmiValuesListAdapter(
    private val context: Context,
    private val bmiItemList: List<BmiItem>
) : RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.bmi_list, parent, false)
        return MyViewHolder(context, listItem)
    }
    override fun getItemCount(): Int {
        return bmiItemList.size
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(bmiItemList[position])
    }
}
class MyViewHolder(val context: Context, private val view: View) : RecyclerView.ViewHolder(view) {
    fun bind(bmiItem: BmiItem) {
        view.bmi_index.text = bmiItem.bmiIndex
        view.bmi_status.text = bmiItem.bmiStatus
        if (bmiItem.isHighlighted) {
            view.list_item.setBackgroundColor(
                context.resources.getColor(android.R.color.holo_orange_dark)
            )
        }
    }
}