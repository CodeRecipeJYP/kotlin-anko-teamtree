package com.asuscomm.yangyinetwork.teamtree_kotlinanko

import android.content.Context
import android.view.ViewManager
import android.widget.ImageView
import com.asuscomm.yangyinetwork.teamtree_kotlinanko.solitaire.Card
import com.asuscomm.yangyinetwork.teamtree_kotlinanko.solitaire.GameModel
import com.asuscomm.yangyinetwork.teamtree_kotlinanko.solitaire.GamePresenter
import com.asuscomm.yangyinetwork.teamtree_kotlinanko.solitaire.cardsMap
import org.jetbrains.anko.custom.ankoView
import org.jetbrains.anko.imageResource
import org.jetbrains.anko.onClick

/**
 * Created by jaeyoung on 28/01/2018.
 */
class WastePileView(context: Context) : ImageView(context) {
    init {
        imageResource = emptyPileDrawable
        onClick {
            GamePresenter.onWasteTap()
        }
    }

    fun update() {
        val cards = GameModel.wastePile
        imageResource = if (cards.size > 0) getResIdForCard(cards.last()) else emptyPileDrawable
    }
}

fun ViewManager.wastePileView(init: WastePileView.() -> Unit = {}) =
        // it means ctx
        ankoView({ WastePileView(it) }, 0, init)