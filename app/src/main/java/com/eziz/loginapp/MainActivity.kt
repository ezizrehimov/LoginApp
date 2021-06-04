package com.eziz.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loginBtn.setOnClickListener {
            intent = Intent(applicationContext, MainMainpageActivity::class.java)
            startActivity(intent)
        }
        loginRegisterBtn.setOnClickListener {
            intent = Intent(applicationContext, MainRegisterActivity::class.java)
            startActivity(intent)
        }
    }
}