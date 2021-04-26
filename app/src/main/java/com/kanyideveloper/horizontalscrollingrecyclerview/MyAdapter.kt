package com.kanyideveloper.horizontalscrollingrecyclerview

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kanyideveloper.horizontalscrollingrecyclerview.databinding.MyRowBinding

class MyAdapter(private val imagesList: ArrayList<Image>, private val context: Context) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    private val TAG = "MyAdapter"

    class MyViewHolder(val binding: MyRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            MyRowBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Glide.with(context)
            .load(imagesList[position].image)
            .centerCrop()
            .into(holder.binding.imageView)
        Log.d(TAG, "onBindViewHolder: $imagesList[position].image")
    }

    override fun getItemCount(): Int {
        return imagesList.size
    }
}