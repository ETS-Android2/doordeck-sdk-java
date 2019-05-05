package com.doordeck.sdk.ui


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.doordeck.sdk.R
import com.doordeck.sdk.common.manager.Doordeck

internal open class BaseActivity : AppCompatActivity() {

    // setup the theme in the activities that extends this one
    private fun getCurrentTheme(): Int {
        val darkMode = Doordeck.darkMode
        return if (darkMode) {
            R.style.darkTheme
        } else {
            R.style.lightTheme
        }
    }

    public override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(getCurrentTheme())
        super.onCreate(savedInstanceState)
    }
}
