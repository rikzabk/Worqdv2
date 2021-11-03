package com.coding.projectkuliah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnPindah : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        // intent
        Handler().postDelayed({
            val intent = Intent(this@MainActivity, WelcomePage::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}