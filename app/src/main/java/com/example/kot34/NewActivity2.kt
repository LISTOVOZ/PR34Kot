package com.example.kot34

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NewActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new2)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val data = listOf("Item 1", "Item 2", "Item 3") // Список данных
        val adapter = MyAdapter(data)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}