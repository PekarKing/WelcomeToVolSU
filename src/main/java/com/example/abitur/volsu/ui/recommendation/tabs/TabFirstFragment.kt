package com.example.abitur.volsu.ui.recommendation.tabs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.abitur.volsu.R
import com.example.abitur.volsu.adapters.ProfessionRecAdapter

/**
 * A simple [Fragment] subclass.
 */

class TabFirstFragment: Fragment() {

    private lateinit var linearLayoutManager: LinearLayoutManager

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.tab_fragment_first, container, false)

        linearLayoutManager = LinearLayoutManager(context)
        val profList: RecyclerView = root.findViewById(R.id.profList)
        profList.layoutManager = linearLayoutManager
        val profArr = listOf(
            "Агент банка",
            "Агент рекламный",
            "Агент страховой",
            "Агроэколог, сельскохозяйственный эколог",
            "Адвокат",
            "Администратор баз данных",
            "Актуарий",
            "Аналитик в области информационной безопасности (security researcher)",
            "Аналитик данных (Data Analyst)",
            "Аналитик компьютерных систем",
            "Андеррайтер",
            "Архитектор живых систем",
            "Архитектор интеллектуальных систем управления беспилотного транспорта",
            "Архитектор информационных систем",
            "Архитектор медицинского оборудования",
            "Асессор, специалист по ассессменту",
            "Аудитор",
            "Банковский служащий",
            "Бизнес-аналитик (специалист по бизнес-процессам)",
            "Бизнес-информатик",
            "Математик",
            "Big Data Analyst: специалист по анализу больших данных",
            "Data Mining Specialist: специалист по интеллектуальной обработке данных",
            "Data Scientist: учёный по данным, исследователь данных",
            "DevOps-инженер",
            "Digital-стратег",
            "ERP-консультант",
            "Event-менеджер (менеджер развлечений)",
            "GR-менеджер",
            "HR-аналитик",
            "HR-специалист",
            "IT-директор (CIO)",
            "IT-специалист",
            "PR-менеджер",
            "Talent-менеджер (менеджер по управлению талантами)",
            "T&D-менеджер, L&D-менеджер (Training and Development, Learning and Development)",
            "Web-программист"
        )
        val profAd = ProfessionRecAdapter(profArr, object : ProfessionRecAdapter.Callback {
            override fun onItemClicked(item: String) {
//                Toast.makeText(context, item, Toast.LENGTH_LONG).show()
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates. //
            }
        })
        profList.adapter = profAd

        return root
    }
}