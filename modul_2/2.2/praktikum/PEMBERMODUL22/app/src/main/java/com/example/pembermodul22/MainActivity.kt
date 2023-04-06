package com.example.pembermodul22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

    }
    private fun init(){
        recyclerView = findViewById(R.id.recycler_view)
        var data = ArrayList<judul>()
        data.add(judul(R.drawable.lmp,"Little Magacal Piya", "Fantasi"))
        data.add(judul(R.drawable.madielief,"Madielief", "Thriller"))
        data.add(judul(R.drawable.ouat,"Once Upon a Time", "Thriller"))
        data.add(judul(R.drawable.tlm,"The Lost Memories", "Fantasi"))
        data.add(judul(R.drawable.za,"Zodiaque Academy", "Fantasi"))
        data.add(judul(R.drawable.lmp,"Little Magacal Piya", "Fantasi"))
        data.add(judul(R.drawable.madielief,"Madielief", "Thriller"))
        data.add(judul(R.drawable.ouat,"Once Upon a Time", "Thriller"))
        data.add(judul(R.drawable.tlm,"The Lost Memories", "Fantasi"))
        data.add(judul(R.drawable.za,"Zodiaque Academy", "Fantasi"))
        data.add(judul(R.drawable.lmp,"Little Magacal Piya", "Fantasi"))
        data.add(judul(R.drawable.madielief,"Madielief", "Thriller"))
        data.add(judul(R.drawable.ouat,"Once Upon a Time", "Thriller"))
        data.add(judul(R.drawable.tlm,"The Lost Memories", "Fantasi"))
        data.add(judul(R.drawable.za,"Zodiaque Academy", "Fantasi"))

        adapter = MyAdapter(data)
    }
}