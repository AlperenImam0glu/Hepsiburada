package com.example.hepsiburada.ui.adapter



import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hepsiburada.data.model.TopRankModel
import com.example.hepsiburada.databinding.BestSellingItemBinding
import com.example.hepsiburada.databinding.PromotionItemBinding

class BestSellingAdapter(var mContext: Context, var productList: List<TopRankModel>) :
    RecyclerView.Adapter<BestSellingAdapter.ViewHolder>() {

    inner class ViewHolder(binding: BestSellingItemBinding) : RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = BestSellingItemBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }
}