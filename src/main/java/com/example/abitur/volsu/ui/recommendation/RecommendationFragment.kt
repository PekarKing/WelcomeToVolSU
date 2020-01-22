package com.example.abitur.volsu.ui.recommendation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.viewpager.widget.ViewPager
import com.example.abitur.volsu.R
import com.example.abitur.volsu.adapters.TabsRecAdapter
import com.google.android.material.tabs.TabLayout

class RecommendationFragment : Fragment() {

    private lateinit var recommendationViewModel: RecommendationViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        recommendationViewModel =
            ViewModelProviders.of(this).get(RecommendationViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_recommendation, container, false)

        val fragmentAdapter = TabsRecAdapter(childFragmentManager)
        val viewPagerRec: ViewPager = root.findViewById(R.id.viewPagerRec)
        viewPagerRec.adapter = fragmentAdapter
        val tabsRec: TabLayout = root.findViewById(R.id.tabsRec)
        tabsRec.setupWithViewPager(viewPagerRec)
        return root
    }
}