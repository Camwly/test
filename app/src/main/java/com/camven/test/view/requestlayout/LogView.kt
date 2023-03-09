package com.camven.test.view.requestlayout

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.util.Log
import android.view.View

/**
 * create by wenjianli
 * on 2023/3/7
 */
class LogView @JvmOverloads constructor(
    context: Context,
    attr: AttributeSet? = null,
    defRes: Int = 0
) : View(context, attr, defRes) {

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        Log.i("camvenli","LogView--onMeasure--$this")
    }


    override fun layout(l: Int, t: Int, r: Int, b: Int) {
        Log.i("camvenli","LogView--layout--viewId--$this")
        super.layout(l, t, r, b)
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        Log.i("camvenli","LogView--onLayout--viewId--$this")
        super.onLayout(changed, left, top, right, bottom)
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        Log.i("camvenli","LogView--onDraw--viewId--$this")
    }
}