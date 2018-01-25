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

        var counter = 0

        relativeLayout {
//            Activity.ankoView <- extension Function
            val button: Button = button { }
//            1. return this.ankoView(`$$Anko$Factories$Sdk15View`.BUTTON, theme) { init() }
            // in this scope "this" means ViewManager (== _RelativeLayout)
//            inline fun <T : View> ViewManager.ankoView(factory: (ctx: Context) -> T, theme: Int, init: T.() -> Unit): T {
//

//            2. val ctx = ...
//            val view = factory(ctx)
//            view.init()
//            this.addView(this, view)
//            // "this" means _RelatieLayout in this scope
//            return view // <- TextView

//           relativeLayout { val button: Button = button { } } <- This is init()
            // Recursively val ctx = ...
//            val view = factory(ctx)
//            view.init() // <- it cause recursively to call higher-order function
//            this.addView(this, view) // <- Attached on activity
//            return view // <- return RelativeLayout itself

        }

    }
}
