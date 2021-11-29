package com.example.myapplication

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_detail)
        val foto = findViewById<ImageView>(R.id.img_detailImg)
        val nama = findViewById<TextView>(R.id.tv_detailName)
        val detail = findViewById<TextView>(R.id.tv_detail)
        val newFoto = intent.getStringExtra("photo")!!.toInt()
        val newNama = intent.getStringExtra("nama")
        val newDetail = intent.getStringExtra("detail")
        title = newNama
        foto.setImageResource(newFoto)
        nama.text = newNama
        detail.text = newDetail
    }
}