package com.example.abitur.volsu.ui.instructions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.abitur.volsu.R

class InstructionFragment : Fragment() {

    private lateinit var instructionViewModel: InstructionViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        instructionViewModel =
            ViewModelProviders.of(this).get(InstructionViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_instruction, container, false)
        val textView: TextView = root.findViewById(R.id.text_notifications)
        instructionViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}