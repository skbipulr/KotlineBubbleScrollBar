package com.example.kotlinebubblescrollbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import com.trendyol.bubblescrollbarlib.BubbleTextProvider
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder
import java.util.*

class MainActivity : AppCompatActivity() {

    internal  var listData:MutableList<String> = ArrayList()

    internal lateinit var layoutManager:LinearLayoutManager
   
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()

        //View
       recycler_view.setHasFixedSize(true)
        layoutManager = LinearLayoutManager(this)
        recycler_view.layoutManager = layoutManager
        recycler_view.addItemDecoration(DividerItemDecoration(this,layoutManager.orientation))

        Collections.sort(listData)
        recycler_view.adapter = MyAdapter(listData)
        bublle_scroll.attachToRecyclerView(recycler_view)

        bublle_scroll.bubbleTextProvider = BubbleTextProvider {
            position->StringBuilder(listData[position].substring(0,1)).toString()
        }
    }

    private fun initData() {
        listData.add("Bipul")
        listData.add("Juthi")
        listData.add("Bal")
        listData.add("Chagol choda")
        listData.add("Hol")
        listData.add("Ripon")
        listData.add("Nayem")
        listData.add("Poritos")
        listData.add("Ruhul")
        listData.add("Romiz")
        listData.add("Noath")

        listData.add("Machidd")
        listData.add("Ethan")
        listData.add("Sophia")
        listData.add("Jacob")
        listData.add("Ava")
        listData.add("Michael")
        listData.add("Emily")
        listData.add("Ball")

        listData.add("Cachidd")
        listData.add("Wthan")
        listData.add("Pophia")
        listData.add("Oacob")
        listData.add("Ava")
        listData.add("Tichael")
        listData.add("Vily")
        listData.add("Saall")
    }
}
