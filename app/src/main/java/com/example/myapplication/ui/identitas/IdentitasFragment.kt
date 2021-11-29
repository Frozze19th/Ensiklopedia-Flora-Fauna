package com.example.myapplication.ui.identitas

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
import com.example.myapplication.adapter.ListIdentitasAdapter
import com.example.myapplication.databinding.FragmentIdentitasBinding
import com.example.myapplication.ui.data.Identitas
import com.example.myapplication.ui.data.IdentitasData

class IdentitasFragment : Fragment() {
    private var _binding: FragmentIdentitasBinding? = null
    lateinit var rvList: RecyclerView
    private var list: ArrayList<IdentitasData> = arrayListOf()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentIdentitasBinding.inflate(inflater, container, false)
        return _binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvList = view.findViewById(R.id.rv_listidentitas)
        list.addAll(Identitas.listData)
        setupRecycler()
    }

    fun setupRecycler() {
        rvList.layoutManager = LinearLayoutManager(activity)
        val listAdapter = ListIdentitasAdapter(list)
        rvList.adapter = listAdapter

        listAdapter.setOnItemClickCallback(object : ListIdentitasAdapter.OnItemClickCallback {
            override fun onItemClicked(data: IdentitasData) {
                goToDetail(data)
            }
        })
    }


    private fun goToDetail(floraData: IdentitasData) {
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
