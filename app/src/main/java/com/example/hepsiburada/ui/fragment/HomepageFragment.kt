package com.example.hepsiburada.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.hepsiburada.R
import com.example.hepsiburada.data.model.TopRankModel
import com.example.hepsiburada.databinding.FragmentHomepageBinding
import com.example.hepsiburada.ui.adapter.TopRankAdapter
import com.example.hepsiburada.ulits.SpacingItemDecorator


class HomepageFragment : Fragment() {

    private lateinit var binding : FragmentHomepageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomepageBinding.inflate(layoutInflater)


        var list = ArrayList<TopRankModel>()
        val t1 = TopRankModel("19,50 TL","Market ve Su","asda")
        list.add(t1)
        list.add(t1)
        list.add(t1)
        list.add(t1)
        list.add(t1)
        list.add(t1)
        list.add(t1)
        list.add(t1)
        val adapter = TopRankAdapter(requireContext(),list)
        binding.topRankRv.layoutManager = StaggeredGridLayoutManager(4, LinearLayoutManager.VERTICAL)
        val ıtemDecoration = SpacingItemDecorator(30)
        binding.topRankRv.addItemDecoration(ıtemDecoration)
        binding.topRankRv.adapter = adapter


        return binding.root
    }

}