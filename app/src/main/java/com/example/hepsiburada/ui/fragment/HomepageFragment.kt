package com.example.hepsiburada.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.get
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.hepsiburada.R
import com.example.hepsiburada.data.model.TopRankModel
import com.example.hepsiburada.databinding.FragmentHomepageBinding
import com.example.hepsiburada.ui.adapter.AdvertApdater
import com.example.hepsiburada.ui.adapter.BestSellingAdapter
import com.example.hepsiburada.ui.adapter.PremiumCardAdapter
import com.example.hepsiburada.ui.adapter.PromotionAdapter
import com.example.hepsiburada.ui.adapter.TopRankAdapter
import com.example.hepsiburada.ulits.SpacingItemDecorator


class HomepageFragment : Fragment() {

    private lateinit var binding: FragmentHomepageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomepageBinding.inflate(layoutInflater)


        var list = ArrayList<TopRankModel>()
        val t1 = TopRankModel("19,50 TL", "Market ve Su", "asda")
        list.add(t1)
        list.add(t1)
        list.add(t1)
        list.add(t1)
        list.add(t1)
        list.add(t1)
        list.add(t1)
        list.add(t1)

        val topRankAdapter = TopRankAdapter(requireContext(), list)
        binding.topRankRv.layoutManager =
            StaggeredGridLayoutManager(4, LinearLayoutManager.VERTICAL)
        val ıtemDecoration = SpacingItemDecorator(30)
        binding.topRankRv.addItemDecoration(ıtemDecoration)
        binding.topRankRv.adapter = topRankAdapter

        var list2 = ArrayList<TopRankModel>()
        list2.add(t1)
        list2.add(t1)
        list2.add(t1)

        val promotionAdapter = PromotionAdapter(requireContext(), list2)
        binding.promotionRv.layoutManager= LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.promotionRv.adapter = promotionAdapter


        var list3 = ArrayList<TopRankModel>()
        list3.add(t1)
        list3.add(t1)
        list3.add(t1)

        val bestSellingAdapter = BestSellingAdapter(requireContext(), list3)
        binding.productsListRv.layoutManager= LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.productsListRv.adapter = bestSellingAdapter

        val advertAdapter = AdvertApdater(requireContext(), list3)
        binding.advertRv.layoutManager= LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.advertRv.adapter = advertAdapter

        val bestSellingAdapter2 = BestSellingAdapter(requireContext(), list3)
        binding.productsListRv2.layoutManager= LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.productsListRv2.adapter = bestSellingAdapter2


        val bestSellingAdapter3 = BestSellingAdapter(requireContext(), list3)
        binding.productsListRv3.layoutManager= LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.productsListRv3.adapter = bestSellingAdapter3




        var list4 = ArrayList<TopRankModel>()
        list4.add(t1)
        list4.add(t1)
        list4.add(t1)

        val premiumCardAdapter = PremiumCardAdapter(requireContext(), list4)
        binding.premiumListRv.layoutManager= LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.premiumListRv.adapter = premiumCardAdapter

        val bestSellingAdapter4 = BestSellingAdapter(requireContext(), list3)
        binding.productsListRv4.layoutManager= LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.productsListRv4.adapter = bestSellingAdapter4




        return binding.root
    }

}