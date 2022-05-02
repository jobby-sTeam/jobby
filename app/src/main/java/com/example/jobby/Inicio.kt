package com.example.jobby

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Inicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)
        this.supportActionBar?.hide()
        findViewById<Button>(R.id.btnCuenta).setOnClickListener {
            startActivity(Intent(this,Crearcuenta::class.java))
        }
        findViewById<Button>(R.id.btnSesion).setOnClickListener {
            startActivity(Intent(this,Login::class.java))
        }
    }
}