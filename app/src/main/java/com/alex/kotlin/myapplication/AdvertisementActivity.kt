package com.alex.kotlin.myapplication

import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.support.annotation.RequiresApi
import android.support.v7.app.AppCompatActivity
import android.view.View

class AdvertisementActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advertis)

        val options =
            View.SYSTEM_UI_FLAG_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
        window.decorView.systemUiVisibility = options
        window.statusBarColor = Color.TRANSPARENT
        window.navigationBarColor = Color.TRANSPARENT
        supportActionBar?.hide()
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
        }, 2000)

    }
}
