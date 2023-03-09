package com.camven.test.view.requestlayout

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.camven.test.R

/**
 * 测试子view布局变化后，直接parent.requestlayout，能不能直接更新子view布局.
 * 结论：
 * parent.requestlayout是否能影响触发子view的onmeasure和onlayout取决于不同的parent的onmeasure和onlayout的实现，
 * LinearLayout的能触发子view的onmeasure和onlayout，如果子view布局或者大小发生变化的话。但是Constraintlayout则不能，看其onmeasure的实现即可发现原因。
 * create by wenjianli
 * on 2023/3/9
 */
class TestRequestLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_request_layout)
        findViewById<TextView>(R.id.tv_click).setOnClickListener {
            val lp1  =findViewById<View>(R.id.v_1).layoutParams as? LinearLayout.LayoutParams
            lp1?.leftMargin=100
//            lp1?.width=50
            findViewById<View>(R.id.cl_container).requestLayout()
        }
    }

}