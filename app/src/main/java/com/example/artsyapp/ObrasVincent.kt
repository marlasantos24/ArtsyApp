package com.example.artsyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ObrasVincent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_obras_vincent)

        val bvolver= findViewById<Button>(R.id.bvolver1)
        bvolver.setOnClickListener {
            finish()
        }
    }
}