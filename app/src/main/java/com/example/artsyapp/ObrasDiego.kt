package com.example.artsyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ObrasDiego : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_obras_diego)

        val bvolver= findViewById<Button>(R.id.bvolver1)
        bvolver.setOnClickListener {
            finish()
        }

        val bObraf1= findViewById<Button>(R.id.descripcionobraf1)
        bObraf1.setOnClickListener {
            var intent = Intent(this, Obrad1::class.java)
            startActivity(intent)
        }
        val bObraf2= findViewById<Button>(R.id.descripcionobraf2)
        bObraf2.setOnClickListener {
            var intent = Intent(this, Obrad2::class.java)
            startActivity(intent)
        }
        val bObraf3= findViewById<Button>(R.id.descripcionobraf3)
        bObraf3.setOnClickListener {
            var intent = Intent(this, Obrad3::class.java)
            startActivity(intent)
        }
        val bObraf4= findViewById<Button>(R.id.descripcionobraf4)
        bObraf4.setOnClickListener {
            var intent = Intent(this, Obrad4::class.java)
            startActivity(intent)
        }
        val bObraf5= findViewById<Button>(R.id.descripcionobraf5)
        bObraf5.setOnClickListener {
            var intent = Intent(this, Obrad5::class.java)
            startActivity(intent)
        }
        val bObraf6= findViewById<Button>(R.id.descripcionobraf6)
        bObraf6.setOnClickListener {
            var intent = Intent(this, Obrad6::class.java)
            startActivity(intent)
        }
    }
}