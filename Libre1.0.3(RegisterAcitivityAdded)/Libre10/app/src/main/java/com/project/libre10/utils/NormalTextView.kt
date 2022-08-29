package com.project.libre10.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class NormalTextView (context: Context, attrs: AttributeSet) : AppCompatTextView(context, attrs) {
    init {
        applyfont()
    }

    fun applyfont() {
        val typeface = Typeface.createFromAsset(context.assets, "Poppins-Light.ttf")
        setTypeface(typeface)
    }
}