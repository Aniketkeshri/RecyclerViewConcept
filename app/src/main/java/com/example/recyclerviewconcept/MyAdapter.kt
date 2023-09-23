package com.example.recyclerviewconcept

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(private val newsList: ArrayList<News>):RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

//<News> this is the data class
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.itemlist,
            parent, false)
        return MyViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
      val currentItem=newsList[position]
    holder.titleImage.setImageResource(currentItem.titleImage)
    holder.heading.text=currentItem.heading
    }

    override fun getItemCount(): Int {
        return newsList.size
    }
    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    val titleImage:ShapeableImageView=itemView.findViewById(R.id.shapeableImageView)
        val heading:TextView=itemView.findViewById(R.id.heading)
    }
}


