package com.eziz.loginapp

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_register.*

class MainRegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_register)
        registerSave.setOnClickListener {
            var username = registerUsername.text.toString()
            var password = registerPassword.text.toString()
            var SharedPreferences = this.getSharedPreferences("info", MODE_PRIVATE)
            var editor = SharedPreferences.edit()

            editor.putString("usernama", "$username").apply()
            editor.putString("password", "$password").apply()
            Toast.makeText(applicationContext, "Successful", Toast.LENGTH_LONG).show()
            registerUsername.text.clear()
            registerPassword.text.clear()


            intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
        registerGoBack.setOnClickListener {
            intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
}