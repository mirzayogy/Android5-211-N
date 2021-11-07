package com.mirzayogy.a211androidn

import android.content.Intent
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
        val phoneEditText = findViewById<EditText>(R.id.phoneEditText)
        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val tanggalEditText = findViewById<EditText>(R.id.tanggalEditText)
        val numberEditText = findViewById<EditText>(R.id.numberEditText)

        simpanButton.setOnClickListener {

            val nama = namaEditText.text.toString()
            val phone = phoneEditText.text.toString()
            val email = emailEditText.text.toString()
            val tanggal = tanggalEditText.text.toString()
            val number = numberEditText.text.toString()

            Toast.makeText(this, "Hai $nama",Toast.LENGTH_SHORT).show()

            val intent = Intent(this,HasilActivity::class.java)
            intent.putExtra("nama_extra",nama)
            intent.putExtra("phone_extra",phone)
            intent.putExtra("email_extra",email)
            intent.putExtra("tanggal_extra",tanggal)
            intent.putExtra("number_extra",number)
            startActivity(intent)
        }

        batalButton.setOnClickListener {
            var angka = numberEditText.text.toString().trim().toInt()
            angka ++
            numberEditText.setText(angka.toString())
        }
    }
}