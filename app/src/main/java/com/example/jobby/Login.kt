package com.example.jobby

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        this.supportActionBar?.hide()
    }
}