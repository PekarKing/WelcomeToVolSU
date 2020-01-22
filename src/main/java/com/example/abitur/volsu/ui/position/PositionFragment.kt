package com.example.abitur.volsu.ui.position

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.abitur.volsu.R

class PositionFragment : Fragment() {

    private lateinit var positionViewModel: PositionViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        positionViewModel =
            ViewModelProviders.of(this).get(PositionViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_position, container, false)


        return root
    }
}