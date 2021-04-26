package com.kanyideveloper.horizontalscrollingrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecycler()
    }

    private fun initRecycler() {
        val adapter = MyAdapter(imagesList(), applicationContext)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = adapter
    }

    companion object {
        fun imagesList(): ArrayList<Image> {
            val imagesArrayList: ArrayList<Image> = arrayListOf()
            imagesArrayList.add(Image("https://m.media-amazon.com/images/M/MV5BZDA5ZGVkZGMtNzk1My00YTU5LTgxYWUtODBlYmQyZjRjZjg4XkEyXkFqcGdeQXVyMTE5MTkxMDI2._V1_.jpg"))
            imagesArrayList.add(Image("https://upload.wikimedia.org/wikipedia/en/thumb/e/e0/Rogue_City.jpg/220px-Rogue_City.jpg"))
            imagesArrayList.add(Image("https://wallpaper-house.com/data/out/10/wallpaper2you_444080.jpg"))
            imagesArrayList.add(Image("https://wallpaper-house.com/data/out/10/wallpaper2you_444082.jpg"))
            imagesArrayList.add(Image("https://wallpaper-house.com/data/out/10/wallpaper2you_424904.jpg"))
            imagesArrayList.add(Image("https://wallpaper-house.com/data/out/12/wallpaper2you_482398.jpg"))
            imagesArrayList.add(Image("https://wallpaper-house.com/data/out/10/wallpaper2you_444083.jpg"))
            return imagesArrayList
        }
    }
}