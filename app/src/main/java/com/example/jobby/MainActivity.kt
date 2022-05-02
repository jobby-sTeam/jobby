package com.example.jobby

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {
    private lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.supportActionBar?.hide()
        handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            startActivity(Intent(this,Inicio::class.java))
            this.finish()
        },3500)


    }
}