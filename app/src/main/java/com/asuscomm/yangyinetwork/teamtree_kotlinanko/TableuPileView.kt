package com.asuscomm.yangyinetwork.teamtree_kotlinanko

import android.content.Context
import android.view.ViewManager
import android.widget.RelativeLayout
import com.asuscomm.yangyinetwork.teamtree_kotlinanko.solitaire.FoundationPile
import com.asuscomm.yangyinetwork.teamtree_kotlinanko.solitaire.GameModel
import com.asuscomm.yangyinetwork.teamtree_kotlinanko.solitaire.GamePresenter
import org.jetbrains.anko.*
import org.jetbrains.anko.custom.ankoView

/**
 * Created by jaeyoung on 28/01/2018.
 */
// _RelativeLayout -> for lparams
class TableuPileView(context: Context, val index: Int) : _RelativeLayout(context) {
    init {
        addViews()
    }

    fun update() {
        removeAllViews()
        addViews()
    }

    private fun addViews() {
        val cards = GameModel.tableauPiles[index].cards
        cards.forEachIndexed { i, card ->
            imageView {
                y = (i * dip(25)).toFloat()
                imageResource = if (card.faceUp) getResIdForCard(card) else cardBackDrawable
                onClick {
                    GamePresenter.onTableauTap(index, i)
                }
            }.lparams(context.cardHeight, context.cardWidth)
        }
    }
}

fun ViewManager.tableauPileView(index: Int, init: TableuPileView.() -> Unit = {}) =
        ankoView({ TableuPileView(it, index) }, 0, init)