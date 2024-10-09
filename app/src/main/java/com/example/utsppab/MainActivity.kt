package com.example.utsppab

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val btnLogin = findViewById<Button>(R.id.btnlogin)
        btnLogin.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("USERNAME", intent.getStringExtra("USERNAME"))
            startActivity(intent)
        }
    }
}