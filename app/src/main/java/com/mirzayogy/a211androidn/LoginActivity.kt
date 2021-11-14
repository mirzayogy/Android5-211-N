package com.mirzayogy.a211androidn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val usernameEditText = findViewById<EditText>(R.id.usernameEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val loginButton = findViewById<Button>(R.id.loginButton)
        val keluarButton = findViewById<Button>(R.id.keluarButton)

        loginButton.setOnClickListener {
            val username = "mirza.yogy@gmail.com"
            val password = "12345678"

            val usernameInput = usernameEditText.text.toString()
            val passwordInput = passwordEditText.text.toString()

            if(usernameInput == username && passwordInput == password){
                val sharedPref = this.getSharedPreferences("MY_SHARED_PREFERENCES",MODE_PRIVATE)
                with(sharedPref.edit()) {
                    putString("username", usernameInput)
                    putString("password", passwordInput)
                    apply()
                }

                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this,"Username/Password tidak sesuai",Toast.LENGTH_SHORT).show()
            }
        }

        keluarButton.setOnClickListener {
            finish()
        }
    }
}