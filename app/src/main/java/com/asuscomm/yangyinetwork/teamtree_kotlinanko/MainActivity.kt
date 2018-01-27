package com.asuscomm.yangyinetwork.teamtree_kotlinanko

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.asuscomm.yangyinetwork.teamtree_kotlinanko.solitaire.GameModel
import com.asuscomm.yangyinetwork.teamtree_kotlinanko.solitaire.GameView
import org.jetbrains.anko.*
import org.jetbrains.anko.custom.style


val cardBackDrawable = R.drawable.cardback_green5
val emptyPileDrawable = R.drawable.cardback_blue1

class MainActivity : AppCompatActivity(), GameView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val cardWidth = (displayMetrics.widthPixels - dip(8)) / 7
        val cardHeight:Int = (cardWidth * (190f / 140)).toInt()

        // LinearLayout orientation already set vertical
        verticalLayout {
            leftPadding = dip(4)
            rightPadding = dip(4)
            // Compatible
//            setPadding(dip(4), 0, dip(4), 0)
            // Fails because paddingLeft is "val"
//            paddingLeft = dip(4)


            linearLayout {
                imageView(imageResource = cardBackDrawable).lparams(width = cardWidth, height = cardHeight)
                imageView(imageResource = emptyPileDrawable).lparams(width = cardWidth, height = cardHeight)
                view().lparams(cardWidth, 0)
                for (i in 0..3) {
                    imageView(imageResource = emptyPileDrawable).lparams(cardWidth, cardHeight)
                }
            }
            linearLayout {

            }
        }
    }

    override fun update(gameModel: GameModel) {

    }
}
