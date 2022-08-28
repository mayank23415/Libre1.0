package com.project.libre10.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class BoldTextView (context: Context, attrs: AttributeSet) : AppCompatTextView(context, attrs) {
    init {
        applyfont()
    }

    fun applyfont() {
        val typeface = Typeface.createFromAsset(context.assets, "Poppins-ExtraBold.ttf")
        setTypeface(typeface)
    }
}