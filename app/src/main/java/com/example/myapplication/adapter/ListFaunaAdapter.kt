package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.ui.data.FaunaData

class ListFaunaAdapter(private val listFauna: ArrayList<FaunaData>) :
    RecyclerView.Adapter<ListFaunaAdapter.ListViewHolder>() {

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
        val fauna = listFauna[position]

        Glide.with(holder.itemView.context)
            .load(fauna.photo)
            .into(holder.imgLogo)

        holder.tvName.text = fauna.nama
        holder.tvDetail.text = fauna.detail

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listFauna[holder.bindingAdapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return listFauna.size
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: FaunaData)
    }
}
