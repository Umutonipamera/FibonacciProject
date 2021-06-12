package com.example.fibonacciseries

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class NumberRecyclerViewAdapter (var numberList: List<BigInteger>):RecyclerView.Adapter<NumberViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder{
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.number_list_items,parent ,false)
        return NumberViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.tvNumbers.text = numberList.get(position).toString()
    }
    override fun getItemCount(): Int {
       return numberList.size
    }

}

class NumberViewHolder(val itemView:View):RecyclerView.ViewHolder(itemView){
    var tvNumbers=itemView.findViewById<TextView>(R.id.tvNumbers)
}