package com.eziz.loginapp

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var preferences: SharedPreferences
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        preferences = getSharedPreferences("info", MODE_PRIVATE)
        loginBtn.setOnClickListener {
            var username = preferences.getString("username", "")
            var password = preferences.getString("password", "")

            var loginUsername1 = loginUsername.text.toString()
            var loginPassword1 = loginPassword.text.toString()

            if ((username == loginUsername1) && (password == loginPassword1)) {
                intent = Intent(applicationContext, MainMainpageActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(applicationContext, "Məlumatlarda xəta var", Toast.LENGTH_LONG)
                    .show()
            }
        }
        loginRegisterBtn.setOnClickListener {
            intent = Intent(applicationContext, MainRegisterActivity::class.java)
            startActivity(intent)
        }
    }
}