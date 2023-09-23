package com.example.recyclerviewconcept

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewconcept.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binder:ActivityMainBinding
    private lateinit var newRecycle:RecyclerView
    private lateinit var newsArrayList:ArrayList<News>
    lateinit var imageid:Array<Int>
    lateinit var heading:Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binder = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binder.root)

        binder.recycle.setOnClickListener{
        }

        imageid = arrayOf(
            R.drawable.img_1,
            R.drawable.img_2,
            R.drawable.img_3,
            R.drawable.img_4,
            R.drawable.img_1,
            R.drawable.img_2,
            R.drawable.img_3,
            R.drawable.img_4,
            R.drawable.img_1,
            R.drawable.img_2,
            R.drawable.img_3,
            R.drawable.img_4
        )

        heading = arrayOf(
            "My attitude depends on my actions.",
            "People think I'm BAD, but the truth is I'm WORST.",
            "My attitude depends on my actions.",
            "I'm just trying to explain that I'm right. ...",
            "My attitude depends on my actions.",
            "People think I'm BAD, but the truth is I'm WORST.",
            "My attitude depends on my actions.",
            "I'm just trying to explain that I'm right. ...",
            "My attitude depends on my actions.",
            "People think I'm BAD, but the truth is I'm WORST.",
            "My attitude depends on my actions.",
            "I'm just trying to explain that I'm right. ..."

        )

        newRecycle = findViewById(R.id.recycle)
        newRecycle.layoutManager=LinearLayoutManager(this)
        newRecycle.setHasFixedSize(true)

        newsArrayList= arrayListOf<News>()
        getUserData()
    Log.d("MainActivity","Debuging is in Process ")
    }

    private fun getUserData() {
        for (i in imageid.indices){

            val news=News(imageid[i],heading[i])
            newsArrayList.add(news)
        }

        newRecycle.adapter=MyAdapter(newsArrayList)
    }
}