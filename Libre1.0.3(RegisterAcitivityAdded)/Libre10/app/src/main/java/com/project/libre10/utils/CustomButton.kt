package com.project.libre10.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton

class CustomButton (context:Context, attrs:AttributeSet) : AppCompatButton(context, attrs){
    init{
        applyfont()
    }

    fun applyfont() {
        val typeface = Typeface.createFromAsset(context.assets, "Poppins-Bold.ttf")
        setTypeface(typeface)
    }
}