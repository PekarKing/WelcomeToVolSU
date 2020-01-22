package com.example.abitur.volsu.adapters

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.abitur.volsu.R
import com.example.abitur.volsu.classes.EgeItem

class EgeRecAdapter(var items: List<EgeItem>, val callback: Callback) : RecyclerView.Adapter<EgeRecAdapter.MainHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
            = MainHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_fragment_ege_directions, parent, false))

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        holder.bind(items[position])
    }

    inner class MainHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val textDirect = itemView.findViewById<TextView>(R.id.textListEge)
        private val textDirectBalls = itemView.findViewById<TextView>(R.id.textDirBalls)

        fun bind(item: EgeItem) {
            textDirect.text = item.name
            textDirectBalls.text = item.balls.toString()
            if (item.balls > 172){
                textDirectBalls.setTextColor(Color.parseColor("#ffff4444"))
            } else {
                textDirectBalls.setTextColor(Color.parseColor("#ff99cc00"))
            }
//            textDirect.setOnClickListener {
//                if (adapterPosition != RecyclerView.NO_POSITION) callback.onItemClicked(items[adapterPosition])
//            }
        }
    }

    interface Callback {
        fun onItemClicked(item: String)
    }

}