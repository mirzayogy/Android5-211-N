package com.mirzayogy.a211androidn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        getSupportActionBar()?.hide()

        Handler(Looper.getMainLooper()).postDelayed({

            val sharedPref = this.getSharedPreferences("MY_SHARED_PREFERENCES", MODE_PRIVATE)
            val username = sharedPref.getString("username", "")
            val password = sharedPref.getString("password", "")

            if(username != ""){
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
            } else {
                val intent = Intent(this,LoginActivity::class.java)
                startActivity(intent)
            }

            finish()
        }, 2000)
    }
}