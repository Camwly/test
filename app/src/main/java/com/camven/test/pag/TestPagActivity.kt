package com.camven.test.pag

import android.graphics.Matrix
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.camven.test.databinding.ActivityTestPagBinding

/**
 * pag的矩阵转换
 * @description
 * @author Created by wenjianli on 2023/3/18 11:03.
 */
class TestPagActivity : AppCompatActivity() {

    var binding:ActivityTestPagBinding?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityTestPagBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.pagView?.setOnClickListener {
//            binding?.pagView?.scaleX=-1f
            val matrix = Matrix()
            matrix.preTranslate(152f,56f)
            matrix.preScale(-1f,1f)
            binding?.pagView?.matrix=matrix
        }
        binding?.pagView?.post {
            binding?.pagView?.path = "assets://pag/ava_home_btn_share.pag"
            binding?.pagView?.setRepeatCount(-1)
            binding?.pagView?.play()
        }
    }


}