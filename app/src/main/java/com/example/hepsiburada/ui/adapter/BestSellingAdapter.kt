package com.example.hepsiburada.ui.adapter



import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hepsiburada.data.model.TopRankModel
import com.example.hepsiburada.databinding.ProductsListItemBinding
import com.example.hepsiburada.databinding.PromotionItemBinding

class BestSellingAdapter(var mContext: Context, var productList: List<TopRankModel>) :
    RecyclerView.Adapter<BestSellingAdapter.ViewHolder>() {

    inner class ViewHolder(var binding: ProductsListItemBinding) : RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ProductsListItemBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        holder.binding.price.text = productList[position].altBaslik

            holder.binding.productName.text = productList[position].ustBaslik
        holder.binding.image.setImageResource(
            mContext.resources.getIdentifier(
                productList[position].img,
                "drawable",
                mContext.packageName
            )
        )
    }
}