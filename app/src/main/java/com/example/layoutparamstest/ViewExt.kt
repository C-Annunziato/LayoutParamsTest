package com.example.layoutparamstest

import android.view.View
import android.view.animation.AnimationUtils
import androidx.interpolator.view.animation.FastOutSlowInInterpolator

fun View.slideUp(animTime: Long, startOffset: Long){
    val slideUp = AnimationUtils.loadAnimation(context, R.anim.swap_animation).apply {
        duration = animTime
        interpolator = FastOutSlowInInterpolator()
        this.startOffset = startOffset
    }
    startAnimation(slideUp)
}