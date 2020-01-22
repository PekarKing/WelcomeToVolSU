package com.example.abitur.volsu.ui.recommendation.tabs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.abitur.volsu.R
import com.example.abitur.volsu.adapters.EgeRecAdapter
import com.example.abitur.volsu.classes.EgeItem

/**
 * A simple [Fragment] subclass.
 */

class TabSecondFragment: Fragment() {

    private lateinit var linearLayoutManager: LinearLayoutManager

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.tab_fragment_second, container, false)

        val firstItem: Spinner = root.findViewById(R.id.fisrtItem)
        val secItem: Spinner = root.findViewById(R.id.secItem)
        val thirdItem: Spinner = root.findViewById(R.id.thirdItem)
        var spinnerDirList = arrayOf("Профильная Математика", "Русский язык", "Информатика")
        val spinAd = ArrayAdapter(root.context, android.R.layout.simple_spinner_item, spinnerDirList)

        firstItem.adapter = spinAd
        secItem.adapter = spinAd
        thirdItem.adapter = spinAd

        linearLayoutManager = LinearLayoutManager(context)
        val directEgeList: RecyclerView = root.findViewById(R.id.directEgeList)
        directEgeList.layoutManager = linearLayoutManager
        val dirArr = listOf(
            EgeItem("Прикладная Математика и Информатика", 210),
            EgeItem("Математика и Компьютерные Науки", 170),
            EgeItem("Математическое Обеспечение и Администрирование Информационных Систем", 165),
            EgeItem("Информационные Системы и Технологии", 178),
            EgeItem("Прикладная Информатика", 162)
        )
        val dirAd = EgeRecAdapter(dirArr, object : EgeRecAdapter.Callback {
            override fun onItemClicked(item: String) {
//                Toast.makeText(context, item, Toast.LENGTH_LONG).show()
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates. //
            }
        })
        directEgeList.adapter = dirAd

        return root
    }
}