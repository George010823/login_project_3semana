package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        validarCampos()
    }

    private fun validarCampos() {
        var editText_Nombre: EditText = findViewById(R.id.editText_Nombre)
        var editText_Passw: EditText = findViewById(R.id.editText_Passw)
        val buttonLogin: Button = findViewById(R.id.btn_login)
        buttonLogin.setOnClickListener(){
            if (editText_Nombre.getText().isEmpty() and  editText_Passw.getText().isEmpty()){
                Toast.makeText(this, "No se puede realizar la acción porque los campos Nombre y Contarseña son obligatorios", Toast.LENGTH_LONG).show()
            }else if (editText_Nombre.getText().isEmpty()){
                Toast.makeText(this, "No se puede realizar la acción porque el campo Nombre es obligatorio", Toast.LENGTH_LONG).show()
            }else if (editText_Passw.getText().isEmpty()){
                Toast.makeText(this, "No se puede realizar la acción porque el campo Contraseña es obligatorio", Toast.LENGTH_LONG).show()
            }else{
                var Nombre:String = editText_Nombre.text.toString()
                val intent:Intent = Intent (this, SecondActivity::class.java)
                intent.putExtra("Nombre", Nombre)
                startActivity(intent)

            }
        }
    }
}