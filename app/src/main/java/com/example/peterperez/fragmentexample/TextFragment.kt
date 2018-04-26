package com.example.peterperez.fragmentexample

import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.peterperez.fragmentexample.R.id.textView1
import kotlinx.android.synthetic.main.text_fragment.*


/**
 * Created by Peter Perez on 2/8/2018.
 */
class TextFragment: Fragment() {

    override fun onCreateView(inflater:LayoutInflater?,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.text_fragment, container, false)
    }
    fun changeTextProperties(fontsize: Int, text: String){
        textView1.textSize = fontsize.toFloat()
        textView1.text = text
    }
}