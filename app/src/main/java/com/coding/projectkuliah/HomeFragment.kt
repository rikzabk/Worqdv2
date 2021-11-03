package com.coding.projectkuliah

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerView2: RecyclerView
    private lateinit var recyclerView3: RecyclerView
    private lateinit var adapter: RecyclerAdapter

    private var titlesList = mutableListOf<String>()
    private var descList = mutableListOf<String>()
    private var imagesList = mutableListOf<Int>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val hometoolbar: Toolbar = view.findViewById(R.id.homeToolbar)
        (activity as AppCompatActivity).setSupportActionBar(hometoolbar)
        (activity as AppCompatActivity).supportActionBar?.setDisplayShowTitleEnabled(false)

        postToList()

        recyclerView = view.findViewById(R.id.rv_recycler_card)
        recyclerView2 = view.findViewById(R.id.rv_recycler_card2)
        recyclerView3 = view.findViewById(R.id.rv_recycler_card3)
        adapter = RecyclerAdapter(titlesList, descList, imagesList)

        recyclerView.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.HORIZONTAL, false)
        recyclerView2.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.HORIZONTAL, false)
        recyclerView3.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = RecyclerAdapter(titlesList, descList, imagesList)
        recyclerView2.adapter = RecyclerAdapter(titlesList, descList, imagesList)
        recyclerView3.adapter = RecyclerAdapter(titlesList, descList, imagesList)
    }

    private fun addToList(title: String, description: String, image: Int) {
        titlesList.add(title)
        descList.add(description)
        imagesList.add(image)
    }

    private fun postToList() {
        val names = ArrayList<String>()
        val nameList = arrayOf("Izdeveloper", "Whoami", "Mynameiz", "Hadouken", "Tatsumaki", "Senpuyaku")
        val descList = arrayOf("fix any ", "fix any bug and improve app in android in android studio", "develop ios app in swift", "develop android and ios app building mobile app development", "fix ios app issue in swift, objective c swiftui", "fix bugs and error in your flutter apps android and ios")
        val imgList = arrayOf(R.drawable.unsplash_satu, R.drawable.unsplash_satu, R.drawable.unsplash_dua, R.drawable.unsplash_tiga, R.drawable.unsplash_empat, R.drawable.unsplash_lima)

        for (i in 1..5) {
            addToList(nameList[i], descList[i], imgList[i])
        }
    }
}