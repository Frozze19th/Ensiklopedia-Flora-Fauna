package com.example.myapplication.ui.data

import com.example.myapplication.R

object Identitas {

    private val identitasNames = arrayOf("Irfan Novian", "Fara Anggia Rengganis", "Nur Hidayat")

    private val identitasImages = intArrayOf(
        R.drawable.foto_nov,
        R.drawable.foto_ang,
        R.drawable.foto_day
    )

    private val identitasDetail = arrayOf("H1D018061", "H1D108039", "H1D018063")
    val listData: ArrayList<IdentitasData>
        get() {
            val list = arrayListOf<IdentitasData>()
            for (position in identitasNames.indices) {
                val identitasData = IdentitasData()
                identitasData.nama = identitasNames[position]
                identitasData.detail = identitasDetail[position]
                identitasData.photo = identitasImages[position]
                list.add(identitasData)
            }
            return list
        }
}