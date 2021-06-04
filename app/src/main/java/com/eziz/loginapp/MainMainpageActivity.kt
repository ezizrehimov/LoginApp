package com.eziz.loginapp

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_mainpage.*

class MainMainpageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var preferences: SharedPreferences
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_mainpage)
        preferences = getSharedPreferences("info", MODE_PRIVATE)
        var username = preferences.getString("username", "")
        var password = preferences.getString("password", "")

        mainUsernameInfo.text = "İstifadəçi adı : " + username.toString()
        mainUsernamePassword.text = "Şifrə : " + password.toString()

        mainBtnLogOut.setOnClickListener {
            intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
}