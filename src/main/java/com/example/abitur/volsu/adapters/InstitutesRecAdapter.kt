package com.example.abitur.volsu.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.abitur.volsu.R
import com.example.abitur.volsu.classes.TextListItem


class InstitutesRecAdapter(var items: List<TextListItem>, val callback: Callback) : RecyclerView.Adapter<InstitutesRecAdapter.MainHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
            = MainHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_fragment_institute, parent, false))

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        holder.bind(items[position])
    }

    inner class MainHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val testText = itemView.findViewById<TextView>(R.id.testText)
        private val imageView = itemView.findViewById<ImageView>(R.id.instImg)
        private lateinit var linearLayoutManager: LinearLayoutManager

        fun bind(item: TextListItem) {
            val myIcon = itemView.resources.getDrawable(item.image)
            testText.text = item.institute
            imageView.setImageDrawable(myIcon)
            val directList = itemView.findViewById<RecyclerView>(R.id.directList)
            linearLayoutManager = LinearLayoutManager(itemView.context)
            directList.layoutManager = linearLayoutManager
            val list = item.directions
            val recyclerAdapter = DirectionsRecAdapter(list,  object : DirectionsRecAdapter.Callback {
                override fun onItemClicked(item: String) {
                    Toast.makeText(itemView.context, item, Toast.LENGTH_LONG).show()                }
            })
            directList.adapter = recyclerAdapter

//            testText.setOnClickListener {
//                if (adapterPosition != RecyclerView.NO_POSITION) callback.onItemClicked(items[adapterPosition])
//            }
        }
    }

    interface Callback {
        fun onItemClicked(item: String)
    }

}