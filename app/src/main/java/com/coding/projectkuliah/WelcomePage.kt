package com.coding.projectkuliah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class WelcomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_page)

        supportActionBar?.hide()

        val wp_btn: ImageButton = findViewById(R.id.welcome_page_button)

        // intent
        wp_btn.setOnClickListener {
            val intent2 = Intent(this@WelcomePage, LoginActivity::class.java)
            startActivity(intent2)
            finish()
        }
    }
}