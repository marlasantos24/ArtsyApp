package com.example.artsyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Pintores : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pintores)

        val bFrida= findViewById<Button>(R.id.obrasf)
        bFrida.setOnClickListener {
            var intent = Intent(this, ObrasFrida::class.java)
            startActivity(intent)
        }

        val bPablo= findViewById<Button>(R.id.obrasp)
        bPablo.setOnClickListener {
            var intent = Intent(this, ObrasPablo::class.java)
            startActivity(intent)
        }
        val bLeonardo= findViewById<Button>(R.id.obrasl)
        bLeonardo.setOnClickListener {
            var intent = Intent(this, ObrasLeonardo::class.java)
            startActivity(intent)
        }
        val bVicent= findViewById<Button>(R.id.obrasv)
        bVicent.setOnClickListener {
            var intent = Intent(this, ObrasVincent::class.java)
            startActivity(intent)
        }
        val bDiego= findViewById<Button>(R.id.obrasd)
        bDiego.setOnClickListener {
            var intent = Intent(this, ObrasDiego::class.java)
            startActivity(intent)
        }
        val bFrancisco= findViewById<Button>(R.id.obrasfco)
        bFrancisco.setOnClickListener {
            var intent = Intent(this, ObrasFrancisco::class.java)
            startActivity(intent)
        }
    }
}