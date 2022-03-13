package com.example.artsyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Obral1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_obral1)

        val bRegresar1= findViewById<Button>(R.id.regresar1)
        bRegresar1.setOnClickListener {
            finish()
        }
    }
}