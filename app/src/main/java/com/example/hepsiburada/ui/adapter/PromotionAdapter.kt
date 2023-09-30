package com.example.hepsiburada.ui.adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hepsiburada.data.model.TopRankModel
import com.example.hepsiburada.databinding.PromotionItemBinding

class PromotionAdapter(var mContext: Context, var productList: List<TopRankModel>) :
    RecyclerView.Adapter<PromotionAdapter.ViewHolder>() {

    inner class ViewHolder(var binding: PromotionItemBinding) : RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = PromotionItemBinding.inflate(LayoutInflater.from(mContext), parent, false)
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