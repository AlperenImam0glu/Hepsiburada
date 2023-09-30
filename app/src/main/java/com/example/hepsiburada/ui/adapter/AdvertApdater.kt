package com.example.hepsiburada.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hepsiburada.data.model.TopRankModel
import com.example.hepsiburada.databinding.AdvertRowItemBinding
import com.example.hepsiburada.databinding.PromotionItemBinding

class AdvertApdater(var mContext: Context, var productList: List<TopRankModel>) :
    RecyclerView.Adapter<AdvertApdater.ViewHolder>() {

    inner class ViewHolder(var binding: AdvertRowItemBinding) : RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = AdvertRowItemBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.image.setImageResource(
            mContext.resources.getIdentifier(
                productList[position].img,
                "drawable",
                mContext.packageName
            )
        )
    }
}