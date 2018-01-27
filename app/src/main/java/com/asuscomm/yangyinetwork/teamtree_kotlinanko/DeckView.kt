package com.asuscomm.yangyinetwork.teamtree_kotlinanko

import android.content.Context
import android.util.Log
import android.view.ViewManager
import android.widget.ImageView
import com.asuscomm.yangyinetwork.teamtree_kotlinanko.solitaire.GameModel
import com.asuscomm.yangyinetwork.teamtree_kotlinanko.solitaire.GamePresenter
import org.jetbrains.anko.custom.ankoView
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
        Log.d("DeckView", cards.toString())
        imageResource = if (cards.size > 0) cardBackDrawable else emptyPileDrawable
    }
}

val DECKVIEW_FACTORY = { ctx: Context -> DeckView(ctx) }
// DeckView.() means extensionfunction of DeckView
fun ViewManager.deckView(init: DeckView.() -> Unit = {}) =
        ankoView(DECKVIEW_FACTORY, 0, init)