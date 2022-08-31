package com.project.libre10.Activities

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar
import com.project.libre10.R

open class BaseActivity : AppCompatActivity() {

    fun showErrorSnackBar(message: String, errorMessage: Boolean) {
        val snackBar = Snackbar.make(findViewById(android.R.id.content), message, Snackbar.LENGTH_LONG)
        val snackBarView = snackBar.view

        if(errorMessage) {
            snackBarView.setBackgroundColor(
                ContextCompat.getColor(this@BaseActivity, R.color.ImperialRed)
            )
        }else {
            snackBarView.setBackgroundColor(
                ContextCompat.getColor(this@BaseActivity, R.color.Emerald)
            )
        }
        snackBar.show()
    }
}