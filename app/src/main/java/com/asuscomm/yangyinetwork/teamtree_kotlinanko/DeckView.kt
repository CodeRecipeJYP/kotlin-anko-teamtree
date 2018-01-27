package com.asuscomm.yangyinetwork.teamtree_kotlinanko

import android.content.Context
import android.widget.ImageView
import com.asuscomm.yangyinetwork.teamtree_kotlinanko.solitaire.GameModel
import com.asuscomm.yangyinetwork.teamtree_kotlinanko.solitaire.GamePresenter
import org.jetbrains.anko.imageResource
import org.jetbrains.anko.onClick

/**
 * Created by jaeyoung on 28/01/2018.
 */

class DeckView(context: Context) : ImageView(context) {
    init {
        imageResource = cardBackDrawable
        onClick {
            GamePresenter.onDeckTap()
        }
    }

    fun update() {
        val cards = GameModel.deck.cardsInDeck
        imageResource = if (cards.size > 0) cardBackDrawable else emptyPileDrawable
    }
}
