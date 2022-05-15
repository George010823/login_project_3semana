package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val objetoIntent: Intent = intent
        var Nombre = objetoIntent.getStringExtra("Nombre")
        var text_Saludo: TextView = findViewById(R.id.txtSaludo)
        text_Saludo.text = "Bienvenid@ $Nombre a tu app de inicio de sesión."
    }
}