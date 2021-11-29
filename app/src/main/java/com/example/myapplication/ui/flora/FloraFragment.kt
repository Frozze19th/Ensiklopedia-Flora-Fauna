package com.example.myapplication.ui.flora

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.DetailActivity
import com.example.myapplication.R
import com.example.myapplication.adapter.ListFloraAdapter
import com.example.myapplication.databinding.FragmentFloraBinding
import com.example.myapplication.ui.data.Flora
import com.example.myapplication.ui.data.FloraData

class FloraFragment : Fragment() {

    private var _binding: FragmentFloraBinding? = null
    lateinit var rvList: RecyclerView
    private var list: ArrayList<FloraData> = arrayListOf()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFloraBinding.inflate(inflater, container, false)
        return _binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvList = view.findViewById(R.id.rv_listiflora)
        list.addAll(Flora.listData)
        setupRecycler()
    }

    fun setupRecycler() {
        rvList.layoutManager = LinearLayoutManager(activity)
        val listAdapter = ListFloraAdapter(list)
        rvList.adapter = listAdapter

        listAdapter.setOnItemClickCallback(object : ListFloraAdapter.OnItemClickCallback {
            override fun onItemClicked(data: FloraData) {
                goToDetail(data)
            }
        })
    }


    private fun goToDetail(floraData: FloraData) {
        val namab = floraData.nama
        val detailb = floraData.detail
        val photob = floraData.photo

        val intent = Intent(activity, DetailActivity::class.java)
        intent.putExtra("nama", namab)
        intent.putExtra("detail", detailb)
        intent.putExtra("photo", photob.toString())
        startActivity(intent)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}