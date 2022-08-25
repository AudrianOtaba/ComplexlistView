package com.example.customlistview

import android.icu.text.Normalizer2
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       var listview=findViewById<ListView>(R.id.listView)
        var list= mutableListOf<Model>()


        list.add(Model("Lenovo","Lenovo is one of the machines",R.drawable.image1))
        list.add(Model("Hp","Hp is a machine with the best working speed",R.drawable.image2))
        list.add(Model("Dell","Dell is the ever best office machine",R.drawable.image3))
        list.add(Model("iPhone","Iphones are machines developed in China",R.drawable.image4))
        list.add(Model("Microsoft Surface laptop","Machine that was developed in Kenya",R.drawable.image5))
        list.add(Model("ProMax","Developed by a Promax company",R.drawable.image6))


        listview.adapter=MyAdapter(this,R.layout.row,list)

    }
}