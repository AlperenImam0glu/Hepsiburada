package com.example.hepsiburada.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hepsiburada.data.model.TopRankModel
import com.example.hepsiburada.databinding.TopRanksItemBinding

class TopRankAdapter(var mContext: Context,var productList :List<TopRankModel>) : RecyclerView.Adapter<TopRankAdapter.ViewHolder>(){

    inner class ViewHolder(binding: TopRanksItemBinding): RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = TopRanksItemBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return  productList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }
}