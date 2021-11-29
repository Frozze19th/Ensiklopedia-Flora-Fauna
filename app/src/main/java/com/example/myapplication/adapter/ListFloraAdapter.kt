package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.ui.data.FloraData

class ListFloraAdapter(private val listFlora: ArrayList<FloraData>) :
    RecyclerView.Adapter<ListFloraAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgLogo = itemView.findViewById<ImageView>(R.id.img_logo)
        var tvName = itemView.findViewById<TextView>(R.id.tv_nama)
        var tvDetail = itemView.findViewById<TextView>(R.id.tv_detail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val flora = listFlora[position]

        Glide.with(holder.itemView.context)
            .load(flora.photo)
            .into(holder.imgLogo)

        holder.tvName.text = flora.nama
        holder.tvDetail.text = flora.detail

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listFlora[holder.bindingAdapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return listFlora.size
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: FloraData)
    }
}
