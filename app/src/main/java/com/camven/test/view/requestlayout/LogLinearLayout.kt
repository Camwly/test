package com.camven.test.view.requestlayout

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.LinearLayout

/**
 * create by wenjianli
 * on 2023/3/9
 */
class LogLinearLayout @JvmOverloads constructor(
    content: Context,
    attr: AttributeSet? = null,
    defRes: Int = 0
) : LinearLayout(content, attr, defRes) {

    override fun measureChildWithMargins(
        child: View?,
        parentWidthMeasureSpec: Int,
        widthUsed: Int,
        parentHeightMeasureSpec: Int,
        heightUsed: Int
    ) {
        Log.i("camvenli","measure-child:$child")
        super.measureChildWithMargins(
            child,
            parentWidthMeasureSpec,
            widthUsed,
            parentHeightMeasureSpec,
            heightUsed
        )

    }
}