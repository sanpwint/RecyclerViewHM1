package com.example.recyclerviewhm1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var thingsArray = ArrayList<Things>()

        thingsArray.add(Things("Siddharth Nigam","Posted",R.drawable.images))
        thingsArray.add(Things("James Nether","posted",R.drawable.image))

        var thingsAdapter = ThingsAdapter(thingsArray)

        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = thingsAdapter
    }
}
