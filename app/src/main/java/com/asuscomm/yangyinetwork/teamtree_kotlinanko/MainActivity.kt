package com.asuscomm.yangyinetwork.teamtree_kotlinanko

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counter = 0
        btn_counter.setOnClickListener {
            counter++
            tv_counter.text = counter.toString()
        }
    }
}
