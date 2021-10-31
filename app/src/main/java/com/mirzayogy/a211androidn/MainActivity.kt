package com.mirzayogy.a211androidn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val simpanButton = findViewById<Button>(R.id.simpanButton)
        val batalButton = findViewById<Button>(R.id.batalButton)

        val namaEditText = findViewById<EditText>(R.id.namaEditText)
        val numberEditText = findViewById<EditText>(R.id.numberEditText)

        simpanButton.setOnClickListener {
            val nama = namaEditText.text.toString()
            Toast.makeText(this, "Hai $nama",Toast.LENGTH_SHORT).show()
        }

        batalButton.setOnClickListener {
            var angka = numberEditText.text.toString().trim().toInt()
            angka ++
            numberEditText.setText(angka.toString())
        }
    }
}