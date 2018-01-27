package com.asuscomm.yangyinetwork.teamtree_kotlinanko

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.jetbrains.anko.*
import org.jetbrains.anko.custom.style

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val cardWidth = (displayMetrics.widthPixels - dip(8)) / 7
        val cardHeight:Int = (cardWidth * (190f / 140)).toInt()

        verticalLayout {
            // LinearLayout orientation already set vertical
            linearLayout {
                imageView (imageResource = R.drawable.cardback_green5).lparams {
                    width = cardWidth
                    height = cardHeight
                }
            }
            linearLayout {

            }
        }
    }
}
