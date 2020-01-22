package com.example.abitur.volsu.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.abitur.volsu.R

class ProfessionRecAdapter(var items: List<String>, val callback: Callback) : RecyclerView.Adapter<ProfessionRecAdapter.MainHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
            = MainHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_fragment_professions, parent, false))

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        holder.bind(items[position])
    }

    inner class MainHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val textProf = itemView.findViewById<TextView>(R.id.textProf)

        fun bind(item: String) {
            textProf.text = item
//            textDirect.setOnClickListener {
//                if (adapterPosition != RecyclerView.NO_POSITION) callback.onItemClicked(items[adapterPosition])
//            }
        }
    }

    interface Callback {
        fun onItemClicked(item: String)
    }

}