package com.example.currencyrate.screens.second

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.currencyrate.R
import com.example.currencyrate.model.second.SecondModelItem

class SecondAdapter : RecyclerView.Adapter<SecondAdapter.SecondViewHolder>() {

    private var list = emptyList<SecondModelItem>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)

        return SecondViewHolder(view)
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        holder.name.text = list[position].ccy
        holder.buy.text = list[position].buy
        holder.sale.text = list[position].sale

    }

    override fun getItemCount() = list.size

    inner class SecondViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView = itemView.findViewById(R.id.nameCurrency)
        val buy: TextView = itemView.findViewById(R.id.buyCurrency)
        val sale: TextView = itemView.findViewById(R.id.saleCurrency)
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setData(list: List<SecondModelItem>) {
        this.list = list
        notifyDataSetChanged()
    }
}