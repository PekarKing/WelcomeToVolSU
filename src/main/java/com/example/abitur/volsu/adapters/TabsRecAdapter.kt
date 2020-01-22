package com.example.abitur.volsu.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.abitur.volsu.ui.recommendation.tabs.TabFirstFragment
import com.example.abitur.volsu.ui.recommendation.tabs.TabSecondFragment

class TabsRecAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                TabFirstFragment()
            }
            else -> {
                return TabSecondFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "По профессии"
            else -> {
                return "По баллам ЕГЭ"
            }
        }
    }
}