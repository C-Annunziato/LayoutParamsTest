package com.example.layoutparamstest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.children
import java.util.Collections

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val tv1: TextView = findViewById(R.id.tv_1)
        val tv2: TextView = findViewById(R.id.tv_2)
        val imageView: ImageView = findViewById(R.id.image_view)

        val linearLayout: ConstraintLayout = findViewById(R.id.layout)

        imageView.setOnClickListener {
            linearLayout.apply {
                val children = children.toMutableList()
//        removeAllViews()
//        for(child in children.asReversed()) {
//            addView(child)
//        }
                removeView(tv1)
                removeView(tv2)
                addView(tv2)
                addView(tv1)

                tv1.slideUp(1000L, 0L)
//                Collections.swap(children, 0, 1)
//                for (child in children) {
//                    addView(child.apply { slideUp(1000L, 0L) })

                }
            }
        }
    }