package com.example.kanwal_laptop.test

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed(object : Runnable {
            override fun run() {
                val startMappy = Intent(this@MainActivity, GoogleMapActivity::class.java)
                startActivity(startMappy)
                finish()
            }
        }, SPLASH_SCREEN_TIME)
    }

    companion object {
        private val SPLASH_SCREEN_TIME: Long = 2000
    }
}
