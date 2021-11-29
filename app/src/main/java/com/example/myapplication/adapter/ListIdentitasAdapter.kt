package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.ui.data.IdentitasData

class ListIdentitasAdapter(private val listIdentitas: ArrayList<IdentitasData>) :
    RecyclerView.Adapter<ListIdentitasAdapter.ListViewHolder>() {

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
        val identitas = listIdentitas[position]

        Glide.with(holder.itemView.context)
            .load(identitas.photo)
            .into(holder.imgLogo)

        holder.tvName.text = identitas.nama
        holder.tvDetail.text = identitas.detail

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listIdentitas[holder.bindingAdapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return listIdentitas.size
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: IdentitasData)
    }
}
