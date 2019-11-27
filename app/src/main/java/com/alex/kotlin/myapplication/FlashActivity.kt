package com.alex.kotlin.myapplication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v4.app.ActivityOptionsCompat
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_flash.*

class FlashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flash)

        Handler().postDelayed({
            val option = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this,
                img_logo, getString(R.string.app_name)
            )
            startActivity(Intent(this, AdvertisementActivity::class.java), option.toBundle())
        }, 2000)
    }
}
