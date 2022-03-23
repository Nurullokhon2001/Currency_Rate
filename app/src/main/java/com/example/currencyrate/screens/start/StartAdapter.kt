package com.example.currencyrate.screens.start

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.currencyrate.R
import com.example.currencyrate.model.start.StartModelItem

class StartAdapter : RecyclerView.Adapter<StartAdapter.StartViewHolder>() {

    private var list = emptyList<StartModelItem>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)

        return StartViewHolder(view)
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        holder.name.text = list[position].ccy
        holder.buy.text = list[position].buy
        holder.sale.text = list[position].sale

    }

    override fun getItemCount() = list.size

    inner class StartViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView = itemView.findViewById(R.id.nameCurrency)
        val buy: TextView = itemView.findViewById(R.id.buyCurrency)
        val sale: TextView = itemView.findViewById(R.id.saleCurrency)
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setData(list: List<StartModelItem>) {
        this.list = list
        notifyDataSetChanged()
        Log.e("adapter",list.size.toString())
    }
}