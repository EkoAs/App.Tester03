package com.example.apptester03

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNama = findViewById<EditText>(R.id.etNama)
        val btnSapa = findViewById<Button>(R.id.btnSapa)
        val tvHasil = findViewById<TextView>(R.id.tvHasil)

        btnSapa.setOnClickListener {
            val nama = etNama.text.toString()

            if (nama.isEmpty()) {
                Toast.makeText(this, "Isi nama dulu ya", Toast.LENGTH_SHORT).show()
            } else {
                tvHasil.text = "Halo, $nama! Selamat belajar Android."
            }
        }
    }
}