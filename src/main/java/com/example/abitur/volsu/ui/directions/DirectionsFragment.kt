package com.example.abitur.volsu.ui.directions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.abitur.volsu.R
import com.example.abitur.volsu.adapters.InstitutesRecAdapter
import com.example.abitur.volsu.classes.TextListItem
import com.example.abitur.volsu.ui.directions.current.CurrentDirectionFragment


class DirectionsFragment : Fragment() {

    private lateinit var directionsViewModel: DirectionsViewModel
    private lateinit var linearLayoutManager: LinearLayoutManager

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        directionsViewModel =
            ViewModelProviders.of(this).get(DirectionsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_directions, container, false)

//        val btn = root.findViewById<Button>(R.id.btn)
//        btn.setOnClickListener { v ->
//            activity!!.supportFragmentManager.beginTransaction().replace(R.id.nav_host_fragment, CurrentDirectionFragment()).commit()
//        }

        linearLayoutManager = LinearLayoutManager(context)
        val instList: RecyclerView = root.findViewById(R.id.instList);
        instList.layoutManager = linearLayoutManager
        val insts = listOf(
            TextListItem(
                "ИНСТИТУТ ЕСТЕСТВЕННЫХ НАУК", listOf(
                    "Экология и природопользование",
                    "Биоинженерия и биоинформатика",
                    "Картография и геоинформатика",
                    "Геология",
                    "География",
                    "Биология",
                    "Биотехнические системы и технологии"
                ), R.drawable.emblem_ien
            ),
            TextListItem(
                "ИНСТИТУТ УПРАВЛЕНИЯ И РЕГИОНАЛЬНОЙ ЭКОНОМИКИ", listOf(
                    "Государственное и муниципальное управление",
                    "Реклама и связи с общественностью",
                    "Иноватика",
                    "Бизнес информатика"
                ), R.drawable.emblem_iure
            ),
            TextListItem("ИНСТИТУТ ПРАВА", listOf("Юриспруденция"), R.drawable.emblem_ip),
            TextListItem(
                "ИНСТИТУТ ЭКОНОМИКИ И ФИНАНСОВ",
                listOf("Экономика", "Экономическая безопасность"),
                R.drawable.emblem_ieif
            ),
            TextListItem(
                "ИНСТИТУТ ПРИОРИТЕТНЫХ ТЕХНОЛОГИЙ", listOf(
                    "Судебной Экспертиза",
                    "Инфокомуникационные технологии и системы связи",
                    "Нано технологии и микростстемы и техника",
                    "Информационная безопасность автоматизированных систем",
                    "Информационная безопасноть бакалавры",
                    "Безопасноть информационных технологий в правоохранительной сфере"
                ), R.drawable.emblem_ipt
            ),
            TextListItem(
                "ИНСТИТУТ МАТЕМАТИКИ И ИНФОРМАЦИОННЫХ ТЕХНОЛОГИЙ",
                listOf("Прикладная Математика и Информатика", "Математика и Компьютерные Науки", "Математическое Обеспечение и Администрирование Информационных Систем",
                    "Программная Инженерия", "Информационные Системы и Технологии", "Информатика и Вычислительная Техника", "Радиотехника", "Радиофизика", "Прикладная Математика и Физика",
                    "Прикладная Информатика"),
                R.drawable.emblem_imit
            ),
            TextListItem(
                "ИНСТИТУТ ИСТОРИИ МЕЖДУНАРОДНЫХ ОТНОШЕНИЙ И СОЦИАЛЬНЫХ ТЕХНОЛОГИЙ", listOf(
                    "Международные отношения",
                    "Зарубежное регионоведение",
                    "Политология",
                    "История",
                    "Туризм",
                    "Социальная работа",
                    "Социология",
                    "Организация работы с молодежью",
                    "Психология"
                ), R.drawable.emblem_iimost
            ),
            TextListItem(
                "ИНСТИТУТ ФИЛОЛОГИИ И МЕЖКУЛЬТУРНЫХ КОМУНИКАЦИЙ", listOf(
                    "Фундаментальная и прикладная лингвистика",
                    "Лингвистика",
                    "Журналистика",
                    "Филология",
                    "Педагогическое образование",
                    "Иностранный язык и Русский язык",
                    "Русский язык и литература",
                    "Русский язык как иностранный и английский язык",
                    "Русский язык и литература",
                    "Английский язык и немецкий язык"
                ), R.drawable.emblem_ifimkk
            )
        )
        val recyclerAdapter = InstitutesRecAdapter(insts, object : InstitutesRecAdapter.Callback {
            override fun onItemClicked(item: String) {
                Toast.makeText(context, item, Toast.LENGTH_LONG).show()
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates. //
            }
        })
        instList.adapter = recyclerAdapter
        return root
    }
}