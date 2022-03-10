package com.example.artsyapp

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

        val nombreUsuario = findViewById<EditText>(R.id.usuario)
        val contraseña = findViewById<EditText>(R.id.contraseña)
        val bEntrar = findViewById<Button>(R.id.bIngresar)

        bEntrar.setOnClickListener {
            val nUsuario = nombreUsuario.getText().toString()
            val pass:String = contraseña.getText().toString()
            if(nUsuario.equals("marla24") && pass.equals("mssc")) {
                var intent = Intent(this, PintoresFamosos::class.java)
                startActivity(intent)
                Toast.makeText(this, "Ingreso Correctamente", Toast.LENGTH_SHORT).show()
            } else if(!nUsuario.equals("marla24")){
                Toast.makeText(this, "Usuario Incorrecto", Toast.LENGTH_SHORT).show()
            } else if(!pass.equals("mssc")){
                Toast.makeText(this, "Contraseña Incorrecto", Toast.LENGTH_SHORT).show()
            } else{
                Toast.makeText(this, "Usuario y contraseña Incorrectos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}