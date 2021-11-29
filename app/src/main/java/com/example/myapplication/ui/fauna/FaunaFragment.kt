package com.example.myapplication.ui.fauna

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
import com.example.myapplication.adapter.ListFaunaAdapter
import com.example.myapplication.databinding.FragmentFaunaBinding
import com.example.myapplication.ui.data.Fauna
import com.example.myapplication.ui.data.FaunaData

class FaunaFragment : Fragment() {

    private var _binding: FragmentFaunaBinding? = null
    lateinit var rvList: RecyclerView
    private var list: ArrayList<FaunaData> = arrayListOf()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFaunaBinding.inflate(inflater, container, false)
        return _binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvList = view.findViewById(R.id.rv_listfauna)
        list.addAll(Fauna.listData)
        setupRecycler()
    }

    fun setupRecycler() {
        rvList.layoutManager = LinearLayoutManager(activity)
        val listAdapter = ListFaunaAdapter(list)
        rvList.adapter = listAdapter

        listAdapter.setOnItemClickCallback(object : ListFaunaAdapter.OnItemClickCallback {
            override fun onItemClicked(data: FaunaData) {
                goToDetail(data)
            }
        })
    }


    private fun goToDetail(faunaData: FaunaData) {
        val namab = faunaData.nama
        val detailb = faunaData.detail
        val photob = faunaData.photo

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