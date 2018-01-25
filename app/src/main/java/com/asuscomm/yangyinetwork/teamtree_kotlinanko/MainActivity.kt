package com.asuscomm.yangyinetwork.teamtree_kotlinanko

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var counter = 0
        relativeLayout {
            val tv_counter = textView {
                text = "0"
                // Float -> SP unit
                textSize = 24f
            }
            button {
                onClick {
                    counter++
                    tv_counter.text = counter.toString()
                }
                // Default wrap_content if u want another, use optional lparams
            }.lparams {
                // inline fun LayoutParams.below(view: View): Unit = addRule(BELOW, view.id)
                // View.id should be needed
                below(tv_counter)
            }
        }
    }
}
