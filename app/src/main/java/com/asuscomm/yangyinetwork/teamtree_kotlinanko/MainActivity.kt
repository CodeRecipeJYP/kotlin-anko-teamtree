package com.asuscomm.yangyinetwork.teamtree_kotlinanko

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.jetbrains.anko.*
import org.jetbrains.anko.custom.style

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var counter = 0
//        3. we can assign
        val r1 = relativeLayout(theme = 0, init = {})

        // 1. (init = RelativeLayout.() -> Unit?
        // _RelativeLayout extends RelativeLayout
        // Layouts.kt -> lparams extension function with bunch of _layout
//        _RelativeLayout

        // 2. Activity.relativeLayout
        // relativeLayout -> cmd+b
//        inline fun Activity.relativeLayout(theme: Int = 0): android.widget.RelativeLayout = relativeLayout(theme) {}
//        first type of relateiveLayout(theme = 0) -> empty init function
//        return ankoView(`$$Anko$Factories$Sdk15ViewGroup`.RELATIVE_LAYOUT, theme) { init() }
//        it returns new ankoView Instance
//        RELATIVELAYOUT -> cmd+b
//        val RELATIVE_LAYOUT = { ctx: Context -> _RelativeLayout(ctx) }
//        It's just the anonymous function returning relativeLayout
//        Third init: T.() -> Unit): T

    }
}
