package com.example.abitur.volsu.ui.directions.current

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toolbar
import androidx.lifecycle.Observer

import com.example.abitur.volsu.R
import com.example.abitur.volsu.ui.instructions.InstructionViewModel

class CurrentDirectionFragment  : Fragment() {

    private lateinit var instructionViewModel: InstructionViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        instructionViewModel =
            ViewModelProviders.of(this).get(InstructionViewModel::class.java)
        val root = inflater.inflate(R.layout.current_direction_fragment, container, false)
//        val toolbar = root.findViewById<Toolbar>(R.id.toolbar)
        return root
    }
}
