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
        val t1 = TopRankModel("19,50 TL", "Market ve Su", "tablo1")
        val t2 = TopRankModel("Ödülleri Topla", "Oynadıkça Kazan", "tablo2")
        val t3 = TopRankModel("Zirveye Oyna", "Sonbahar İndirimi", "tablo3")
        val t4 = TopRankModel("%10 Net İndirim", "Premium'a Geç", "tablo4")
        val t5 = TopRankModel("3 Ay Sonra Öde", "Ev ve Yaşam", "tablo5")
        val t6 = TopRankModel("Peşin Fiyatına 6 Taksit", "Watch Ultra 2", "tablo6")
        val t7 = TopRankModel("3 Taksit Fırsatı", "iPhone 15 Pro", "tablo7")
        val t8 = TopRankModel("Büyük İndirimler", "Tekno Çarşamba", "tablo8")
        list.add(t1)
        list.add(t2)
        list.add(t3)
        list.add(t4)
        list.add(t5)
        list.add(t6)
        list.add(t7)
        list.add(t8)

        val topRankAdapter = TopRankAdapter(requireContext(), list)
        binding.topRankRv.layoutManager =
            StaggeredGridLayoutManager(4, LinearLayoutManager.VERTICAL)
        val ıtemDecoration = SpacingItemDecorator(30)
        binding.topRankRv.addItemDecoration(ıtemDecoration)
        binding.topRankRv.adapter = topRankAdapter

        var promotionList = ArrayList<TopRankModel>()

        val promotionItem1 = TopRankModel("19,50 TL", "Market ve Su", "buyuk_teklif1")
        val promotionItem2 = TopRankModel("Ödülleri Topla", "Oynadıkça Kazan", "buyuk_teklif2")
        val promotionItem3 = TopRankModel("Zirveye Oyna", "Sonbahar İndirimi", "buyuk_teklif3")
        val promotionItem4 = TopRankModel("%10 Net İndirim", "Premium'a Geç", "buyuk_teklif4")
        val promotionItem5 = TopRankModel("3 Ay Sonra Öde", "Ev ve Yaşam", "buyuk_teklif5")

        promotionList.add(promotionItem1)
        promotionList.add(promotionItem2)
        promotionList.add(promotionItem3)
        promotionList.add(promotionItem4)
        promotionList.add(promotionItem5)

        val promotionAdapter = PromotionAdapter(requireContext(), promotionList)
        binding.promotionRv.layoutManager= LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.promotionRv.adapter = promotionAdapter



        var bestSellingList = ArrayList<TopRankModel>()

        val bestSellingItem1 = TopRankModel("Airfryer", "5.990.00", "urun1")
        val bestSellingItem2 = TopRankModel("Kamp Sandalyesi", "899,99", "urun2")
        val bestSellingItem3 = TopRankModel("4k televizyon", "15.000,00", "urun3")
        val bestSellingItem4 = TopRankModel("Renkli çorap", "80,99", "urun4")
        val bestSellingItem5 = TopRankModel("iPhone 15", "43.999,99", "urun5")
        val bestSellingItem6 = TopRankModel("Koşu Ayakkabısı", "1326,99", "urun6")


        bestSellingList.add(bestSellingItem1)
        bestSellingList.add(bestSellingItem2)
        bestSellingList.add(bestSellingItem3)
        bestSellingList.add(bestSellingItem4)
        bestSellingList.add(bestSellingItem5)
        bestSellingList.add(bestSellingItem6)

        val bestSellingAdapter = BestSellingAdapter(requireContext(), bestSellingList)
        binding.productsListRv.layoutManager= LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.productsListRv.adapter = bestSellingAdapter

        var smallAdvertlist = ArrayList<TopRankModel>()
        val smallAdvert = TopRankModel("19,50 TL", "Market ve Su", "kucuk_teklif1")
        val smallAdvert2 = TopRankModel("Ödülleri Topla", "Oynadıkça Kazan", "kucuk_teklif2")
        val smallAdvert3 = TopRankModel("Zirveye Oyna", "Sonbahar İndirimi", "kucuk_teklif3")


        smallAdvertlist.add(smallAdvert)
        smallAdvertlist.add(smallAdvert2)
        smallAdvertlist.add(smallAdvert3)

        val advertAdapter = AdvertApdater(requireContext(), smallAdvertlist)
        binding.advertRv.layoutManager= LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.advertRv.adapter = advertAdapter


        var bestSellingList2 = ArrayList<TopRankModel>()

        bestSellingList2.add(bestSellingItem5)
        bestSellingList2.add(bestSellingItem6)
        bestSellingList2.add(bestSellingItem3)
        bestSellingList2.add(bestSellingItem4)
        bestSellingList2.add(bestSellingItem1)
        bestSellingList2.add(bestSellingItem2)

        val bestSellingAdapter2 = BestSellingAdapter(requireContext(), bestSellingList2)
        binding.productsListRv2.layoutManager= LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.productsListRv2.adapter = bestSellingAdapter2

        var bestSellingList3 = ArrayList<TopRankModel>()

        bestSellingList3.add(bestSellingItem3)
        bestSellingList3.add(bestSellingItem4)
        bestSellingList3.add(bestSellingItem1)
        bestSellingList3.add(bestSellingItem2)
        bestSellingList3.add(bestSellingItem5)
        bestSellingList3.add(bestSellingItem6)


        val bestSellingAdapter3 = BestSellingAdapter(requireContext(), bestSellingList3)
        binding.productsListRv3.layoutManager= LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.productsListRv3.adapter = bestSellingAdapter3


        var premiumList = ArrayList<TopRankModel>()
        val premium1 = TopRankModel("19,50 TL", "Market ve Su", "premium1")
        val premium2 = TopRankModel("Ödülleri Topla", "Oynadıkça Kazan", "premium2")
        val premium3 = TopRankModel("Zirveye Oyna", "Sonbahar İndirimi", "premium3")
        val premium4 = TopRankModel("Ödülleri Topla", "Oynadıkça Kazan", "premium4")
        val premium5 = TopRankModel("Zirveye Oyna", "Sonbahar İndirimi", "premium5")
        val premium6 = TopRankModel("Ödülleri Topla", "Oynadıkça Kazan", "premium6")
        val premium7 = TopRankModel("Zirveye Oyna", "Sonbahar İndirimi", "premium7")

        premiumList.add(premium1)
        premiumList.add(premium2)
        premiumList.add(premium3)
        premiumList.add(premium4)
        premiumList.add(premium5)
        premiumList.add(premium6)
        premiumList.add(premium7)

        val premiumCardAdapter = PremiumCardAdapter(requireContext(), premiumList)
        binding.premiumListRv.layoutManager= LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.premiumListRv.adapter = premiumCardAdapter

        val bestSellingAdapter4 = BestSellingAdapter(requireContext(), bestSellingList)
        binding.productsListRv4.layoutManager= LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.productsListRv4.adapter = bestSellingAdapter4


        binding.doubleOfferRowInclude1.image1.setImageResource(R.drawable.reklam1)
        binding.doubleOfferRowInclude1.image2.setImageResource(R.drawable.reklam2)
        binding.doubleOfferRowInclude2.image1.setImageResource(R.drawable.reklam3)
        binding.doubleOfferRowInclude2.image2.setImageResource(R.drawable.reklam4)
        binding.doubleOfferRowInclude3.image1.setImageResource(R.drawable.reklam5)
        binding.doubleOfferRowInclude3.image2.setImageResource(R.drawable.reklam6)
        binding.tenOfferInclue.image1.setImageResource(R.drawable.reklam7)
        binding.tenOfferInclue.image2.setImageResource(R.drawable.reklam8)
        binding.tenOfferInclue.image3.setImageResource(R.drawable.reklam9)
        binding.tenOfferInclue.image4.setImageResource(R.drawable.reklam10)
        binding.tenOfferInclue.image5.setImageResource(R.drawable.reklam11)
        binding.tenOfferInclue.image6.setImageResource(R.drawable.reklam12)
        binding.tenOfferInclue.image7.setImageResource(R.drawable.reklam13)
        binding.tenOfferInclue.image8.setImageResource(R.drawable.reklam14)
        binding.tenOfferInclue.image9.setImageResource(R.drawable.reklam15)
        binding.tenOfferInclue.image10.setImageResource(R.drawable.reklam16)



        return binding.root
    }

}