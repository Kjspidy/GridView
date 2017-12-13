package com.example.kjspidy.gridview

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import java.security.AccessControlContext

/**
 * Created by kjspidy on 13/12/17.
 */
class custom_adapter(private val getContext: Context , private val customLayoutId: Int, private val custom_item : ArrayList<customlayout>):
        ArrayAdapter<customlayout>(getContext,customLayoutId,custom_item)  {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
         val row = convertView
        val Holder : ViewHolder //for smoother scrolling of gridview

    }

    class ViewHolder
    {
    internal var img:ImageView? =null
        internal var txt:TextView?=null
    }
}

//https://www.youtube.com/watch?v=bmHFiLWH4yk&t=185s

