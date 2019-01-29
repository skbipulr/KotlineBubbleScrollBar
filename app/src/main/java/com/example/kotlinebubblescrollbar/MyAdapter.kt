package com.example.kotlinebubblescrollbar

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class MyAdapter(internal var listData:List<String>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {
    val view = LayoutInflater.from(p0.context).inflate(R.layout.layout_item,p0,false);
    return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    override fun onBindViewHolder(p0: MyViewHolder, p1: Int) {
        p0.txt_name.text = listData[p1]
    }

    class MyViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){

        var txt_name:TextView
        init{
            txt_name = itemView.findViewById(R.id.txt_name) as TextView
        }
    }
}