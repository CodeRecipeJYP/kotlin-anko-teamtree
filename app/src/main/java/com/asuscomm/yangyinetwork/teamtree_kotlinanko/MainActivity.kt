package com.asuscomm.yangyinetwork.teamtree_kotlinanko

import android.content.Context
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.asuscomm.yangyinetwork.teamtree_kotlinanko.solitaire.*
import org.jetbrains.anko.*
import org.jetbrains.anko.custom.ankoView
import org.jetbrains.anko.custom.style


val cardBackDrawable = R.drawable.cardback_green5
val emptyPileDrawable = R.drawable.cardback_blue1
fun View.getResIdForCard(card: Card): Int {
    val resourceName = "card${card.suit}${cardsMap[card.value]}".toLowerCase()
    // We can get context from View.getContext
    return context.resources.getIdentifier(resourceName, "drawable", context.packageName)
}
// dip, displaymetrics needs Context
val Context.cardWidth: Int
        get() = (displayMetrics.widthPixels - dip(8)) / 7
val Context.cardHeight:Int
        get() = (cardWidth * (190f / 140)).toInt()


class MainActivity : AppCompatActivity(), GameView {
    var deckView: DeckView? = null
    var wastePileView: WastePileView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        GamePresenter.setGameView(this)
        GameModel.resetGame()

        verticalLayout {
            leftPadding = dip(4)
            rightPadding = dip(4)
            topPadding = dip(8)

            linearLayout {
                deckView = deckView().lparams(cardWidth, cardHeight)
                wastePileView = wastePileView().lparams(cardWidth, cardHeight)
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
        deckView!!.update()
        wastePileView!!.update()
    }
}
